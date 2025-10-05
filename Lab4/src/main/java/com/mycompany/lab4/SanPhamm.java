package com.mycompany.lab4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SanPhamm {
    
    private String tenSp;
    private double donGia;
    private double giamGia;
    
    public SanPhamm(String tenSp, double donGia, double giamGia) {
        
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPhamm(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
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