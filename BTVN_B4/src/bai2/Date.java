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
public class Date {
    public int d;
    public int m;
    public int y;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        d = sc.nextInt();
        System.out.println("Nhập tháng: ");
        m = sc.nextInt();
        System.out.println("Nhập năm: ");
        y = sc.nextInt();
    }
    public String xuat() {
        return d + "/" + m + "/" + "y";
    } 
    
}
