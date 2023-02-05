package sia.tacocloud.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HomeController.class) // Spring WEB MVC 애플리케이션의 현태로 테스트가 실행되도록 한다.
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;    //테스트 객체인 MockMvc객체 주입

    @Test
    public void testHomePage() throws Exception{
        mockMvc.perform(get("/"))       // 받아오는 주소. GET/를 실행함.
                .andExpect(status().isOk())           // Http Response 200을 받아와야함
                .andExpect(view().name("home")) //home View가 있어야 한다.
                .andExpect(content().string(containsString("Welcome To..."))); // Welcome To라는 문자열이 포함되어야함.
    }

}