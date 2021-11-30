/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class QuanLy {
    public String maQL;
    public String hoTen;
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã quản lý: ");
        maQL = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
    }
    public void XUAT() {
        System.out.println("Mã quản lý: " + maQL);
        System.out.println("Họ tên quản lý: " + hoTen);
    }
}
