package br.com.fiap.challenge_app_parquimetro.DriverIntegrationTest;

import br.com.fiap.challenge_app_parquimetro.dto.DriverDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DriverIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateDriver() throws Exception {
        DriverDto driverDto = new DriverDto();
        driverDto.setName("Teste 3");
        driverDto.setEmail("oladdd@Gmail.com");
        driverDto.setPhone("teste 1");
        driverDto.setAddress("ALfredo ");

        mockMvc.perform(post("/driver")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(driverDto)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name", is(driverDto.getName())))
                .andExpect(jsonPath("$.email", is(driverDto.getEmail())))
                .andExpect(jsonPath("$.phone", is(driverDto.getPhone())))
                .andExpect(jsonPath("$.address", is(driverDto.getAddress())));
    }

}
