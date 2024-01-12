package com.garudabyte.master_class.modifier;

/**
 * Created by dev on 20/11/2015.
 */
public class ModifierPassword {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public ModifierPassword(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
