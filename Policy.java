import java.util.Scanner;

public class Policy{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String; smokingStatus;
   private double height;
   private double weight;
   
   public Policy() {
      this(0, "Unknown", "Unknown", "Unknown", 0, "non-smoker", 0.0, 0.0);
      }
     
      public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
<<<<<<< Updated upstream
=======
        this.weight = weight;
        
        public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
>>>>>>> Stashed changes
        this.weight = weight;