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
public class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sách: ");
        n = sc.nextInt();
        Sach[] sachs = new Sach[n];
        for(int i = 0; i<n; i++) {
            sachs[i] = new Sach();
            System.out.println("Nhập thông tin sách thứ " + (i+1) +": ");
            sachs[i].NHAP();
        }
        System.out.printf("%20s %20s %20s %15s %15s\n", "Mã sách", "Tên sách", "NXB", "Số trang", "Giá tiền");
        for(Sach i : sachs) {
            i.XUAT();
        }
    }
}
