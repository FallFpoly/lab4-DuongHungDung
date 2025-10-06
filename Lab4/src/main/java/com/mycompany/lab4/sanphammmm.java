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
   
    private String tenSp;
    private double donGia;
    private double giamGia;
    
    public sanphammmm(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public sanphammmm(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
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
    private double getThueNhapKhau() {
        return donGia * 0.1;
    }
    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}
