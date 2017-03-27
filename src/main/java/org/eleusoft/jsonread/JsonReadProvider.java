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
	 * Retrieves a {@link JsonRead} to be used by a single thread for multiple
	 * parsing.
	 * 
	 * @return a {@link JsonRead}, never <code>null</code>.
	 */
	public abstract JsonRead getJsonRead();

	/**
	 * Convenience helper, creates a {@link JsonObject} from a character stream,
	 * implementation is thread safe.
	 * <p>
	 * Equivalent to call <Code>getJsonRead().readObject(json)</code>.
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
