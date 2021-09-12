package com.softtech.personalitytest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softtech.personalitytest.enums.Category;
import com.softtech.personalitytest.model.Question;
import com.softtech.personalitytest.service.QuestionService;

@RestController
@RequestMapping(value = "/question")
@CrossOrigin
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	@GetMapping("/allByCategory")
	@ResponseBody
	public List<Question> getAllByCategory(@RequestParam Category category) {
		return questionService.getAllByCategory(category); 
	}
	
	@GetMapping("/all")
	@ResponseBody
	public List<Question> getAll() {
		return questionService.getAll(); 
	}

}
