package com.ltp.gradesubmission;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// This class is built in and meant for integration testing
@SpringBootTest
@AutoConfigureMockMvc
class GradeSubmissionApplicationTests {

	@Autowired
	private MockMvc mockMVC;
	@Test
	void contextLoads() {
		assertNotNull(mockMVC);
	}

	@Test
	public void testShowGradeForm() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/?id=123");
		mockMVC.perform(request)
				.andExpect(status().is2xxSuccessful())
				.andExpect(view().name("form"))
				.andExpect(model().attributeExists("grade"));
	}
	@Test
	public void testFormSubmission() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.post("/handleSubmit").
				param("name", "Harry")
				.param("subject", "Potions")
				.param("score", "A+");
		mockMVC.perform(request)
				.andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrl("/grades"));
	}
	@Test
	public void unsuccessfulSubmit() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.post("/handleSubmit")
				.param("name", "   ")
				.param("subject", "   ")
				.param("score", "F");

		mockMVC.perform(request)
				.andExpect(status().is2xxSuccessful())
				.andExpect(view().name("form"));
	}
	@Test
	public void testGetGrades() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/grades");
		mockMVC.perform(request)
				.andExpect(status().is2xxSuccessful())
				.andExpect(view().name("grades"))
				.andExpect(model().attributeExists("grades"));
	}
}
