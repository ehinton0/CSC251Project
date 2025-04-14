import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        try (Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"))) {
            while (fileScanner.next()) {
                String providerName = fileScanner.next();
                String firstName = fileScanner.next();
                int age = fileScanner.nextInt();
                double height = fileScanner.nextDouble();
                double weight = fileScanner.nextDouble();
                String lastName = fileScanner.next();
                int policyNumber = fileScanner.nextInt();
                String smokingStatus = fileScanner.next();
               
                Policyholder policyholder = new Policyholder(firstName, lastName, age, smokingStatus, height, weight);
                policies.(new Policy(policyNumber, providerName, policyholder));
            }
      public String toString() {
        return "Policyholder’s First Name: " + firstName + "\n" +
               "Policyholder’s Last Name: " + lastName + "\n" +
               "Policyholder’s Age: " + age + "\n" +
               "Policyholder’s Smoking Status: " + smokingStatus + "\n" +
               "Policyholder’s Height: " + height + " inches\n" +
               "Policyholder’s Weight: " + weight + " pounds\n" +
               "Policyholder’s BMI: " + String.format("%.2f", getBMI());

            System.out.println("Error: File not found.");
        }

     
        for (Policy policy : policies) {
            System.out.println(policy);
        }
    }
}
