package de.schoener.spring.integration.dao.jpa;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import de.schoener.spring.integration.dao.SpringNumberDAO;
import de.schoener.spring.integration.entities.SpringNumberEntity;

@org.springframework.transaction.annotation.Transactional
@Repository(value = "jpaSpringNumberDAO")
public class SpringNumberDAOImpl implements SpringNumberDAO<SpringNumberEntity> {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Optional<SpringNumberEntity> getNumber(Long number) {
		TypedQuery<SpringNumberEntity> query = em.createNamedQuery(SpringNumberEntity.GET_NUMBER, SpringNumberEntity.class);
		query.setParameter("springNumber", number);

		SpringNumberEntity entity = null;
		try {
			entity = query.getSingleResult();
		} catch (NoResultException e) {
		}

		return Optional.ofNullable(entity);
	}

	@Override
	public Collection<SpringNumberEntity> findNumbers() {
		TypedQuery<SpringNumberEntity> query = em.createNamedQuery(SpringNumberEntity.FIND_NUMBERS, SpringNumberEntity.class);
		List<SpringNumberEntity> entities = query.getResultList();

		return entities;
	}

	@Override
	public void save(SpringNumberEntity entity) {
		em.persist(entity);
	}

}
