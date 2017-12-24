package de.schoener.spring.domain;

import java.util.Objects;

/**
 * Simple number class internally implemented like {@link java.lang.Integer}.
 * 
 * @author schoener
 *
 */
public class SpringNumber extends Number {

	private static final long serialVersionUID = 1L;

	private final Long value;

	public SpringNumber(String number) {
		if (number == null) {
			throw new IllegalArgumentException("Number cannot be null");
		}

		this.value = Long.parseLong(number);
	}

	public SpringNumber(Long number) {
		Objects.requireNonNull(number, "Number cannot be null");
		this.value = number;
	}

	@Override
	public int intValue() {
		return value.intValue();
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

	@Override
	public int hashCode() {
		return value.intValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;

		}
		if (getClass() != obj.getClass()) {

			return false;
		}

		SpringNumber other = (SpringNumber) obj;
		return value == other.value;
	}

}
