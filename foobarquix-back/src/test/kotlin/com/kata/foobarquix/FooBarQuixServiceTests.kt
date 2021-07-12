package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.assertj.core.api.Assertions.assertThat



@SpringBootTest(classes = [FooBarQuixApplication::class])
class FooBarQuixServiceTests(@Autowired val service: FooBarQuixService) {

	// Ci-dessous les cas de tests passant et non
	// passant pour le service convertNumber(inputNumber) et
	// les sous-services convertNumberDivise(inputNumber), convertNumberTransform(inputNumber)

	// TESTS DE CONVERSIONS PAR DIVISION
	//Conversion de 6 par division
	@Test
	fun convertNumberDiviseTest6() {
		val inputNumber = 6
		val response = service.convertNumberDivise(inputNumber)
		assert(response.equals("Foo"))
	}

	//Conversion de 10 par division
	@Test
	fun convertNumberDiviseTest10() {
		val inputNumber = 10
		val response = service.convertNumberDivise(inputNumber)
		assert(response.equals("Bar"))
	}

	//Conversion de 30 par division
	@Test
	fun convertNumberDiviseTest30() {
		val inputNumber = 30
		val response = service.convertNumberDivise(inputNumber)
		assert(response.equals("FooBar"))
	}

	//Non conversion de 11 par division
	@Test
	fun convertNumberDiviseTest11() {
		val inputNumber = 11
		val response = service.convertNumberDivise(inputNumber)
		assert(response.equals(""))
	}

	//Non conversion de 14 par division
	@Test
	fun convertNumberDiviseTest14() {
		val inputNumber = 14
		val response = service.convertNumberDivise(inputNumber)
		assert(response.equals(""))
	}


	/* ************************************************************************************************ */


	// TESTS DE CONVERSIONS PAR REMPLACEMENT
	//Conversion de 17 par remplacement
	@Test
	fun convertNumberDiviseTest17() {
		val inputNumber = 17
		val response = service.convertNumberTransform(inputNumber)
		assert(response.equals("Quix"))
	}

	//Conversion de 77 par remplacement
	@Test
	fun convertNumberDiviseTest77() {
		val inputNumber = 77
		val response = service.convertNumberTransform(inputNumber)
		assert(response.equals("QuixQuix"))
	}

	//Conversion de 37 par remplacement
	@Test
	fun convertNumberDiviseTest37() {
		val inputNumber = 37
		val response = service.convertNumberTransform(inputNumber)
		assert(response.equals("FooQuix"))
	}

	//Conversion de 57 par remplacement
	@Test
	fun convertNumberDiviseTest57() {
		val inputNumber = 57
		val response = service.convertNumberTransform(inputNumber)
		assert(response.equals("BarQuix"))
	}

	//Conversion de 3570 par remplacement
	@Test
	fun convertNumberDiviseTest3570() {
		val inputNumber = 3570
		val response = service.convertNumberTransform(inputNumber)
		assert(response.equals("FooBarQuix"))
	}

	//Non conversion de 1246890 par remplacement
	// (ne contient pas les chiffres 3, 5 et 7)
	@Test
	fun convertNumberDiviseTest1246890() {
		val inputNumber = 1246890
		val response = service.convertNumberTransform(inputNumber)
		assert(response.equals(""))
	}

	/* ************************************************************************************************ */


	//Non conversion de 41 par division et remplacement
	@Test
	fun convertNumberDiviseTransformTest41() {
		val inputNumber = 41
		val response = service.convertNumber(inputNumber)
		assert(response.equals("41"))
	}

	//Conversion de 21 par division et remplacement
	@Test
	fun convertNumberDiviseTransformTest21() {
		val inputNumber = 21
		val response = service.convertNumber(inputNumber)
		assert(response.equals("Foo"))
	}

	//Conversion de 35 par division et remplacement
	@Test
	fun convertNumberDiviseTransformTest35() {
		val inputNumber = 35
		val response = service.convertNumber(inputNumber)
		assert(response.equals("BarFooBar"))
	}

	//Conversion de 27 par division et remplacement
	@Test
	fun convertNumberDiviseTransformTest27() {
		val inputNumber = 27
		val response = service.convertNumber(inputNumber)
		assert(response.equals("FooQuix"))
	}

}
