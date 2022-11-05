package com.codegym.finish.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class HocVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ten;
    private String ngaySinh;
    private String email;
    private String cCCD;
    private String soDienThoai;
    @ManyToOne
    @JoinColumn(name = "lop_id",referencedColumnName = "id")
    private Lop lop;
    @ManyToOne
    @JoinColumn(name = "thuong_id",referencedColumnName = "id")
    private Thuong thuong;
    @ManyToOne
    @JoinColumn(name = "phat_id",referencedColumnName = "id")
    private Phat phat;

    public HocVien() {
    }

    public HocVien(Integer id, String ten, String ngaySinh, String email, String cCCD, String soDienThoai, Lop lop, Thuong thuong, Phat phat) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.cCCD = cCCD;
        this.soDienThoai = soDienThoai;
        this.lop = lop;
        this.thuong = thuong;
        this.phat = phat;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getcCCD() {
        return cCCD;
    }

    public void setcCCD(String cCCD) {
        this.cCCD = cCCD;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public Thuong getThuong() {
        return thuong;
    }

    public void setThuong(Thuong thuong) {
        this.thuong = thuong;
    }

    public Phat getPhat() {
        return phat;
    }

    public void setPhat(Phat phat) {
        this.phat = phat;
    }
}
