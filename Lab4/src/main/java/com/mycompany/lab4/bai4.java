/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */


public class bai4 {
    public static void main(String[] args) {
        // Tạo sản phẩm
        sanphammmm sp = new sanphammmm("Ao", 200000, 15000);

        // Đọc thông tin bằng getter
        System.out.println("Ten san pham (getter): " + sp.getTenSp());
        System.out.println("Don gia (getter): " + sp.getDonGia());

        // Ghi thông tin bằng setter
        sp.setGiamGia(20000);
        System.out.println("Giam gia moi: " + sp.getGiamGia());

        // Xuất toàn bộ thông tin
        System.out.println("\n=== Thong tin san pham ===");
        sp.xuat();
    }
}