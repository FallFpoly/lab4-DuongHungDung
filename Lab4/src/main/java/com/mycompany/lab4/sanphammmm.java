package com.mycompany.lab4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class sanphammmm {
    // Thuộc tính private
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Hàm tạo 3 tham số
    public sanphammmm(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Hàm tạo 2 tham số (giảm giá = 0)
    public sanphammmm(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    // Getter và Setter
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Phương thức tính thuế nhập khẩu 10% (private)
    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Phương thức xuất thông tin sản phẩm (public)
    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}
