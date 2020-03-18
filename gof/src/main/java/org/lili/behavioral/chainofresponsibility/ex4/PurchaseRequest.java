package org.lili.behavioral.chainofresponsibility.ex4;

/**
 * Created by lili on 2017/8/2
 */
public class PurchaseRequest {
    private double amount;
    private String  purpose;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public PurchaseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }
}
