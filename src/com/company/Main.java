package com.company;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);

                try {
                    int result = ZeroAmounts.getZerosCount(n);
                    System.out.println(result);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong value!");
            }
        } else {
            System.out.println("'N' wasn't entered!");
        }
    }
}
