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
    public int getPolicyNumber() {
        return policyNumber;
    }
}
