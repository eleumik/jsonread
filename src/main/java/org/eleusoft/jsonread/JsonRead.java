package org.eleusoft.jsonread;

import java.io.Reader;

/**
 * A {@link JsonRead} is a JSON parser dedicated to one thread,
 * optimized for multiple read.
 * 
 * <p>
 * Clients may obtain a platform wide implementation using
 * a {@link JsonReadProvider}, for example the one served by
 * {@link org.eleusoft.jsonread.service.JsonReadProviderLoader}.
 * 
 * 
 * @author michele
 *
 */
public interface JsonRead
{
	
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
