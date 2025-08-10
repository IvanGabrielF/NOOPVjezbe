package pckg_zd1;

public class AverageOp implements MathOperation{

    @Override
    public float execute(float num1, float num2) {
        return (num1+num2)/2;
    }
}
