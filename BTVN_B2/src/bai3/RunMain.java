/*
 Nhập từ bàn phím 1 chuỗi bất kì. Yêu cầu kiểm tra và thực hiện: 
Nếu chuỗi đó chứa ký tự số thì in ra màn hình “true”
Ngược lại in ra “false”
Trả về trung bình cộng các chữ số có trong chuỗi
*/
package bai3;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        int dem = 0, tong = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                tong += str.charAt(i) - 48;
                dem++;
            }
        }
        if(dem != 0) {
            System.out.println("True");
            System.out.println("Trung bình cộng các số có trong chuỗi: " + (float)tong/dem);
        }
        else {
            System.out.println("False");
        }
    }
}
