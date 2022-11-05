package com.codegym.finish.service.impl;

import com.codegym.finish.model.HocVien;
import com.codegym.finish.repository.IHocVienRepository;
import com.codegym.finish.service.IHocVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HocVienService implements IHocVienService {
    @Autowired
    private IHocVienRepository hocVienRepository;

    @Override
    public void save(HocVien hocVien) {
        hocVienRepository.save(hocVien);
    }

    @Override
    public Page<HocVien> findAllPage(Pageable pageable, String name) {
        return hocVienRepository.findAll(pageable,"%" + name+"%");
    }

    @Override
    public List<HocVien> findAllTop() {
        return hocVienRepository.findAllTop();
    }

    @Override
    public HocVien findById(Integer id) {
        return null;
    }
}
