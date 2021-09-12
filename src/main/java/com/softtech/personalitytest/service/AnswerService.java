package com.softtech.personalitytest.service;

import java.util.List;

import com.softtech.personalitytest.model.Answer;

public interface AnswerService {
	Answer getById(long id);
	Answer getByQuestionId(long questionId);
	void save(Answer answer);
	void saveAllAnswers(List<Answer> answerList);
	void delete(long answerId);
}
