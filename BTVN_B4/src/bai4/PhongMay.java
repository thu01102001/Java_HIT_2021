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
public class PhongMay {
    public String maPhong;
    public String tenPhong;
    public float dienTich;
    public QuanLy x;
    public May y[];
    public int n;
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.println("Nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.println("Nhập diện tích của phòng: ");
        dienTich = sc.nextFloat();
        sc.nextLine();
        x = new QuanLy();
        x.NHAP();
        System.out.println("Nhập số loại máy: ");
        n = sc.nextInt();
        y = new May[n];
        for(int i = 0; i<n; i++) {
            System.out.println("Nhập thông tin máy thứ " +(i+1)+ ": ");
            y[i] = new May();
            y[i].NHAP();
        }
    }
    public void XUAT() {
        System.out.println("-----------------------Phòng máy-----------------------");
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich);
        x.XUAT();
        System.out.printf("%20s %20s %20s\n", "Mã máy", "Kiểu máy", "Tình trạng");
        for(May i : y) {
            i.XUAT();
        }
    } 
}
