package com.softtech.personalitytest.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtech.personalitytest.enums.Category;
import com.softtech.personalitytest.model.Question;
import com.softtech.personalitytest.repository.QuestionRepository;
import com.softtech.personalitytest.service.QuestionService;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public Question getById(long id) {
		Optional<Question> questionOpt = questionRepository.findById(id);
		return questionOpt.isPresent() ? questionOpt.get() : null;
	}

	@Override
	public List<Question> getAllByCategory(Category category) {
		return questionRepository.getAllByCategory(category);
	}

	@Override
	public List<Question> getAll() {
		return questionRepository.findAll();
	}
}
