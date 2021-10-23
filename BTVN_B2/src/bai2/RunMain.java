/*
Viết chương trình nhập vào các lựa chọn sau: (các chức năng chỉ dùng 1 mảng gốc để thao tác)
Tạo và nhập mảng với n số nguyên
Hiển thị mảng vừa tạo 
Thêm 1 phần tử vào vị trí k bất kỳ
Xóa 1 phần tử tại vị trí k bất kỳ
Đảo ngược mảng
Hiển thị phần tử a[1] và các số chia hết cho a[1]
Xuất ra màn hình tổng các số nguyên tố có trong mảng	
Thoát  (Khi nhấn thoát thì chương trình mới kết thúc)

*/
package bai2;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Administrator
 */
public class RunMain {
    
    // 1
    public static void Tao_mang(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
        }
    }

    // 2
    public static void In_mang(int a[], int n) {
        System.out.println("Xuat gia tri mang: ");
        for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    //3
    public static void Them(int[] a, int n, int vtt,int st) {
        for( int i = n; i > vtt ; i--){
            a[i] = a[i-1];
        }
        a[vtt]= st;
    }
    
    // 4
    public static void Xoa_pt(int a[], int n, int k) {
        for(int i = k - 1; i < n; i++) {
            a[i] = a[i + 1];
        }
    }
    
    // 5
    public static void Dao_nguoc( int[] a, int n ){
        for ( int i = n-1 ; i >= 0 ; i--){
            System.out.print(" "+ a[i]);
        }
    }
    
    // 6
    public static void Tim_kiem( int[] a, int n){
        for( int i = 0 ; i < n ; i++) {
            if (a[i] % a[1]==0)
                System.out.println(" "+a[i]);
        }
        System.out.println("Phan tu a[1]= " + a[1]);
    }

    // 7
    public static boolean Kt_snt(int n) {
        if (n < 2)
                return false;
        for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                        return false;
        }
        return true;
    }

    public static int Tong_snt(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
                if (Kt_snt(a[i]) == true) {
                        tong += a[i];
                }
        }
        return tong;
    }
    // 8
    public static void Thoat() {
        System.exit(0);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[100];
        int luachon;
        int n;
        System.out.print("Nhập số lượng phần tử của mảng n = ");
        n = scanner.nextInt();
        do{
            showmemu();
            System.out.println("Nhập lựa chọn của bạn:");
            luachon = scanner.nextInt();
            
            switch(luachon) {
                case 1:
                    System.out.println("Tạo mảng");
                    Tao_mang(a,n);
                    break;
                case 2:
                    System.out.println("Xuất mảng");
                    In_mang(a,n);
                    break;
                case 3:
                    System.out.println("Nhập vị trí muốn thêm: ");
                    int vtt = scanner.nextInt();
                    System.out.println("Nhập số muốn thêm: ");
                    int st = scanner.nextInt();
                    Them(a,n,vtt,st);
                    n++;
                    In_mang(a,n);
                    break;
                case 4:
                    System.out.println("Xóa 1 phần tử");
                    System.out.println("Nhập vị trí muốn xóa:");
                    int k1;
                    k1 = scanner.nextInt();
                    Xoa_pt(a, n, k1);
                    n--;
                    In_mang(a,n);
                    break;
                case 5:
                    System.out.print("Đảo ngược mảng: ");
                    Dao_nguoc(a,n);
                    System.out.println("");
                    break;
                case 6:
                    Tim_kiem(a,n);
                    System.out.println("Các số chia hết cho a[1]: ");
                    break;
                case 7:
                    System.out.print("Tổng các số nguyên tố có trong mảng: ");
                    System.out.println(Tong_snt(a, n));
                    break;
                case 8:
                    System.out.println("Thoát");
                    Thoat();
                    break;
                default:
                    System.out.println("Nhập lại lựa chọn của bạn!!");
                    break;
            }
        } while(luachon != 8);
    }
    static void showmemu() {
       System.out.println("1. Tạo và nhập mảng với n số nguyên");
       System.out.println("2. Hiển thị mảng vừa tạo");
       System.out.println("3. Thêm 1 phần tử vào vị trí k bất kỳ");
       System.out.println("4. Xóa 1 phần tử tại vị trí k bất kỳ");
       System.out.println("5. Đảo ngược mảng");
       System.out.println("6. Hiển thị phần tử a[1] và các số chia hết cho a[1]");
       System.out.println("7. Xuất ra màn hình tổng các số nguyên tố có trong mảng");
       System.out.println("8. Thoát");
    }
}
    

