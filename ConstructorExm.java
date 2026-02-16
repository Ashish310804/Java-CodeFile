public class ConstructorExm {
    public static void main(String[] args) {
        PolicyHolder policyHolder = new PolicyHolder("Ashish","LIC0197",20000,258000,"31Aug");
        System.out.println("PolicyHolder's Name:"+policyHolder.customer_name);
        TermInsurancePolicy terminsurancepolicy = new TermInsurancePolicy("Sona","LIC0202",20000,250000,"27Feb");
        System.out.println("TermInsurancePolicy's Customer Name:"+terminsurancepolicy.customer_name);
    }
}

class PolicyHolder{
    String customer_name;
    String policy_number;
    int installment , bonus;
    String mturity_date;
    public PolicyHolder(String customer_name, String policy_number,int installment , int bonus, String mturity_date){
        this.customer_name=customer_name;
        this.policy_number=policy_number;
        this.installment=installment;
        this.bonus=bonus;
        this.mturity_date=mturity_date;
    }
}

class TermInsurancePolicy extends PolicyHolder {
    String customer_name;
    String policy_number;
    public TermInsurancePolicy(String customer_name, String policy_number,int installment , int bonus, String mturity_date){
        super(customer_name, policy_number, installment , bonus, mturity_date);
        this.customer_name= super.customer_name;
    }
}