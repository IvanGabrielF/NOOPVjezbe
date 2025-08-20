package pckg_zd2;

import java.util.Stack;

public class MobAppInv {
    private Stack<PaymentServiceInt> undoStack = new Stack<>();
    private Stack<PaymentServiceInt> redoStack = new Stack<>();

    public String performTransaction(PaymentServiceInt cmd) {
        cmd.execute();
        undoStack.push(cmd);
        redoStack.clear();
        return "Executed!";

    }

    public String undoLastTransaction() {
        if (undoStack.isEmpty()) {
            System.out.println("Undostack is empty!");
            PaymentServiceInt c = undoStack.pop();
            c.undo();
            redoStack.push(c);
            return "Undone."; //chatgpt
        }
        PaymentServiceInt p = undoStack.pop();
        p.undo();
        redoStack.push(p);
        return null;
    }

    public String redo() {
        if (redoStack.isEmpty()) return "Redo stack is empty!";
        PaymentServiceInt c = redoStack.pop();
        c.redo();
        undoStack.push(c);
        return "Redone.";
    }



}
