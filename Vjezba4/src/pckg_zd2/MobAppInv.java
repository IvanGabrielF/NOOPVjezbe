package pckg_zd2;

import java.util.Stack;

public class MobAppInv {
    private Stack<PaymentServiceInt> undoStack = new Stack<>();
    private Stack<PaymentServiceInt> redoStack = new Stack<>();

    public void performTransaction(PaymentServiceInt payment) {
        payment.execute();
        undoStack.push(payment);
        redoStack.clear();
    }

    public void undoLastTransaction() {
        if (undoStack.isEmpty()) {
            System.out.println("Undostack is empty!");
            return;
        }
        PaymentServiceInt p = undoStack.pop();
        p.undo();
        redoStack.push(p);
    }

    public void redoLastTransaction() {
        if (redoStack.isEmpty()) {
            System.out.println("Redo stack iss empty!");
            return;
        }
        PaymentServiceInt p = redoStack.pop();
        p.redo();
        undoStack.push(p);
    }


}
