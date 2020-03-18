package org.lili.behavioral.chainofresponsibility.ex4;

/**
 * Created by lili on 2017/8/2
 */
public abstract class PurchasePower {
    protected static final double BASE = 500;
    protected PurchasePower successor;

    abstract protected double getAllowable();
    abstract protected String getRole();

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    public void processRequest(PurchaseRequest request){
        if(request.getAmount() < this.getAllowable()){
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        }else if(successor!=null){
            System.out.println(this.getRole() + " pass, no privilege to approve");
            successor.processRequest(request);
        }
    }
}
