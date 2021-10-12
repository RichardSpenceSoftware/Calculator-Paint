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
        If (Paint Type ==1){

        }
        System.out.println(PaintCost * WallArea);
    }
}
