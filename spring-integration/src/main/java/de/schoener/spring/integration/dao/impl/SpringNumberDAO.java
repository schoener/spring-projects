package de.schoener.spring.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import de.schoener.spring.domain.SpringNumber;

@Repository
public class SpringNumberDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Optional<SpringNumber> getNumber(int number) {
		assert (jdbcTemplate != null);

		SpringNumber springNumber = jdbcTemplate.queryForObject("SELECT * FROM T_SPRING_NUMBER WHERE SPRING_NUMBER= ?",
				new Object[] { Integer.valueOf(number) }, new RowMapper<SpringNumber>() {
					@Override
					public SpringNumber mapRow(ResultSet rs, int rowNum) throws SQLException {
						return new SpringNumber(rs.getLong("SPRING_NUMBER"));
					}
				});

		return Optional.of(springNumber);
	}
}
