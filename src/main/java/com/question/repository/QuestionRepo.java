package com.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.entites.Question;

public interface QuestionRepo extends JpaRepository<Question, Long> {
	List<Question> findByQuizId(Long quizId);

}
