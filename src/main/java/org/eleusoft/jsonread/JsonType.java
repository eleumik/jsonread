package org.eleusoft.jsonread;

/**
 * An enumeration of JSON types.
 * <p>Values are returned by {@link org.eleusoft.jsonread.JsonValue#getType()} method.
 * @author michele
 *
 */
public final class JsonType
{
	public static final String ARRAY = "array";
	public static final String OBJECT = "object";
	public static final String STRING = "string";
	public static final String BOOLEAN = "boolean";
	public static final String NUMBER = "number";
	public static final String NULL = "null";
	
	private JsonType() {
		
	}

}
