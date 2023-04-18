package demo.lvlInditex.pruebatecnica;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {
    @Autowired
    MockMvc mvc;

    @Test
    void integrationTestCheckStatus() throws Exception{
        mvc.perform(get("/api/prices/hour").param("hour","2020-07-14 15:00:00"))
                .andExpect(status().isOk());
    }

    @Test
    void integrationTestOption1()throws Exception{
        mvc.perform(get("/api/prices/hour").param("hour","2020-06-14 10:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].BRAND_ID")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].START_DATE")
                        .value("2020-06-14T00:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].END_DATE")
                        .value("2020-12-31T15:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE_LIST")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRODUCT_ID")
                        .value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRIORITY")
                        .value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE")
                        .value(35.5))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].CURR")
                        .value("EUR"));
    }

    @Test
    void integrationTestOption2()throws Exception{
        mvc.perform(get("/api/prices/hour").param("hour","2020-06-14 16:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].BRAND_ID")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].START_DATE")
                        .value("2020-06-14T15:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].END_DATE")
                        .value("2020-06-14T18:30:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE_LIST")
                        .value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRODUCT_ID")
                        .value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRIORITY")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE")
                        .value(25.45))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].CURR")
                        .value("EUR"));
    }

    @Test
    void integrationTestOption3()throws Exception{
        mvc.perform(get("/api/prices/hour").param("hour","2020-06-14 21:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].BRAND_ID")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].START_DATE")
                        .value("2020-06-14T00:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].END_DATE")
                        .value("2020-12-31T15:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE_LIST")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRODUCT_ID")
                        .value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRIORITY")
                        .value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE")
                        .value(35.5))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].CURR")
                        .value("EUR"));
    }

    @Test
    void integrationTestOption4()throws Exception{
        mvc.perform(get("/api/prices/hour").param("hour","2020-06-15 10:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].BRAND_ID")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].START_DATE")
                        .value("2020-06-15T00:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].END_DATE")
                        .value("2020-06-15T11:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE_LIST")
                        .value(3))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRODUCT_ID")
                        .value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRIORITY")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE")
                        .value(30.5))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].CURR")
                        .value("EUR"));
    }

    @Test
    void integrationTestOption5()throws Exception{
        mvc.perform(get("/api/prices/hour").param("hour","2020-06-16 21:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].BRAND_ID")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].START_DATE")
                        .value("2020-06-15T16:00:00"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].END_DATE")
                        .value("2020-12-31T23:59:59"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE_LIST")
                        .value(4))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRODUCT_ID")
                        .value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRIORITY")
                        .value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].PRICE")
                        .value(38.95))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].CURR")
                        .value("EUR"));
    }

}
