package com.codegym.finish.repository;

import com.codegym.finish.model.HocVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IHocVienRepository extends JpaRepository<HocVien,Integer> {
    @Query(value = " select * from hoc_vien where ten like :name ",
            countQuery = " select * from hoc_vien where ten like :name"
            ,nativeQuery = true)
    Page<HocVien> findAll(Pageable pageable, @Param("name") String name);


    @Query(value = "  select * ,count(*) as so_lan\n" +
            "from \n" +
            " hoc_vien \n" +
            " join phat on phat.id = hoc_vien.phat_id\n" +
            " GROUP BY hoc_vien.ten\n" +
            " having so_lan >=1"
            ,nativeQuery = true)
    List<HocVien> findAllTop();

}
