package com.projects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.projects.model.Homicidio;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DelitosApplication.class, webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DelitosApplicationTests {

	private String url = "http://localhost:8080/api/v1/";
	private String strHomicidios = "homicidios/";
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void testAllHomicidios() {
		ResponseEntity<Homicidio[]> homicidiosAllResponse = restTemplate.getForEntity(url +strHomicidios, Homicidio[].class);
		assertThat(homicidiosAllResponse.getStatusCode(), is(HttpStatus.OK));
		
		ResponseEntity<Object[]> departmentResponse = restTemplate.getForEntity(url + strHomicidios + "departamentos/", Object[].class);
		assertThat(departmentResponse.getStatusCode(), is (HttpStatus.OK));
	}

}
