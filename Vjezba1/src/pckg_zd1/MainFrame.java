package pckg_zd1;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {


    private ResultPanel resultPanel;
    private InputPanel inputPanel;
    private ArrayList<CalcRecord> historyList;

    public MainFrame() {
        super("Strategy Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        historyList = new ArrayList<>();
        initComponents();
        layoutComponents();
        activateListeners();
    }

    private void initComponents() {
        resultPanel = new ResultPanel();
        inputPanel = new InputPanel();
        inputPanel.setPreferredSize(new Dimension(800, 200));

        Border outer = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border titled = BorderFactory.createTitledBorder("Unos podataka");
        ((TitledBorder) titled).setTitleJustification(TitledBorder.CENTER);
        inputPanel.setBorder(BorderFactory.createCompoundBorder(outer, titled));
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(resultPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }

    private void activateListeners() {
        inputPanel.setCalcListener(evt -> {
            CalcRecord record = new CalcRecord(
                    evt.getFirstNum(),
                    evt.getSecondNum(),
                    evt.getOperationName(),
                    evt.getResult()
            );
            historyList.add(record);
            resultPanel.appendText(record.toString() + "\n---------------------------------------\n");
        });
    }

}
