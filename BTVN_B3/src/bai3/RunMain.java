/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Administrator
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
