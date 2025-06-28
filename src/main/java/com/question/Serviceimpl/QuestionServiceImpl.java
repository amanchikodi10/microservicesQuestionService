package com.question.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.Service.QuestionService;
import com.question.entites.Question;
import com.question.repository.QuestionRepo;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepo questionrep;

	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionrep.save(question);
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionrep.findAll();
	}

	@Override
	public Question getall(Long id) {
		// TODO Auto-generated method stub
		return questionrep.findById(id).orElseThrow(()->new RuntimeException("Question not found"));
	}
	@Override
	public List<Question> getbyquizId(Long id){
		// TODO Auto-generated method stub
		return questionrep.findByQuizId(id);
	}

}
