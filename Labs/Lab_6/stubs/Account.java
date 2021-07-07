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

    /**
     * This method checks to see if the variables
     * are the same; account numbers, names and
     * balances, if they are then the boolean will
     * return true or else it will return false.
     */
    public boolean equals(Account other) {
        //INSERT YOUR CODE HERE
        return this.accountNumber == other.getAccountNumber() && this.name.equals(other.name) && this.balance == other.getBalance();
    }

    /**
     * Here I created a conditional situation where there is
     * a check to see if both account numbers are the same
     * or if they are different. IF they are the same then
     * then the method returns 0, IF it is less then it
     * returns -1 and IF it is greater then it will
     * return +1.
     */
    public int compareTo(Account other) {

        //INSERT YOUR CODE HERE
        return Integer.compare(this.accountNumber, other.getAccountNumber());
    }

    /**
     * Simple, to string statement
     */
    public String toString() {
        //INSERT YOUR CODE HERE
        return "Account number: " + this.getAccountNumber() + ", Name: " + this.getName() + ", Balance: " + this.getBalance();
    }
}