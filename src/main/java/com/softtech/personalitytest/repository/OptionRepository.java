package com.softtech.personalitytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtech.personalitytest.model.Option;

public interface OptionRepository extends JpaRepository<Option, Long>{
	
}
