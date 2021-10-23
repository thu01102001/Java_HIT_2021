/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bai1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        //Bài tập 1:
        //
        //
        //Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
        //Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.

                Scanner scanner = new Scanner(System.in);
                int m;
                int n;
                System.out.println("Nhập giá trị của m: ");
                m = scanner.nextInt();
                System.out.println("Nhập giá trị của n: ");
                n = scanner.nextInt();
                for(int i = 0; i < m; i++) {
                    for(int j = 0; j < n; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("\n");
                }
    }
}
