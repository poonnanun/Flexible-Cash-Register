public class ThaiTax extends Tax{

    @Override
    public double calculate() {
        return purchase + (purchase*0.07);
    }
}
