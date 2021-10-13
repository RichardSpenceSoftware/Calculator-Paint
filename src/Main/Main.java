package Main;

import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        float PaintCost;
        float WallArea;
        float Budjet = 600;
        boolean PaintType;

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

        boolean Overbudjet = true;
        while (Overbudjet ==true) {

            if (Budjet > 500) {
                System.out.println("You do not have enough money");
            } else {
                Overbudjet = false;
                System.out.println("You have enough money");
            }
            break;
        }
        int count = 0;

        int[][] MultipleWallHouses = {{14, 56, 32, 25},{23,6,67,20}};

        for (int i = 0; i < MultipleWallHouses.length; i++) {
            for(int j= 0;j < MultipleWallHouses[i].length; j++){
                MultipleWallHouses[i][j] = ++count;
                System.out.print(MultipleWallHouses[i][j] * PaintCost);
            }
        }
    }
}
