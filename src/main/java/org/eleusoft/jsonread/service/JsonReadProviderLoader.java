package org.eleusoft.jsonread.service;

import java.io.Reader;

import org.eleusoft.jsonread.JsonObject;
import org.eleusoft.jsonread.JsonParsingException;
import org.eleusoft.jsonread.JsonRead;
import org.eleusoft.jsonread.JsonReadProvider;

/**
 * A {@link JsonReadProvider} that loads a wrapped implementation
 * from file <Code>META-INF/services/org.eleusoft.jsonread.JsonReadProvider</code>
 * @author michele
 *
 */
public class JsonReadProviderLoader extends JsonReadProvider
{
	
	private static final JsonReadProviderLoader instance = new JsonReadProviderLoader();
	private static final JsonReadProvider impl;
	static
	{
		ServiceLoader sl = new ServiceLoader();
		impl = (JsonReadProvider) sl.getService(JsonReadProvider.class, new String[]{});
	}

	/**
	 * A thread safe instance
	 * @return a {@link JsonReadProvider}, never <code>null</code>.
	 */
	public static JsonReadProvider getInstance()
	{
		return instance;
	}

	public JsonRead getJsonRead()
	{
		return impl.getJsonRead();
	}
	/*
	 * (non-Javadoc)
	 * @see com.eleusoft.data.deserialize.jsonread.api.JsonProvider#readObject(java.io.Reader)
	 */
	public JsonObject readObject(Reader json) throws JsonParsingException
	{
		return impl.readObject(json);
	}
	
	
	public String toString()
	{
		return super.toString() + "[wrapping: " + impl.toString() + "]";
	}
	
}
