/*
Nhập vào từ bàn phím 1 chuỗi bất kì. Yêu cầu chuẩn hóa chuỗi sao cho:
Không có khoảng trắng thừa 2 đầu
Giữa các từ chỉ có 1 khoảng trắng
Không chứa ký tự số
Ký tự đầu mỗi từ phải viết hoa

*/
package bai4;
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
        
        //xóa khoảng trắng 2 đầu
        str = str.trim();
        
        //Giữa các từ chỉ có 1 khoảng trắng
        str = str.replaceAll(" +", " ");
        
        //Xóa kí tự số
        str = str.replaceAll("[0-9]","");
        
        String ss[] = str.split(" ");
        str = ""; 
        for (int i = 0; i < ss.length; i++) {
            str += String.valueOf(ss[i].charAt(0)).toUpperCase() + ss[i].substring(1);
            if (i < ss.length - 1)
                str += " ";
        }
        
        System.out.println("Chuỗi sau khi được chuẩn hóa: "+str);
    }
}
