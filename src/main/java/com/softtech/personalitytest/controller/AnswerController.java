package com.softtech.personalitytest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softtech.personalitytest.model.Answer;
import com.softtech.personalitytest.service.AnswerService;

@RestController
@RequestMapping(value = "/answer")
public class AnswerController {
	
	@Autowired
	AnswerService answerService;
	
	@PostMapping(value = "/saveAnswers", consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String saveAnswers(@RequestBody List<Answer> answerList) {
		answerService.saveAllAnswers(answerList);
		return "All answers have been saved.";
	}
	
	@PostMapping("/saveSingleAnswer")
	@ResponseBody
	public String saveAnswer(@RequestBody Answer answer) {
		answerService.save(answer);
		return "Kaydetme işlemi başarılı!";
	}

	@GetMapping("/getAnswerByQuestionId")
	@ResponseBody
	public Answer getAnswerByQuestionId(@RequestParam long questionId) {
		return answerService.getByQuestionId(questionId);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	public String deleteAnswer(@RequestParam long id) {
		answerService.delete(id);
		return "Silme işlemi başarılı";
	}
	
}
