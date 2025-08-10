package pckg_zd1;

import javax.swing.*;

public class DivisionOp implements MathOperation{


    @Override
    public float execute(float num1, float num2) {
        if (num2==0){
            JOptionPane.showMessageDialog(null, "S nulom se ne dijeli!", "Greška", JOptionPane.WARNING_MESSAGE );
            return 0;
        }
        return num1/num2;
    }

}
