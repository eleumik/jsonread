package org.eleusoft.jsonread;

/**
 * A JSON Boolean value.
 * <p>
 * The {@link JsonBoolean} class is used through the {@link #TRUE} and
 * {@link #FALSE} singletons.
 * 
 * @author michele
 *
 */
public abstract class JsonBoolean extends JsonValue
{
	/**
	 * Private constructor.
	 */
	private JsonBoolean()
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
		return JsonType.BOOLEAN;
	}

	/**
	 * The <code>true</code> singleton
	 */
	public static final JsonBoolean TRUE = new JsonBoolean()
	{

		public boolean isTrue()
		{
			return true;
		}

	};
	/**
	 * The <code>false</code> singleton
	 */
	public static final JsonBoolean FALSE = new JsonBoolean()
	{

		public boolean isTrue()
		{
			return false;
		}

	};

	/**
	 * Tests whether the value associated to this {@link JsonBoolean} is
	 * <code>true</code>
	 */
	public abstract boolean isTrue();

	/**
	 * Returns either <code>"true"</code> or <code>"false"</code>.
	 */
	public String toString()
	{
		return "" + isTrue();
	};
}
