package org.eleusoft.jsonread;

import java.math.BigDecimal;

/**
 * A JSON Numeric value.
 * <p>
 * The string representation must be made available in the {@link #toString()}
 * method.
 * <p>
 * Ideally {@link #toString()} should return the source value and not the
 * string representation of the {@link Number} returned by {@link #getNumber()},
 * see {@link org.eleusoft.jsonread} package description.
 * 
 * @author michele
 *
 */
public abstract class JsonNumber extends JsonValue
{
	/**
	 * Subclasses only constructor.
	 */
	protected JsonNumber()
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
		return JsonType.NUMBER;
	}

	/**
	 * Tests whether this {@link JsonNumber} is a lexical integer number.
	 * <p>An <em>lexical integer number</em> is here defined as a number that:
	 * <ol>
	 * <li>Is a multiple of 1, eg: <code>0, 1, -2, 3, ..</code>
	 * <li>Has no decimals, eg: <code>1.0</code> is not a lexical integer
	 * <li>Is not in exponential notation, eg: <Code>2E4, 0E0, 0E-10</code> are not lexical integer numbers 
	 * <li>Is not a negative zero, eg: <code>-0</code> is not a lexical integer.
	 * </ol>
	 * <p>An other way to see an lexical integer number is that
	 * if a JSON Number is not a lexical integer then it should be bound
	 * to a floating point number in the hosting environment, eg: a {@link Double}
	 * or a {@link BigDecimal}, to be round-tripped correctly.
	 * <p>Some implementations might not be able to verify these
	 * rules because for example they retain only a {@link Number}
	 * representation of the JSON Number value so the original
	 * lexical is not available; in this case an implementation could
	 * do its best to check the rules and when this is not possible, use
	 * the mathematical value instead than the lexical.
	 * 
	 * <p>See also:
	 * <p><ul>
	 * <li><a href='https://github.com/json-schema/json-schema/issues/27'>https://github.com/json-schema/json-schema/issues/27</a>,
	 * <li><em>integer lexical</em> <a href='https://github.com/json-schema/json-schema/issues/27#issuecomment-9146015'>https://github.com/json-schema/json-schema/issues/27#issuecomment-9146015</a>
	 * <li>About <code>-0.0</code>: <a href='https://www.ietf.org/mail-archive/web/json/current/msg03668.html'>[Json] on serialization of signed zero</a> on ietf.org
	 * <li><a href='https://www.ietf.org/mail-archive/web/json/current/msg01523.html'>Re: [Json] Interop problem report with number nasties</a>
	 * <li><A href='http://stackoverflow.com/questions/19577061/how-do-i-stringify-a-json-object-with-a-negative-zero-in-javascript'>http://stackoverflow.com/questions/19577061/how-do-i-stringify-a-json-object-with-a-negative-zero-in-javascript</a>
	 * <li><A href='http://stackoverflow.com/questions/7223359/are-0-and-0-the-same'>http://stackoverflow.com/questions/7223359/are-0-and-0-the-same</a>
	 * <li><a href='http://stackoverflow.com/questions/7223717/differentiating-0-and-0'>http://stackoverflow.com/questions/7223717/differentiating-0-and-0</a>
	 * <li><a href='https://www.ietf.org/mail-archive/web/json/current/msg03925.html'>Minus Zero</a>
	 * <li><A href='https://github.com/rust-lang/rfcs/issues/1075'>Consider outputting a `.0` suffix for FP values without a fractional part</a>
	 * <li><a href='https://github.com/rust-lang/rfcs/issues/1074#issuecomment-97090433'>-0.0 should format with a minus sign by default</a>
	 * </ul>
	 * @return true if this {@link JsonNumber} is integral
	 */
	public abstract boolean isIntegral();
	
	/**
	 * Retrieves the Java String representation of the JSON number represented
	 * by this {@link JsonNumber}.
	 * <p>
	 * Ideally this is the value present in the source, see {@link JsonNumber}
	 * class description.
	 * 
	 * @return a {@link String}, never <code>null</code>.
	 */
	public abstract String toString();

	/**
	 * Retrieves the {@link Number} representing the numeric value of this
	 * {@link JsonNumber}.
	 * <p>
	 * The concrete implementation of {@link Number} is implementation
	 * dependent.
	 * <p>
	 * Implementations may return a non standard {@link Number} however
	 * they should specify this aspect in the documentation.
	 * 
	 * @return a {@link Number}, never <code>null</code>.
	 */
	public abstract Number getNumber();
}
