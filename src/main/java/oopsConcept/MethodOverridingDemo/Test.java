package oopsConcept.MethodOverridingDemo;

public class Test {
    public static void main(String[] args) {
        Loan personaloan=new PErsonalLoan();
        System.out.println(personaloan.getLoan());
        Loan homeloan=new Homeloan();
        System.out.println(homeloan.getLoan());
    }
}
