package com.question.Service;

import java.util.List;

import com.question.entites.Question;

public interface QuestionService {
	
	Question create(Question question);
	List<Question>get();
	
	Question getall(Long id);
	
	List<Question>getbyquizId(Long id);
	
	
	

}
