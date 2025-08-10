package pckg_zd1;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Unesi prvi broj: ");
        float a = scanner.nextFloat();

        System.out.println("Unesi drugi broj: ");
        float b = scanner.nextFloat();

        System.out.println("Unesi operaciju (+,-,*,/,avg,pow): ");
        String op = scanner.next();


        switch (op){
            case "+":
                calculator.setOperation(new AdditionOp());
                break;
            case "-":
                calculator.setOperation(new SubstractionOp());
                break;
            case "*":
                calculator.setOperation(new MultiplicationOp());
                break;
            case "/":
                calculator.setOperation(new DivisionOp());
                break;
            case "avg":
                calculator.setOperation(new AverageOp());
                break;
            case "pow":
                calculator.setOperation(new PowOp());
                break;
            default:
                System.out.println("Nepoznata operacija!");
                return;
        }
        float result = calculator.calculate(a,b);
        calculator.displayRes(result);

    }
}
