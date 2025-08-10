package pckg_zd1;

public class Calculator {

    private MathOperation operation;

    public void setOperation(MathOperation operation){
        this.operation=operation;

    }
    public float calculate(float a, float b){
        if (operation==null){
            throw new IllegalStateException("Nije odabrana operacija!");
        }
        return operation.execute(a, b);
    }
    public void displayRes(float result){
        System.out.println("Rezultat: " + result);
    }
}
