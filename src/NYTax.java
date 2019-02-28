public class NYTax extends Tax{

        @Override
        public double calculate() {
            if(purchase > 100) {
                return purchase + (purchase * 0.08);
            }
            return purchase;
        }

}
