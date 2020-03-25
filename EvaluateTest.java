package com.gmq.entornos.refactoring.exercice;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EvaluateTest {

	Evaluate Evaluate = new Evaluate("00434537","Alberto");

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@ParameterizedTest
	@MethodSource("evaluar")
	void evaluatePupil(int value, String result) {

		assertEquals(result, Evaluate.evaluatePupil(value));
	}

	static Stream<Arguments> evaluar() {
		return Stream.of(Arguments.of(10, "SOBRESALIENTE"), Arguments.of(8, "NOTABLE"), Arguments.of(7, "BIEN"),
				Arguments.of(5, "GOOD"), Arguments.of(3, "SUSPENSO"));

	}

}
