/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai2 {
    public static void main(String[] args) {
       
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        System.out.println("=== Nhap thong tin san pham 1 ===");
        sp1.nhap();  
        System.out.println("\n=== Nhap thong tin san pham 2 ===");
        sp2.nhap();
        
        System.out.println("\n=== Thong tin san pham 1 ===");
        sp1.xuat();

        System.out.println("\n=== Thong tin san pham 2 ===");
        sp2.xuat();
    }
}
