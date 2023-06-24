package com.pragma.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test_saveDish_withInvalidOwner_ShouldResponseInvalidDataException(){
	}

	@Test
	void test_saveDish_withInvalidRequest_ShouldResponseExceptionInvalidDataException(){
	}

	@Test
	void test_saveDish_withInvalidRestaurantID_ShouldResponseObjectNotFound(){
	}

}