/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Sach {
    public String maSach;
    public String tenSach;
    public String nXB;
    public int soTrang;
    public float giaTien;
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.println("Nhập tên sách");
        tenSach = sc.nextLine();
        System.out.print("Nhập nha xuất bản: ");
        nXB = sc.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang = sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        giaTien = sc.nextFloat();
    }
    public void XUAT() {
        System.out.printf("%20s %20s %20s %15d %15f\n", maSach, tenSach, nXB, soTrang, giaTien);

    }
}
