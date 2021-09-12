package com.softtech.personalitytest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtech.personalitytest.enums.Category;
import com.softtech.personalitytest.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{
//	@Query(value = "SELECT * FROM TQUESTION WHERE CATEGORY = ?1", nativeQuery = true)
	List<Question> getAllByCategory(Category category);
}
