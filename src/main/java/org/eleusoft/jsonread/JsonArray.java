package org.eleusoft.jsonread;

/**
 * A JSON Array value.
 * 
 * <p>The {@link Object#toString()} method <em>may</em>
 * return a JSON representation of this {@link JsonArray}
 * but is not required.
 * 
 * <p>A <em>JsonArray</em> offers access to the JSON Array items by position.
 * When the requested position is outside the boundaries
 * then a {@link RuntimeException} is thrown by the 
 * called method. 
 * 
 * @author michele
 *
 */
public abstract class JsonArray extends JsonValue
{
	/**
	 * Subclasses only constructor.
	 */
	protected JsonArray()
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
		return JsonType.ARRAY;
	}

	/**
	 * Tests whether the item at passed position is a JSON null object.
	 * <p>
	 * An  {@link RuntimeException} (possibly implementation specific) 
	 * is thrown when passing an index outside the
	 * <Code>0 - (size()-1)</code> range.
	 * 
	 * @param i
	 *            index
	 * @return true if null
	 */
	public abstract boolean isNull(int i);

	/**
	 * Retrieves the item at passed position as a {@link JsonValue}.
	 * <p>
	 * An  {@link RuntimeException} (possibly implementation specific) 
	 * is thrown when passing an index outside the
	 * <Code>0 - (size()-1)</code> range.
	 * 
	 * @param i
	 *            index
	 * @return a {@link JsonValue}, never <code>null</code>.
	 */
	public abstract JsonValue get(int i);

	/**
	 * Retrieves the size of this {@link JsonArray}.
	 * 
	 * @return a non negative integer.
	 */
	public abstract int size();

}
