package com.softtech.personalitytest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softtech.personalitytest.model.Option;
import com.softtech.personalitytest.service.OptionService;

@RestController
@RequestMapping(value = "/option")
public class OptionController {
	@Autowired
	OptionService optionService;

	@GetMapping("/getOptionById")
	@ResponseBody
	Option getOptById(@RequestParam long id) {
		return optionService.getOptionById(id);
	}
}
