package de.schoener.spring.integration.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_SPRING_NUMBER")
public class SpringNumberEntity {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "SPRING_NUMBER")
	private Long springNumber;

	public Long getId() {
		return id;
	}

	public Long getSpringNumber() {
		return springNumber;
	}

	public void setSpringNumber(Long springNumber) {
		this.springNumber = springNumber;
	}
}
