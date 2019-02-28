public abstract class Tax {
    double purchase;

    public Tax(){

    }

    public void setPurchase(double purchase){
        this.purchase = purchase;
    }

    public abstract double calculate();


}
