package com.projekt2501;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Bank of America");


        bank.addBranch("Houston Branch");
        bank.addBranch("Dallas Branch");
        bank.addBranch("San Antonio Branch");

        bank.addCustomer("Houston Branch", "Adam Yi", 100.23);
        bank.addCustomer("Houston Branch", "Steve Yi", 43.23);
        bank.addCustomer("Houston Branch", "Donna Yi", 594.32);
        bank.addCustomer("Dallas Branch", "David Yi", 100.23);
        bank.addCustomer("San antonio branch", "Kevin Yi", 100.23);


        bank.addCustomer("Tidwell Branch", "Sean william", 203.29);

        bank.addCustomerTransaction("houston branch", "Kevin Yi", 392.29);


        bank.addCustomerTransaction("houston branch", "Adam yi", 23.43);

        bank.listCustomers("HOUSTON BRANCH", true);
        bank.listCustomers("dallas branch", true);
        bank.listCustomers("san antonio branch", true);

    }
}
