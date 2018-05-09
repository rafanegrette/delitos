package com.projects.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projects.model.Homicidio;

public interface HomicidioRepository extends JpaRepository <Homicidio, Long> {
	
	@Query(value ="SELECT h.departamento, SUM(h.cantidad) as numer FROM Homicidio h GROUP BY h.departamento")
	List<?> deparmentSummon();
}
