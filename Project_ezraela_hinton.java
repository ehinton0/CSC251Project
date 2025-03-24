public class Policy {
    private int policyNumber;
    private String providerName;
    private Policyholder policyholder;

    public Policy(int policyNumber, String providerName, Policyholder policyholder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholder = policyholder;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }
}
