package org.eleusoft.jsonread;

/**
 * A JSON String value
 * @author michele
 *
 */
public abstract class JsonString extends JsonValue
{
	/**
	 * Subclasses only constructor.
	 */
	protected JsonString()
	{
		// 
	}
	/*
	 * (non-Javadoc)
	 * @see org.eleusoft.jsonread.JsonValue#getType()
	 */
	public final String getType()
	{
		return JsonType.STRING;
	}
	/**
	 * Retrieves the string value
	 * of this {@link JsonString}.
	 * @return a {@link String}, never <code>null</code>.
	 */
	public abstract String getString();


	
}
