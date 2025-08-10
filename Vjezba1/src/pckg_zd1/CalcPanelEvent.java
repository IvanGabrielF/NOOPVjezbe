package pckg_zd1;

import java.util.EventObject;

public class CalcPanelEvent extends EventObject {
    private float firstNum;
    private float secondNum;
    private String operationName;
    private float result;

    public CalcPanelEvent(Object source, float firstNum, float secondNum, String operationName, float result) {
        super(source);
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operationName = operationName;
        this.result = result;
    }

    public float getFirstNum() {
        return firstNum;
    }

    public float getSecondNum() {
        return secondNum;
    }

    public String getOperationName() {
        return operationName;
    }

    public float getResult() {
        return result;
    }
}
