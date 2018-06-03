package pf.devops.ruetomel.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.anonymous;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class IndexPageIT extends RuetomelIT {

  @Test
  public void testThatAnonymousCanAccessTheIndexPage() throws Exception {

    this.mockMvc.perform(get("/").with(anonymous()))
        .andExpect(status().isOk());

  }

  @Test
  public void testThatAnonymousCannotAccessTheAdminSection() throws Exception {

    this.mockMvc.perform(get("/admin").with(anonymous()))
        .andExpect(status().is3xxRedirection());

  }
}