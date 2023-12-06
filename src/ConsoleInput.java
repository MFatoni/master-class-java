import java.util.Scanner;
public class ConsoleInput {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
//            System.out.println(getInputFromConsole(currentYear));
            System.out.println(getInputFromScanner(currentYear));
        } catch (Exception e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("What's your Name?");
        System.out.println(name);
        return "";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your Name?");
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= "+(currentYear-125)+" and <= "+(currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException nfe){
                System.out.println("Number only");
            }
        } while (!validDOB);

        return "Age:"+age;
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear -125;
        if((dob<minimumYear)||(dob>currentYear)){
            return -1;
        }
        return (currentYear-dob);
    }
}

/*
reading data from console

System.in
System.console -> it doesnt work with ide because the environment disable it
Command Line Arg -> doesnt support interactive app in a loop
Scanner
Scanner sc = new Scanner(System.in);
Scanner sc = new Scanner(new File("FileName"));

java src/ConsoleInput.java

try catch statement -> prevent program terminated due to error

if unable to write on intellej console
first, open IDE (help -> edit custom VM options),
then input next code -Deditable.java.test.console=true and restart IDE.
 */