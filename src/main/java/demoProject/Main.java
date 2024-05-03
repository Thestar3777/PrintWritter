package demoProject;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("output.txt");

            int age = 30;
            double height = 5.11;
            String name = "John";

            writer.print("This is the information of the #1 client:");
            writer.printf("\nName: %s, Age: %d, Height: %.2f\n", name, age, height);
            writer.close();

            System.out.println("Text has been written to output.txt");
        } catch (IOException e) {
            // Handle IOException
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}


