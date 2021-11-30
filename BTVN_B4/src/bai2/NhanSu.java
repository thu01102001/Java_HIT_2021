/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class NhanSu {
    public String maNhanSu;
    public String hoTen;
    public Date ns;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân sự: ");
        maNhanSu = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ns = new Date();
        ns.nhap();
    }
    public void xuat() {
        System.out.printf("%20s %20s %20s\n", maNhanSu, hoTen, ns.xuat());
    }

}
