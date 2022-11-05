package com.codegym.finish.service.impl;

import com.codegym.finish.model.Thuong;
import com.codegym.finish.repository.IThuongRepository;
import com.codegym.finish.service.IThuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThuongService implements IThuongService {
    @Autowired
    private IThuongRepository thuongRepository;

    @Override
    public List<Thuong> findAll() {
        return thuongRepository.findAll();
    }
}
