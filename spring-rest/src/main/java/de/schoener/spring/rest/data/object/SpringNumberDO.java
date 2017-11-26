package de.schoener.spring.rest.data.object;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SpringNumberDO {

	private int value;

	public SpringNumberDO(int number) {
		this.value = number;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
