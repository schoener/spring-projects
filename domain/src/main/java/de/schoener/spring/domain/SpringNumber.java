package de.schoener.spring.domain;

/**
 * Simple number class internally implemented like {@link java.lang.Integer}.
 * 
 * @author schoener
 *
 */
public class SpringNumber extends Number {

	private static final long serialVersionUID = 1L;

	private final int value;

	public SpringNumber(String number) {
		this.value = Integer.parseInt(number);
	}

	@Override
	public int intValue() {
		return value;
	}

	@Override
	public long longValue() {
		return value;
	}

	@Override
	public float floatValue() {
		return value;
	}

	@Override
	public double doubleValue() {
		return value;
	}

}
