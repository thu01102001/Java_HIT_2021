/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/*
Bài 2: Tạo một lớp Array gồm:
Thuộc tính: 1 mảng số nguyên, 1 số nguyên n là số phần tử của mảng.
Phương thức: inputData(): nhập số phần tử và 1 mảng số nguyên, Show(): hiển thị các phần tử của mảng trên một dòng. 
Sum(): tổng các phần tử trong dãy mảng số nguyên. 
Filter(Boolean flag): flag = true thì lọc ra các số chẵn, ngược lại lọc ra các số lẻ
Các constructor và getter + setter
Tạo class RunMain có phương thức main:
Tạo 2 đối tượng arr1 và arr2 là thể hiện của lớp Array. Sau đó nhập dữ liệu cho 2 đối tượng đó. 
So sánh TBC các phần tử của 2 đối tượng đó, nếu của đối tượng nào lớn hơn thì thông báo ra màn hình. Nếu bằng nhau thì in ra “Bye”.

 */
public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        System.out.println("Nhập dữ liệu cho arr1: ");
        arr1.inputData();
        System.out.println("Nhập dữ liệu cho arr2: ");
        arr2.inputData();
        
        System.out.print("Các phần tử mảng arr1: ");
        arr1.Show();
        System.out.print("Các phần tử mảng arr2: ");
        arr2.Show();
        
        System.out.print("Filter arr1: ");
        arr1.Filter(Math.round(Math.random()) == 0);
        System.out.print("Filter arr2: ");
        arr2.Filter(Math.round(Math.random()) == 0);

        double ave1 = 1.0 * arr1.Sum() / arr1.getN();
        double ave2 = 1.0 * arr2.Sum() / arr2.getN();

        if(ave1 > ave2) {
            System.out.println("Trung bình cộng arr1 > arr2");
        }else if(ave1 < ave2){
            System.out.println("Trung bình cộng arr1 < arr2");
        }else {
            System.out.println("Bye");
        }
    }
}
