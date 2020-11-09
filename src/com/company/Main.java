package com.company;

import java.util.Scanner;

public class Main {

    public static void swap(int a, int b, char [] holder){
        char temp = holder[a];
        holder[a]= holder[b];
        holder[b] = temp;
    }

    public static void main(String[] args) {

        boolean cont = true;
        while (cont) {

            Scanner s = new Scanner(System.in);
            System.out.println("please input a string, preferably with number of characters divisible by 4");
            String input = s.nextLine();
            char[] xters = input.toCharArray();
            int x = 0;
            while (x < xters.length) {
                if (xters.length - x >= 4) {
                    swap(x, x + 3, xters);
                    swap(x + 1, x + 2, xters);
                } else {
                    System.out.println(" out of alignment of 4 ");
                    if (xters.length - x <= 2) {
                        System.out.println("swap not applicable ");
                    } else {
                        swap(x + 1, x + 2, xters);
                    }
                }
                x+=4;
            }
            System.out.println(new String(xters));
            System.out.println(" Do you want to continue (y- yes or n- no)");
            String c = s.nextLine();
            if (c.equalsIgnoreCase("n")) cont = false;
            else if (!c.equalsIgnoreCase("y")) {
                throw new Error(" cannot understand input ");
            }

        }
    }
}
