/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tzortziskap.strategy;



public class BankTransferPayment implements PaymentStrategy {

    private final String bank;
    private final String accountNumber;
   

    public BankTransferPayment(String bank, String accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }
    
    @Override
    public void pay(double totalAmount) {
        System.out.println("Paid " + totalAmount + " with bank account " + this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankTransferPayment{bank=").append(bank);
        sb.append(", accountNumber=").append(accountNumber);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
