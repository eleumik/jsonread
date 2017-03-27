package org.eleusoft.jsonread;

import org.eleusoft.jsonread.service.JsonReadProviderLoader;

import junit.framework.TestCase;

public class TestDefImpl extends TestCase
{
	public void testDefImpl() throws Exception
	{
		try
		{
			JsonReadProvider o = JsonReadProviderLoader.getInstance();
			fail("There hould be no instance, returned " + o);
		}
		catch(ExceptionInInitializerError e)
		{
			// ok
		}
	
	}

}
