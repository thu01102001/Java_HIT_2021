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
public class May {
    public String maMay;
    public String kieuMay;
    public String tinhTrang;
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.println("Nhập kiểu máy: ");
        kieuMay = sc.nextLine();
        System.out.println("Nhập tình trạng máy: ");
        tinhTrang = sc.nextLine();
    }
    public void XUAT() {
        System.out.printf("%20s %20s %20s\n", maMay, kieuMay, tinhTrang);
    }
}
