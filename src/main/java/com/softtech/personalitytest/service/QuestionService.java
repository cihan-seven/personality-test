package com.softtech.personalitytest.service;

import java.util.List;

import com.softtech.personalitytest.enums.Category;
import com.softtech.personalitytest.model.Question;

public interface QuestionService {
	Question getById(long id);
	List<Question> getAllByCategory(Category category);
	List<Question> getAll();
	
}
