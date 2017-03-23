package org.eleusoft.jsonread;

/**
 * A JSON Value, base interface for all values.
 * @author michele
 *
 */
public abstract class JsonValue
{
	/**
	 * Subclasses only constructor.
	 */
	protected JsonValue()
	{
		// 
	}
	/**
	 * The type of this {@link JsonValue} specialization,
	 * @return one of:
	 * <ul>
	 * <li> {@link JsonType#OBJECT}
	 * <li> {@link JsonType#ARRAY},
	 * <li> {@link JsonType#STRING}
	 * <li> {@link JsonType#NUMBER}
	 * <li> {@link JsonType#BOOLEAN},
	 * <li> {@link JsonType#NULL}
	 * </ul>,
	 * never <code>null</code>.
	 */
	public abstract String getType();

}
