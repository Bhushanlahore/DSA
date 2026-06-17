package com.corejavaconcepts;

public class ExceptionHandlingConcept {

    public static  void test(){

        try{
            System.out.println("In try Block");
            int x = 10/0;
        }catch (Exception e){
            System.out.println("before throwing in catch");
            throw new RuntimeException("In Catch Block");
        }finally {
            System.out.println("before throwing in finally");
            throw new RuntimeException("In Finally Block");
        }
    }

    public static int test1() {
        try {
            int x = 10/0;
            return 1;
        } finally {
            return 2;
        }
    }

    public void processPayment(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid payment amount"); // throw
        }

        if (amount > 10000) {
            throw new Exception("Limit exceeded");
        }

        System.out.println("Payment processed successfully");
    }

    public  static  void main(String[] args){

          //  System.out.println(test1());

        ExceptionHandlingConcept ec = new ExceptionHandlingConcept();

        try {
            ec.processPayment(15000);
        } catch (Exception e) {
            System.out.println("Payment failed: " + e.getMessage());
        }

        System.out.println("Exception Handle Here");

    }
}
