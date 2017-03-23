package org.eleusoft.jsonread;

import java.io.Reader;

/**
 * <b>Entry point</b>, creates a {@link JsonObject} from a character stream.
 * 
 * <p>
 * Clients may obtain a platform wide implementation using
 * {@link org.eleusoft.jsonread.service.JsonReadProviderLoader}.
 * 
 * <p>
 * Implementations must fail fast (at static initialization) when the libraries
 * they rely on are not available at runtime.
 * 
 * @author michele
 *
 */
public abstract class JsonReadProvider
{
	/**
	 * Subclasses only constructor.
	 */
	protected JsonReadProvider()
	{
		//
	}

	/**
	 * Creates a {@link JsonObject} from a character stream
	 * 
	 * @param json
	 *            required reader
	 * @return a {@link JsonObject}, never <code>null</code>.
	 * @throws JsonParsingException
	 *             if parsing fails for a syntax problem of the source
	 * @throws JsonException
	 *             if parsing fails for some other reason like an IO exception.
	 */
	public abstract JsonObject readObject(Reader json) throws JsonParsingException;

}
