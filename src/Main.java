public class Main {
    public static void main(String[] args) {

        double change = 0;
        CashRegister registerNoPattern = new CashRegister();

        registerNoPattern.recordPurchase(60);
        registerNoPattern.recordPurchase(50);
        registerNoPattern.calculateTax(new NYTax());
        registerNoPattern.enterPayment(200);
        change = registerNoPattern.giveChange();
        System.out.println("NYTax = "+change);

        registerNoPattern.recordPurchase(60);
        registerNoPattern.recordPurchase(50);
        registerNoPattern.calculateTax(new CATax());
        registerNoPattern.enterPayment(200);
        change = registerNoPattern.giveChange();
        System.out.println("CATax = "+change);

        registerNoPattern.recordPurchase(60);
        registerNoPattern.recordPurchase(50);
        registerNoPattern.calculateTax(new ThaiTax());
        registerNoPattern.enterPayment(200);
        change = registerNoPattern.giveChange();
        System.out.println("ThaiTax = "+change);
    }

}
