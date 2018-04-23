package de.schoener.spring.domain.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import de.schoener.spring.domain.SpringNumber;
import de.schoener.spring.domain.SpringNumberRepository;

@RunWith(MockitoJUnitRunner.class)
public class NumbersServiceTest {

	@Mock
	private SpringNumberRepository springNumberRepository;

	@InjectMocks
	private NumbersServiceImpl cut;

	@Test
	public void testAddNumber() {
		String number = "2";
		Mockito.doNothing().when(springNumberRepository).addSpringNumber(Mockito.any(SpringNumber.class));

		cut.addNumber(number);

		Mockito.verify(springNumberRepository, Mockito.times(1)).addSpringNumber(Mockito.any(SpringNumber.class));

		Mockito.verifyNoMoreInteractions(springNumberRepository);
	}

}
