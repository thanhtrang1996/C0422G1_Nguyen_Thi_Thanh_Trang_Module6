package com.codegym.finish.service.impl;

import com.codegym.finish.model.Phat;
import com.codegym.finish.repository.IPhatRepository;
import com.codegym.finish.service.IPhatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhatService implements IPhatService {
    @Autowired
    private IPhatRepository phatRepository;

    @Override
    public List<Phat> findAll() {
        return phatRepository.findAll();
    }

}
