package demo.lvlInditex.pruebatecnica;

import demo.lvlInditex.pruebatecnica.Controller.PricesController;
import demo.lvlInditex.pruebatecnica.Services.PriceService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PricesController.class)
class PruebatecnicaApplicationTests {
	@Autowired
	private MockMvc mvc;
	@MockBean
	private PriceService priceService;
	@Test
	void contextLoads() throws Exception{

		mvc.perform(post("/api/prices/hora?hora=2020-07-14 15:00:00").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$[0].id").value(4));
	}

}