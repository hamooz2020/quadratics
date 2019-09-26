package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //todo declare variables a,b,c,discriminant axisOfSymmetry,parabolaFacing,x,y
        double a, b, c, discriminant, axisOfSymmetry, x, y;
        String parabolaFacing;
        Scanner radar;
        //todo initialize manually
        radar = new Scanner(System.in);
        System.out.println("Give me an A");
        a = radar.nextDouble();
        System.out.println("Give me an B");
        b = radar.nextDouble();
        System.out.println("Give me an C");
        c = radar.nextDouble();
//        a = 5;
//        b = 3;
//        c = 1;

        //todo do calculations
        axisOfSymmetry = -b/(2*a);
        discriminant = (b*b)-4*(a*c);
        if(discriminant >0){
            System.out.println("There are two real solutions");
        }
        else if(discriminant == 0){
            System.out.println("There is one real solutions");
        }
        else{
            System.out.println("There are NO real solutions");
        }
        //todo print results
        System.out.println("Axis of Symmetry: "+axisOfSymmetry);
        System.out.println("Axis of Symmetry: "+discriminant);

        //todo initiaize scanner and redo the initialize area

        //todo double check results


    }
}



























































