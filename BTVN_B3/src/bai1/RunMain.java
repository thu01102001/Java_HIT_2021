/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/*
Bài 1: Khai báo lớp Person gồm các thuộc tính: name, age, gender, hobby. 
Yêu cầu:
	+ Dùng constructor để khởi tạo 1 đối tượng với đầy đủ thuộc tính và toString() để hiển thị thông tin đối tượng 
	+ Sử dụng setter, getter nhập xuất thông tin cho 1 person
-> xuất thông tin 2 person trên.

 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        

        Person person1 = new Person("Huân", 21, "Nam", "Ăn, ngủ, nghỉ...");
        System.out.println("Thông tin person 1: " + person1);
        Person person2 = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        person2.setName(sc.nextLine());
        System.out.print("Enter age: ");
        person2.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter gender: ");
        person2.setGender(sc.nextLine());
        System.out.print("Enter hobby: ");
        person2.setHobby(sc.nextLine());

        
        System.out.println("Thông tin person 2: " + person2);
    }
}
