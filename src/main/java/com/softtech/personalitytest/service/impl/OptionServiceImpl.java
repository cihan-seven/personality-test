package com.softtech.personalitytest.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtech.personalitytest.model.Option;
import com.softtech.personalitytest.repository.OptionRepository;
import com.softtech.personalitytest.service.OptionService;

@Service
@Transactional
public class OptionServiceImpl implements OptionService {

	@Autowired
	OptionRepository optionRepository;
	
	@Override
	public Option getOptionById(long id) {
		Optional<Option> optionOpt = optionRepository.findById(id);
		return optionOpt.isPresent() ? optionOpt.get() : null;
	}
	

}
