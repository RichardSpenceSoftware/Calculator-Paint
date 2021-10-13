package Main;

import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        float PaintCost;
        float WallArea;
        float Budjet;
        boolean PaintType = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the paint cost:");
        PaintCost = input.nextFloat();
        System.out.println("Enter the wall area:");
        WallArea = input.nextFloat();
        System.out.println("Enter the Paint Type");
        PaintType = input.nextBoolean();


        input.close();
        if (PaintType = true) {
            System.out.println(2 * PaintCost * WallArea);
        } else {
            System.out.println(PaintCost * WallArea);
        }

        int[] MultipleWallAreas = {14, 56, 32, 25};

        for (int i = 0; i < MultipleWallAreas.length; i++) {
            System.out.println(i * PaintCost);
        }
    }
}
