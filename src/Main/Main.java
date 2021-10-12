package Main;

import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        float PaintCost;
        float WallArea;
        int PaintType;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the paint cost:");
        PaintCost = input.nextFloat();
        System.out.print("Enter the wall area:");
        WallArea = input.nextFloat();
        System.out.print("Enter the Paint Type");
        PaintType = input.nextInt();

        input.close();
        String message;
        if (PaintType == 1) {
            message = "Paint is good";
        } else {
            message = "Paint is bad";

        }

        message = (PaintType == 1) ? "Paint is good";
        String string = new String((PaintType == 1) ? "Paint is good");
        System.out.println(message);
        System.out.println(string);

        switch (PaintType) {

            case 0:
                System.out.println("Case is 0");
                break;

            case 1:
                System.out.println("Case is 1");
                break;
            case 2:
                System.out.println("Case is 2");
                break;
            default:
                System.out.println("Case is 3");
                break;
        }
        ;
        System.out.println(message);


        System.out.println(PaintCost * WallArea);
    }
}
