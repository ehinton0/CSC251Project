public class Policy {
    private String providerName;
    private Policyholder policyholder;
    private int policyNumber;
//@param
    public Policy(int policyNumber, String providerName, Policyholder policyholder) {
        this.policyNumber = policyNumber;
        this.policyholder = policyholder;
         this.providerName = providerName;
    }
//@return 
    for (Policy p : policies) {
            System.out.println(p);
            System.out.println();

            if (p.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("Number of Policy objects created: " + Policy.getPolicyCount());
        System.out.println("Number of Policyholders that are smokers: " + smokerCount);
        System.out.println("Number of Policyholders that are non-smokers: " + nonSmokerCount);
    public int getPolicyNumber() {
        return policyNumber;
    }
}
