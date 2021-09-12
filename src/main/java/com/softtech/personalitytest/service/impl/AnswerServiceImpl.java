package com.softtech.personalitytest.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtech.personalitytest.model.Answer;
import com.softtech.personalitytest.repository.AnswerRepository;
import com.softtech.personalitytest.service.AnswerService;

@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	AnswerRepository answerRepository;

	@Override
	public Answer getById(long id) {
		Optional<Answer> answerOpt = answerRepository.findById(id);
		return answerOpt.isPresent() ? answerOpt.get() : null;
	}

	@Override
	public Answer getByQuestionId(long questionId) {
		return answerRepository.getByQuestionId(questionId);
	}

	@Override
	public void save(Answer answer) {
		Answer existingAnswer = getByQuestionId(answer.getQuestionId());
		if(Objects.nonNull(existingAnswer)) {
			existingAnswer.setSelectedOption(answer.getSelectedOption());
			answerRepository.save(existingAnswer);
		} else {
			answerRepository.save(answer);
		}
	}
	
	@Override
	public void delete(long answerId) {
		answerRepository.deleteById(answerId);
	}

	@Override
	public void saveAllAnswers(List<Answer> answerList) {
		for(Answer answer : answerList) {
			save(answer);
		}
	}
	
}
