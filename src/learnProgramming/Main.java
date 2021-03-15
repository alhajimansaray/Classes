package learnProgramming;

// Classes for Car

public class Main {

    public static void main(String[] args) {
	Car porsche = new Car();
	Car holden = new Car();
	porsche.setModel("Carrera");

        System.out.println("Model is " + porsche.getModel());


        // Account Code
        Account bobsAccount = new Account(); //("12345", 0.00, "Bob Brown", "alhajimans2@gmail.com",
                //"077123456"); // Added later

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());


        // Later Added

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("alhajimans2@gmail.com");
        bobsAccount.setCustomerPhoneNumber("077123456");


        bobsAccount.withdrawalAmount(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawalAmount(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawalAmount(100.0);
    }
}
