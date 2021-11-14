/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
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
