package com.kata.foobarquix

import com.kata.foobarquix.controllers.FooBarQuixController
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject
import org.springframework.web.util.UriComponentsBuilder



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FooBarQuixApplicationTests(@Autowired val restTemplate: TestRestTemplate) {

	//Ci-dessous les 10 cas de tests dans le front-end

	//Non conversion de 1
	@Test
	fun noTranslateTest() {
		val url = "/foo-bar-quix/"
		val inputNumber = 1
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("1"))
	}

	// Conversion de 3
	@Test
	fun translateTest3() {
		val url = "/foo-bar-quix/"
		val inputNumber = 3
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("FooFoo"))
	}

	// Conversion de 5
	@Test
	fun translateTest5() {
		val url = "/foo-bar-quix/"
		val inputNumber = 5
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("BarBar"))
	}

	// Conversion de 7
	@Test
	fun translateTest7() {
		val url = "/foo-bar-quix/"
		val inputNumber = 7
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("Quix"))
	}

	// Conversion de 9
	@Test
	fun translateTest9() {
		val url = "/foo-bar-quix/"
		val inputNumber = 9
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("Foo"))
	}

	// Conversion de 51
	@Test
	fun translateTest51() {
		val url = "/foo-bar-quix/"
		val inputNumber = 51
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("FooBar"))
	}

	// Conversion de 53
	@Test
	fun TranslateTest53() {
		val url = "/foo-bar-quix/"
		val inputNumber = 53
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("BarFoo"))
	}

	// Conversion de 33
	@Test
	fun translateTest33() {
		val url = "/foo-bar-quix/"
		val inputNumber = 33
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("FooFooFoo"))
	}

	// Conversion de 27
	@Test
	fun translateTest27() {
		val url = "/foo-bar-quix/"
		val inputNumber = 27
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("FooQuix"))
	}

	// Conversion de 15
	@Test
	fun translateTest15() {
		val url = "/foo-bar-quix/"
		val inputNumber = 15
		val response = restTemplate.getForObject<FooBarQuixController.ResultDto>(url + inputNumber)
		assert(response?.result.equals("FooBarBar"))
	}
}
