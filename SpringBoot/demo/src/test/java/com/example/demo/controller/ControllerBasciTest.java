package com.example.demo.controller;

import com.example.demo.service.ServiceBasic;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ControllerBasci.class)
public class ControllerBasciTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    ServiceBasic serviceBasic;

    @BeforeAll
    public static void setup() {
        System.out.println("dldkfsdfkhds");
    }


    @Test
    public void test1() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/learn"));
        resultActions.andDo(print())
                .andExpect(status().isOk());
    }
}
