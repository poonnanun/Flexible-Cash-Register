public class CashRegister {
    private double purchase;
    private double payment;

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTax(Tax tax){
        tax.setPurchase(purchase);
        purchase = tax.calculate();
    }

    public void enterPayment(double payment){
        this.payment = payment;
    }

    public double giveChange(){
        double change = payment - purchase;
        payment = 0;
        purchase = 0;
        return change;
    }


}
