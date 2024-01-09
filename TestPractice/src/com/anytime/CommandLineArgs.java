package com.anytime;

public class CommandLineArgs {

    public static void main(String[] args) {
        // Check if there are any command line arguments
        if (args.length > 0) {
            // Print the first command line argument
            System.out.println(args[0]);

            // Manipulate or use the command line arguments as needed
            for (String arg : args) {
                System.out.println("Argument: " + Integer.parseInt(arg));
                System.out.println();
            }
        } else {
            System.out.println("No command line arguments provided.");
        }
    }
}
