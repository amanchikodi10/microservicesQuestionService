package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.Service.QuestionService;
import com.question.entites.Question;


@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionser;
	
	@PostMapping("/create")
	public Question create(@RequestBody Question question) {
		return questionser.create(question);
	}
	
	@GetMapping("/getall")
	public List<Question> getall() {
		return questionser.get();
	}
	@GetMapping("/{id}")
	public Question getbyid(@PathVariable Long id) {
		return questionser.getall(id);
	}
	@GetMapping("/getbyQuizId/{id}")
	public List<Question> getQuestinByquiz(@PathVariable Long id){
		return questionser.getbyquizId(id);
	}

}
