package org.jvalidation;

import java.util.List;

import org.jvalidation.matcher.collection.ListMatcher;
import org.jvalidation.matcher.number.DoubleMatcher;
import org.jvalidation.matcher.number.IntegerMatcher;
import org.jvalidation.matcher.object.ObjectMatcher;
import org.jvalidation.matcher.string.CharMatcher;
import org.jvalidation.matcher.string.StringMatcher;

public class Assertive {
	
	protected Object object;

	public Assertive(Object object) {
		this.object = object;
	}

	public static Assertive require(Object object) {
		return new Assertive(object);
	}
	
	public static Assertive ensure(Object object) {
		return new Assertive(object);
	}

	public IntegerMatcher isInteger() {

		if (!(object instanceof Integer)) {
			throw new IllegalArgumentException("The value is not an integer");
		}

		return new IntegerMatcher((int) object);
	}
	
	public DoubleMatcher isDouble() {

		if (!(object instanceof Double)) {
			throw new IllegalArgumentException("The value is not a double");
		}

		return new DoubleMatcher((double) object);
	}
	
	public ObjectMatcher<Object> isObject() {
		return new ObjectMatcher<Object>(object);
	}
	
	public StringMatcher isString() {

		if (!(object instanceof String)) {
			throw new IllegalArgumentException("The value is not a string");
		}

		return new StringMatcher((String) object);
	}
	
	public CharMatcher isChar() {

		if (!(object instanceof Character)) {
			throw new IllegalArgumentException("The value is not a char");
		}

		return new CharMatcher((char) object);
	}
	
	public ListMatcher isList() {

		if (!(object instanceof List)) {
			throw new IllegalArgumentException("The value is not a list");
		}

		return new ListMatcher((List<?>) object);
	}
}
