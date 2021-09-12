package com.softtech.personalitytest.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.softtech.personalitytest.enums.Category;
import com.softtech.personalitytest.enums.OptionType;

@Entity
@Table(name = "TQUESTION")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "QUESTION_TEXT")
	private String questionText;
	
	@Enumerated(EnumType.STRING)
	private final Category category;
	
	@Enumerated(EnumType.STRING)
	private final OptionType optionType;
	
	@ManyToMany(targetEntity = Option.class, cascade = CascadeType.ALL)
	@JoinTable(	name="TQUESTION_OPTIONS", 
	  			joinColumns = { @JoinColumn( name="QUESTION_ID") }, 
	  			inverseJoinColumns = { @JoinColumn( name="OPTION_ID") })
	private Set<Option> options = new HashSet<>();
	
	public Question() {
		super();
		this.category = null;
		this.optionType = null;
	}

	public Question(long id, String questionText, Category category, OptionType optionType, Set<Option> options) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.category = category;
		this.optionType = optionType;
		this.options = options;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public Set<Option> getOptions() {
		return options;
	}

	public void setOptions(Set<Option> options) {
		this.options = options;
	}

	public Category getCategory() {
		return category;
	}

	public OptionType getOptionType() {
		return optionType;
	}

	
}
