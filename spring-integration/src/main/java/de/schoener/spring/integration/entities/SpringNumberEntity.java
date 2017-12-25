package de.schoener.spring.integration.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SPRING_NUMBER")
@NamedQueries(value = {
		@NamedQuery(name = SpringNumberEntity.GET_NUMBER, query = "FROM SpringNumberEntity e where e.springNumber= :springNumber"),
		@NamedQuery(name = SpringNumberEntity.FIND_NUMBERS, query = "FROM SpringNumberEntity e"), })
public class SpringNumberEntity {

	public static final String GET_NUMBER = "SpringNumberEntity.getNumber";
	public static final String FIND_NUMBERS = "SpringNumberEntity.findNumbers";

	@Id
	@GeneratedValue(generator = "SPRINGNUMBER_SEQUENCE_GENERATOR", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SPRINGNUMBER_SEQUENCE_GENERATOR", sequenceName = "SPRINGNUMBER_SEQUENCE", allocationSize = 1)
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
