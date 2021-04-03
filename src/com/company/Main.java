package com.company;

import static java.lang.Math.floor;

public class Main {

    public static int CalculAdunareNrIntregi(double[]SirNumere){

        for(int i=1; i<=SirNumere.length; i++){
            if(i == SirNumere[i]){
                if(i - floor(i) = 0)
            }
        }
    }
     public static float CalculImpartire(float NumberOne, float NumberTwo){
         if(NumberOne >= NumberTwo)

         return NumberOne/NumberTwo;
         else
             return NumberTwo/NumberOne;
     }
    public static int CalculInmultire(int NumberOne, int NumberTwo){
        if(NumberOne >= 0, NumberTwo >= 0)
         return NumberOne * NumberTwo;

    }
    public static int CalculateSum(int NumberOne,int NumberTwo){
        return NumberOne + NumberTwo;
    }

    public static void main(String[] args) {

         System.out.println("Cele doua numere impartite dau rezultatul: " + CalculImpartire(1.11f,6.12f));
     System.out.println("Suma celor doua numere este: " + CalculateSum(254,564));
     System.out.println("Inmultirea celor doua numere este: " + CalculInmultire(24,56));

    }
}
