/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Array {
    public int[] a;
    public int n;
    
    public Array() {
    }

    public Array(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public int getN() {
        return n;
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n = ");
        n = sc.nextInt();
        a = new int[n];//NullPointerException
        for(int i=0; i<n; i++) {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public void Show() {
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
    public int Sum() {
        int s = 0;
        for(int i : a) {
            s += i;
        }
        return s;
    }
    public void Filter(Boolean flag) {
        if(flag) {
            for(int i : a) {
                if(i % 2 == 0) {
                    System.out.println("i = " +i);
                }
            }
        }
        else {
            for(int i : a) {
                if(i % 2 != 0) {
                    System.out.println("i = " +i);
                }
            }
        }
        System.out.println("");
    }
}
