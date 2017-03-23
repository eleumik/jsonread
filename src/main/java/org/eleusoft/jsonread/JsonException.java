package org.eleusoft.jsonread;

/**
 * A runtime exception that can be used to signal a problem
 * with the API usage.
 * @author michele
 *
 */
public class JsonException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JsonException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public JsonException(Throwable e)
	{
		super(e);
	}

	public JsonException(String msg)
	{
		super(msg);
	}


}
