package com.codegym.finish.service;

import com.codegym.finish.model.HocVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IHocVienService {
    void save(HocVien hocVien);

    Page<HocVien> findAllPage(Pageable pageable, String name);

    HocVien findById(Integer id);

    List<HocVien> findAllTop();
}
