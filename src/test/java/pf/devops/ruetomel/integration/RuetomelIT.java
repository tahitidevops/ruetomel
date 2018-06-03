package pf.devops.ruetomel.integration;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@WithMockUser
@TestPropertySource("/config/application-test.properties")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RuetomelIT {

  @Autowired
  WebApplicationContext context;

  MockMvc mockMvc;

  @Before
  public void setup() {
    mockMvc = MockMvcBuilders
        .webAppContextSetup(context)
        .defaultRequest(get("/")
            .with(user("01947").roles("aratia_agentcps")))
        .apply(springSecurity())
        .build();
  }
}
