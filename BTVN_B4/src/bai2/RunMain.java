/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        NhanSu x = new NhanSu();
        x.nhap();
        System.out.printf("%20s %20s %20s\n", "Mã nhân sự", "Họ tên", "Ngày sinh");
        x.xuat();
    }
}
