public class Division {
    public double dividir(double num1, double num2){
        if (num2!=0){
            return num1/num2;
        }
        else{
            System.out.println("error no se puede dividir por cero.");
            return Double.NaN;
        }
    }
}
