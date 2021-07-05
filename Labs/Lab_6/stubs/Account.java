package stubs;

public class Account implements Comparable<Account> {

    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {

        //INSERT YOUR CODE HERE
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;

    }

    public int getAccountNumber() {
        //INSERT YOUR CODE HERE
        return accountNumber;
    }

    public String getName() {
        //INSERT YOUR CODE HERE
        return name;
    }

    public double getBalance() {
        //INSERT YOUR CODE HERE
        return balance;
    }

    public void setAccountNumber(int number) {
        //INSERT YOUR CODE HERE
        this.accountNumber = number;
    }

    public void setName(String name) {
        //INSERT YOUR CODE HERE
        this.name = name;
    }

    public void setBalance(double balance) {
        //INSERT YOUR CODE HERE
        this.balance = balance;
    }

    public boolean equals(Account other) {
        //INSERT YOUR CODE HERE
        return this.accountNumber == other.getAccountNumber() && this.name.equals(other.name) && this.balance == other.getBalance();
    }

    public int compareTo(Account other) {

        //INSERT YOUR CODE HERE
        if(this.accountNumber == other.getAccountNumber())
            return 0;
        else if(this.accountNumber < other.getAccountNumber())
            return -1;
        else if (this.accountNumber > other.getAccountNumber())
            return +1;
        return 0;    }

    public String toString() {
        //INSERT YOUR CODE HERE
        return "Account number: " + this.getAccountNumber() + ", Name: " + this.getName() + ", Balance: " + this.getBalance();
    }
}