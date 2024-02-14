package com.pipelinecode.pipelinecode.dao;

// Correct import for your Message entity
import com.pipelinecode.pipelinecode.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageDAO extends JpaRepository<Message, Long> { }
