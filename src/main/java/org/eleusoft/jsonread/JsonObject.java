package org.eleusoft.jsonread;

/**
 * A JSON Object value.
 * 
 * <p>
 * The {@link Object#toString()} method <em>may</em> return a JSON
 * representation of this {@link JsonObject} but is not required.
 * 
 * @author michele
 *
 */
public abstract class JsonObject extends JsonValue
{
	/**
	 * Subclasses only constructor.
	 */
	protected JsonObject()
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
		return JsonType.OBJECT;
	}

	// used array so can do for(String x : keys()), no parser parses keys while iterating them.
	
	/**
	 * Returns the keys of the mappings of this {@link JsonObject}.
	 * <p>
	 * The return value has no particular order as mappings are unordered in the
	 * specification of the JSON Object.
	 * 
	 * @return a {@link String[]}, never <code>null</code>.
	 */
	abstract public String[] keys(); 

	/**
	 * Tests whether a mapping for the passed key exists
	 * 
	 * @param key
	 *            required key
	 * @return true if exists
	 */
	public abstract boolean has(String key);

	/**
	 * Gets the {@link JsonValue} for the passed key.
	 * 
	 * @param key
	 *            required key
	 * @return a {@link JsonValue}, never <code>null</code>.
	 * @throws RuntimeException
	 *             if the key has no value
	 */
	public abstract JsonValue get(String key);

	/**
	 * Convenience helper, gets the {@link JsonValue} for the passed key or
	 * <code>null</code> if no mapping present.
	 * 
	 * @param key
	 *            required key
	 * @return a {@link JsonValue}, or <code>null</code>.
	 */
	public abstract JsonValue opt(String key);

	/**
	 * Convenience helper, tests whether a key maps to the JSON
	 * <code>null</code> value.
	 * <p>
	 * This method is equivalent to testing the value from {@link #opt(String)}
	 * to be an instance of {@link JsonNull} throwing
	 * {@link NullPointerException} if the value is <code>null</code>.
	 * 
	 * @param key
	 *            required key
	 * @return true if the value for the passed key is JSON <code>null</code>
	 * @throws NullPointerException
	 *             if the key is not present in the mapping.
	 */
	public abstract boolean isNull(String key);

	// /**
	// * Gets the string value for the passed key
	// * or the passed default value if key is not present
	// * or value for key is not a string.
	// * @param key required key
	// * @param def optional default value
	// * @return the string value for the passed key
	// * or the passed default value;
	// */
	// public abstract String getString(String key, String def);
	//
	// /**
	// * Gets the string value for the passed key.
	// * @param key required key
	// * @return the string value for the passed key
	// * @throws RuntimeException (implementation specific) if the key does not
	// * identify a string value
	// */
	// public abstract String getString(String key);

}
