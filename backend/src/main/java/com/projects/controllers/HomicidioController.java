package com.projects.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projects.model.Homicidio;
import com.projects.repository.HomicidioRepository;

@RestController
@RequestMapping("api/v1/homicidios")
public class HomicidioController {
	
	@Autowired
	private HomicidioRepository homicidioRepo;
	
	@RequestMapping(value = "/" , method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Homicidio> list(){
		List<Homicidio> list = homicidioRepo.findAll();
		return list;		
	}
	
	@RequestMapping(value = "/departamentos/" , method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<?> listDepartamntos(){
		List<?> list = homicidioRepo.deparmentSummon();
		return list;		
	}
}
