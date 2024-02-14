package com.pipelinecode.pipelinecode.Repository;

import com.pipelinecode.pipelinecode.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
