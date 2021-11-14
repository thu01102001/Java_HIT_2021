/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/*
Bài 3: Tạo một lớp Guns gồm các thuộc tính: weaponName, ammoNumber.
Các phương thức:
Load(int x): Khi gọi đến thì ammoNumber sẽ tăng lên x đơn vị.
Shoot(int x): Khi gọi đến phương thức này ammoNumber sẽ giảm đi x đơn vị (điều kiện ammoNumber – x >= 0), nếu ammoNumber = 0 thì thông báo hết đạn.
x truyền vào đều được random x thuộc [1,10], khởi tạo đối tượng với ammoNumber = 100
Các constructor, getter và setter.
Tại class RunMain: tạo 2 đối tượng(DiepBeDe, DoanXinhGai) và cho bắn nhau. Đối tượng nào hết đạn trước thì sẽ thua. Thông báo ra màn hình.

*/
import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Guns DiepBeDe = new Guns();
        Guns DoanXinhGai = new Guns();
        process(DiepBeDe, DoanXinhGai);

        System.out.println("\n------Kết quả-------");

        showRes(DiepBeDe, DoanXinhGai);
    }
    
    private static void process(Guns DiepBeDe, Guns DoanXinhGai) {
        Random random = new Random();
        while(DiepBeDe.getAmmoNumber() > 0 && DoanXinhGai.getAmmoNumber() > 0) {
            DiepBeDe.Load(random.nextInt(10) + 1);
            DiepBeDe.Shoot(random.nextInt(10) + 1);

            DoanXinhGai.Load(random.nextInt(10) + 1);
            DoanXinhGai.Shoot(random.nextInt(10) + 1);

            System.out.println("DiepBeDe: " + DiepBeDe.getAmmoNumber());
            System.out.println("DoanXinhGai: " + DoanXinhGai.getAmmoNumber());
        }
    }

    private static void showRes(Guns DiepBeDe, Guns DoanXinhGai) {
        if(DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0) {
            System.out.println("Hòa");
        }else if(DiepBeDe.getAmmoNumber() == 0) {
            System.out.println("DiepBeDe thua.");
        }else {
            System.out.println("DoanXinhGai thua.");
        }
    }
}
