package calculadora;

import java.util.Scanner;

public class Calculadora {

    static Modelo mode = new Modelo();

    public static float realizaOperacion(float n1, float n2, String op) {
        op = mode.getOperacion();
        float resul = 0;
        if ("sumar".equals(op)) {
            resul = (n1 + n2);
            mode.setResultado(resul);
            return resul;
        }
        if ("restar".equals(op)) {
            resul = n1 - n2;
            mode.setResultado(resul);
            return resul;
        }
        if ("multiplicar".equals(op)) {
            resul = n1 * n2;
            mode.setResultado(resul);
            return resul;
        }
        if ("dividir".equals(op)) {
            resul = n1 / n2;
            mode.setResultado(resul);
            return resul;
        }
        return resul;

    }

    public static void main(String[] args) {
        System.out.println("introduce la operación que deseas\nsumar\nrestar\nmultiplicar\ndividir\n");
        Scanner dato = new Scanner(System.in);
        mode.setOperacion(dato.nextLine());
        System.out.println("introduce el primer operando");
        Scanner num = new Scanner(System.in);
        mode.setNum1(num.nextFloat());
        System.out.println("introduce el segundo operando");
        Scanner num1 = new Scanner(System.in);
        mode.setNum2(num1.nextFloat());
        Calculadora.realizaOperacion(mode.getNum1(), mode.getNum2(), mode.getOperacion());
        Vista.imprimir(mode);
    }

}
