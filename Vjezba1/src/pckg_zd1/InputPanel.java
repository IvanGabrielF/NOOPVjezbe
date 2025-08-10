package pckg_zd1;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {

    private JTextField txtFirst;
    private JTextField txtSecond;
    private JComboBox<String> comboOp;
    private JButton btnCalculate;

    private CalcListener listener;

    public InputPanel() {
        initComponents();
        layoutComponents();
        activateComponents();
    }

    private void initComponents() {
        txtFirst = new JTextField(10);
        txtSecond = new JTextField(10);

        comboOp = new JComboBox<>(new String[]{
                "+", "-", "*", "/", "avg", "pow"
        });

        btnCalculate = new JButton("Izračunaj");
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.insets = new Insets(5, 5, 5, 5);
        gc.fill = GridBagConstraints.HORIZONTAL;

        gc.gridx = 0;
        gc.gridy = 0;
        add(new JLabel("Prvi broj:"), gc);

        gc.gridx = 1;
        add(txtFirst, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(new JLabel("Drugi broj:"), gc);

        gc.gridx = 1;
        add(txtSecond, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        add(new JLabel("Operacija:"), gc);

        gc.gridx = 1;
        add(comboOp, gc);

        gc.gridy = 3;
        add(btnCalculate, gc);
    }

    private void activateComponents() {
        btnCalculate.addActionListener(e -> {
            try {
                float a = Float.parseFloat(txtFirst.getText());
                float b = Float.parseFloat(txtSecond.getText());
                String op = (String) comboOp.getSelectedItem();

                Calculator calc = new Calculator();

                switch (op) {
                    case "+":
                        calc.setOperation(new AdditionOp());
                        break;
                    case "-":
                        calc.setOperation(new SubstractionOp());
                        break;
                    case "*":
                        calc.setOperation(new MultiplicationOp());
                        break;
                    case "/":
                        calc.setOperation(new DivisionOp());
                        break;
                    case "avg":
                        calc.setOperation(new AverageOp());
                        break;
                    case "pow":
                        calc.setOperation(new PowOp());
                        break;
                }

                float result = calc.calculate(a, b);
                calc.displayRes(result);

                if (listener != null) {
                    listener.calculationDone(new CalcPanelEvent(
                            this, a, b, op, result
                    ));
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Unos mora biti broj!",
                        "Greška", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void setCalcListener(CalcListener listener) {
        this.listener = listener;
    }
}
