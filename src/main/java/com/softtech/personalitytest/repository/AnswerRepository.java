package com.softtech.personalitytest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtech.personalitytest.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long>{
	Answer getByQuestionId(long questionId);
}
