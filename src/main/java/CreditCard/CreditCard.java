package CreditCard;

import Classes.*;

public class CreditCard{
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Create new credit card account
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0);
        this.creditLimit = new Money(creditLimit); // Make sure it's the same as set above
    }

    // Accessors
    public String getPersonals(){
        return owner.toString();
    }

    public Money getBalance(){
        return new Money(balance);
    }

    public Money getCreditLimit(){
        return new Money(creditLimit);
    }

    // Charge Method
    public void charge(Money amount){
        Money newBalance = new Money(amount);

        if (newBalance.compareTo(creditLimit) <= 0){
            balance = newBalance;
            System.out.println("Charge: " + amount);

        }
        else{
            System.out.println("Your new balance exceeds the credit limit");
        }
    }

    // Payment Method
    public void payment(Money amount){
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
//revision 30/11/24