/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Hang {
    public String maHang;
    public String tenHang;
    public float donGia;

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng: ");
        maHang = sc.nextLine();
        System.out.println("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.println("Nhập dơn giá: ");
        donGia = sc.nextFloat();
        sc.nextLine();
    }
    public void xuat() {
        System.out.printf("%20s %20s %20s\n", maHang, tenHang, donGia);
    }
    
}
