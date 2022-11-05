package com.codegym.finish.controller;

import com.codegym.finish.model.*;
import com.codegym.finish.service.IHocVienService;
import com.codegym.finish.service.ILopService;
import com.codegym.finish.service.IPhatService;
import com.codegym.finish.service.IThuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("hocVien")
@CrossOrigin
public class HocVienRestController {
    @Autowired
    private IHocVienService hocVienService;
    @Autowired
    private ILopService lopService;
    @Autowired
    private IPhatService phatService;
    @Autowired
    private IThuongService thuongService;
    @GetMapping("/page")
    public ResponseEntity<Page<HocVien>> goPage(@PageableDefault(4) Pageable pageable,
                                                @RequestParam Optional<String> name) {
        String keyword = name.orElse("");
        Page<HocVien> hocVienPage = hocVienService.findAllPage(pageable, keyword);

        if (!hocVienPage.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(hocVienPage, HttpStatus.OK);
        }
    }
    @PostMapping("/create")
    public ResponseEntity<Void> add(@RequestBody HocVien hocVien) {
        hocVienService.save(hocVien);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/detail/{id}")
    public ResponseEntity<HocVien> detail(@PathVariable Integer id) {
        HocVien hocVien = hocVienService.findById(id);
        if (hocVien == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @GetMapping("/list")
    public ResponseEntity<List<Lop>> goList() {
        List<Lop> lopList = lopService.findAll();
        if (lopList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(lopList,HttpStatus.OK);
        }

    }
    @GetMapping("/listThuong")
    public ResponseEntity<List<Thuong>> goListThuong() {
        List<Thuong> thuongList = thuongService.findAll();
        if (thuongList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(thuongList,HttpStatus.OK);
        }

    }
    @GetMapping("/listPhat")
    public ResponseEntity<List<Phat>> goListPhat() {
        List<Phat> phatList = phatService.findAll();
        if (phatList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(phatList,HttpStatus.OK);
        }

    }
 @GetMapping("/listTop")
    public ResponseEntity<List<HocVien>> goListTop() {
        List<HocVien> phatTop = hocVienService.findAllTop();
        if (phatTop.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(phatTop,HttpStatus.OK);
        }

    }

}
