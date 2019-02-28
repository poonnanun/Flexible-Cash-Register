public class CATax extends Tax{

        @Override
        public double calculate() {
            return purchase + (purchase*0.075);
        }
}


