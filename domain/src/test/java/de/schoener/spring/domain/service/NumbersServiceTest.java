package de.schoener.spring.domain.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumbersServiceTest {

	@InjectMocks
	private NumbersService cut;

	@Test
	public void testAddNumber() {
		cut.addNumber("1");

		assertTrue(!cut.getNumbers().isEmpty());
	}

}
