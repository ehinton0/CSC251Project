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
      
            System.out.println("Error: File not found.");
        }

     
        for (Policy policy : policies) {
            System.out.println(policy);
        }
    }
}
