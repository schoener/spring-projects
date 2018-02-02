package de.schoener.spring.integration.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import de.schoener.spring.integration.dao.SpringNumberDAO;
import de.schoener.spring.integration.entities.SpringNumberEntity;

@org.springframework.transaction.annotation.Transactional
@Repository(value = "jdbcSpringNumberDAO")
public class SpringNumberDAOImpl implements SpringNumberDAO<SpringNumberEntity> {

	@Autowired(required = false)
	private JdbcTemplate jdbcTemplate;

	@Override
	public Optional<SpringNumberEntity> getNumber(Long number) {
		SpringNumberEntity springNumber = jdbcTemplate.queryForObject("SELECT * FROM T_SPRING_NUMBER WHERE SPRING_NUMBER= ?",
				new Object[] { Long.valueOf(number) }, new RowMapper<SpringNumberEntity>() {
					@Override
					public SpringNumberEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
						SpringNumberEntity entity = new SpringNumberEntity();
						entity.setSpringNumber(rs.getLong("SPRING_NUMBER"));
						return entity;
					}
				});

		return Optional.of(springNumber);
	}

	@Override
	public Collection<SpringNumberEntity> findNumbers() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public void save(SpringNumberEntity entity) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
