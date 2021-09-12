package com.softtech.personalitytest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "TANSWER")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Column(name = "QUESTION_ID")
	private long questionId;
	
	@Column(name = "OPTION_ID")
	private long selectedOption;
	
	public Answer() {
		super();
	}

	public Answer(long id, long questionId, long selectedOption) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.selectedOption = selectedOption;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public long getSelectedOption() {
		return selectedOption;
	}

	public void setSelectedOption(long selectedOption) {
		this.selectedOption = selectedOption;
	}

}
