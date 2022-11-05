package com.codegym.finish.service.impl;

import com.codegym.finish.model.Lop;
import com.codegym.finish.repository.ILopRepository;
import com.codegym.finish.service.ILopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopService implements ILopService {
    @Autowired
    private ILopRepository lopRepository;

    @Override
    public List<Lop> findAll() {
        return lopRepository.findAll();
    }
}
