package com.pipelinecode.pipelinecode.service;

import com.pipelinecode.pipelinecode.Entity.Message;
import com.pipelinecode.pipelinecode.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public List<Message> getAllMessages() {
        return repository.findAll();
    }

    public Optional<Message> getMessageById(Long id) {
        return repository.findById(id);
    }

    public Message saveMessage(Message message) {
        return repository.save(message);
    }

    public Message updateMessage(Long id, Message messageDetails) {
        return repository.findById(id).map(message -> {
            message.setContent(messageDetails.getContent());
            return repository.save(message);
        }).orElseThrow(() -> new RuntimeException("Message not found for this id :: " + id));
    }

    public void deleteMessage(Long id) {
        repository.deleteById(id);
    }
}
