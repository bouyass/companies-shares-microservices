package com.lyes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lyes.entities.Company;

@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
}
