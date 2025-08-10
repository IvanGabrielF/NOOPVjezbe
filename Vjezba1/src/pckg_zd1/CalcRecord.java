package pckg_zd1;

import java.io.Serializable;

public class CalcRecord implements Serializable {
    private float firstNum;
    private float secondNum;
    private String operationName;
    private float result;

    public CalcRecord(float firstNum, float secondNum, String operationName, float result) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operationName = operationName;
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format("Prvi broj: %.2f, Drugi broj: %.2f, Operacija: %s, Rezultat: %.2f",
                firstNum, secondNum, operationName, result);
    }
}
