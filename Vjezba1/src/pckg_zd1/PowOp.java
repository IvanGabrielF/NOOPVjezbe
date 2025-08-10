package pckg_zd1;

public class PowOp implements MathOperation{
    @Override
    public float execute(float num1, float num2) {
        int exp = (int) num2;
        return (float) Math.pow(num1, exp);
    }
}
