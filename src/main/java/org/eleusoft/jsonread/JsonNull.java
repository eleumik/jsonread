package org.eleusoft.jsonread;

/**
 * A JSON null value.
 * <p>
 * The {@link JsonNull} class is used through the {@link #NULL} singleton.
 * 
 * @author michele
 *
 */
public abstract class JsonNull extends JsonValue
{
	/**
	 * The singleton instance
	 */
	public static final JsonValue NULL = new JsonNull()
	{
	};

	/**
	 * Private constructor.
	 */
	private JsonNull()
	{
		//
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eleusoft.jsonread.JsonValue#getType()
	 */
	public final String getType()
	{
		return JsonType.NULL;
	}


	/**
	 * Returns the {@link String} <code>"null"</code>.
	 */
	public final String toString()
	{
		return "null";
	}
}