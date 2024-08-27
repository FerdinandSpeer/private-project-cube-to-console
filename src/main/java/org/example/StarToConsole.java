package org.example;

public class StarToConsole {
    public void printStar() {
        int height = 7; // Höhe des Sterns

        for (int i = 0; i < height; i++) {
            // Leerzeichen für die obere Hälfte des Sterns
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Sterne für die obere Hälfte des Sterns
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Unterer Teil des Sterns
        for (int i = 0; i < height / 2; i++) {
            // Leerzeichen vor dem unteren Teil
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            // Sterne für den unteren Teil
            System.out.println("*");
        }
    }
}
