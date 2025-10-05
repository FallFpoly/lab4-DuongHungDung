/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai3 {
    public static void main(String[] args) {
        // Tạo sản phẩm có giảm giá
        SanPhamm sp1 = new SanPhamm("Ao", 200000, 20000);

        // Tạo sản phẩm không giảm giá
        SanPhamm sp2 = new SanPhamm("Quan", 350000);

        // Xuất thông tin 2 sản phẩm
        System.out.println("=== Thong tin san pham 1 ===");
        sp1.xuat();

        System.out.println("\n=== Thong tin san pham 2 ===");
        sp2.xuat();
    }
}
