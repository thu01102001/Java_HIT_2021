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
public class Phieu {
    public String maPhieu;
    public Hang[] x;
    public int n;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã phiếu");
        maPhieu = sc.nextLine();
        System.out.println("Nhập số mặt hàng trong phiếu");
        n = sc.nextInt();
        x = new Hang[n];
        for(int i = 0; i< n; i++) {
            System.out.println("Nhập mặt hàng thứ " +(i+1)+ ": ");
            x[i] = new Hang();
            x[i].nhap();
        }
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public Hang[] getX() {
        return x;
    }

    public int getN() {
        return n;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void xuat() {
        float sum = 0;
        System.out.println("==============================================================");
        System.out.printf("Mã phiếu: %s\n", maPhieu);
        System.out.printf("%20s %20s %20s\n", "Mã hàng", "Tên hàng", "Đơn giá");
        for(int i = 0; i < n; i++){
            sum += x[i].getDonGia();
            x[i].xuat();
        }
        System.out.println("Tổng tiền: " +sum);
    }
}
