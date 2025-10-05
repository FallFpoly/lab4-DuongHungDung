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
    // Thuộc tính
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Hàm tạo 3 tham số
    public SanPhamm(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Hàm tạo 2 tham số (giảm giá ngầm hiểu = 0)
    public SanPhamm(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    // Phương thức nhập thông tin từ bàn phím
    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }

    // Phương thức tính thuế nhập khẩu 10% giá sản phẩm (private)
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