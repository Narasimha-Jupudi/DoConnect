package com.doconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doconnect.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByTitleContaining(String keyword);
}
