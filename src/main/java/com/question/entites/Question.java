package com.question.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long questionId;
	
	private String question;
	
	private Long quizId;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(long questionId, String question, Long quizId) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.quizId = quizId;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	

	
	

}
