package org.eleusoft.jsonread.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

class ServiceLoader
{
	static final boolean debug;
	static { 
		debug = getBooleanSysProp("org.eleusoft.jsonread.service.ServiceLoader.debug") ||
			getBooleanSysProp("eleusoft.boot.sl.ServiceLoader.debug")
   		 || getBooleanSysProp("com.eleusoft.boot.sl.ServiceLoader.debug") 
         ||  getBooleanSysProp("eleusoft.boot.debug");
		if(debug) debug("in Debug mode");
	}

    public Object getService(Class serviceClass, String[] defaultProviders)
    {
        final ArrayList providers = new ArrayList();

        try
        {
            // for junit
            final String clazz = System.getProperty(serviceClass.getName());
            if (clazz != null) providers.add(clazz);
        }
        catch (SecurityException se)
        {
            // ignore
        	if (debug) debug("Could not read system property");
        }

        final InputStream is = ServiceLoader.class.getResourceAsStream("/META-INF/services/" + serviceClass.getName());
        if (is != null)
        {
            BufferedReader br = null;
            try
            {
                br = new BufferedReader(new InputStreamReader(is));
                String line = br.readLine();
                while (line != null)
                {
                    String tl = line.trim();
                    if (tl.length() == 0 || tl.startsWith("#"))
                    {
                    	if (debug) debug("Skip comment or empty: " + tl);
                        // skip comment or empty
                    }
                    else
                    {
                    	if (debug) debug("Add provider " + tl);
                        providers.add(tl);
                    }
                    line = br.readLine();
                }
            }
            catch (IOException e)
            {
                // ignore
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    if (br != null)
                        br.close();
                    else
                        is.close();
                }
                catch (IOException e)
                {
                    // ignore.
                }
            }
        }
        for(int i=0,len=defaultProviders.length;i<len;i++)
        {
            providers.add(defaultProviders[i]);
        }
        
        final Iterator i = providers.iterator();
        Object temp = null;
        while (temp == null && i.hasNext())
        {
            String provider = (String) i.next();
            try
            {
                temp = Class.forName(provider).newInstance();
                if (serviceClass.isAssignableFrom(temp.getClass())==false)
                    throw new ClassCastException("Not a " + serviceClass + " but " + temp.getClass());
                break;
            }
            catch(NoClassDefFoundError e)
            {
                // ignore
            	if (debug) e.printStackTrace();
            }
            catch (Throwable t)
            {
            	if (debug) t.printStackTrace();

            }
        }

        if (temp == null)
            throw new RuntimeException("No " + serviceClass.getName() +" available");

        return temp;
    }

    static void debug(String msg)
	{
		System.out.println("ServiceLoader of JsonRead: " + msg);
	}


	private static boolean getBooleanSysProp(String name)
	{
		return Boolean.getBoolean(name);
	}
}