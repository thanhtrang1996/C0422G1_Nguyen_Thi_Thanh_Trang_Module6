package com.codegym.finish.model;



import javax.persistence.*;

@Entity
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ten;
    private String ngayKhaiGiang;
    private String ngayKetThuc;

    public Lop() {
    }

    public Lop(Integer id, String ten, String ngayKhaiGiang, String ngayKetThuc) {
        this.id = id;
        this.ten = ten;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.ngayKetThuc = ngayKetThuc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayKhaiGiang() {
        return ngayKhaiGiang;
    }

    public void setNgayKhaiGiang(String ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}
