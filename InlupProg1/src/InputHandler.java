/**
 * Rebecca Martell Söderdahl rema8538
 */

import java.util.Scanner;

public class InputHandler {

    private Scanner input = new Scanner (System.in);

    public double readDouble(String messenger){

        System.out.print(messenger + "?>");

        double d = input.nextDouble();

        input.nextLine(); //ta bort radbrytningen
        return d;
    }
    public double readDouble() {
        return 0;
    }

    public String readLine(String messenger) {
        System.out.print(messenger + "?>");

        String d = input.nextLine().toLowerCase().trim();
        while (d.isEmpty()) {
            System.out.println("Error: Name cant be empty");
            System.out.println(messenger + "?>");


            d = input.nextLine().toLowerCase().trim();

        }

        return d;
    }

    public int readInt(String messenger) {

        System.out.print(messenger + "?>");
        int d = input.nextInt();
        input.nextLine(); //ta bort radbrytningen
        return d;
    }
}