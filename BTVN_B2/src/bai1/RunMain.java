/*
Nhập từ bàn phím 3 số nguyên. Viết phương thức trả về số lớn nhất trong 3 số vừa nhập.
*/
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Nhập giá trị của a: ");
        a = scanner.nextInt();
        System.out.print("Nhập giá trị của b: ");
        b = scanner.nextInt();
        System.out.print("Nhập giá trị của c: ");
        c = scanner.nextInt();
        int max = a;
        if(b>max) {
            max = b;
        }
        if (c>max) {
            max = c;
        }
        System.out.println("Số lớn nhát là: "+max);
    }
}
