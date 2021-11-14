/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Administrator
 */
public class Guns {
    public String weaponName;
    public int ammoNumber;
    public Guns() {
        
    }
    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
    public void Load(int x) {
        setAmmoNumber(getAmmoNumber() + x);
    }
    public void Shoot(int x) {
        if(ammoNumber - x >= 0) {
            setAmmoNumber(getAmmoNumber() - x);
        }
        else {
            setAmmoNumber(0);
        }
    }
}
