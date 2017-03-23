package org.eleusoft.jsonread;


/**
 * Exception used by {@link JsonReadProvider}
 * to signal a syntax error in a JSON character stream.
 * @author michele
 *
 */
public class JsonParsingException extends JsonException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JsonParsingException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public JsonParsingException(String msg)
	{
		super(msg);
	}

	
}
