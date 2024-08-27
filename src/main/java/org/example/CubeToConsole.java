package org.example;

public class CubeToConsole {
    public static void main(String[] args) {
        //Aufrufen der cubeToConsole Methode
        CubeToConsole cubeToConsole = new CubeToConsole();
        cubeToConsole.cubeToConsole();
        System.out.println("___________________________________");

        //Aufrufen der starToConsole
        StarToConsole starToConsole = new StarToConsole();
        starToConsole.printStar();
    }
    public void cubeToConsole(){
        int lines = 4;
        int columns = 8;

        for (int i=0; i<lines;i++){
            for (int j=0; j<columns;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}