/**
 * Created by dev on 23/11/2015.
 */
public class ModifierExtendedPassword extends ModifierPassword {
    private int decryptedPassword;

    public ModifierExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
