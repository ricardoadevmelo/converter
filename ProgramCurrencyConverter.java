package exercicios.clasAtrMet.converter;

import exercicios.clasAtrMet.conversao.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the value of the dollar? ");
        exercicios.clasAtrMet.conversao.CurrencyConverter.dolar = scanner.nextDouble();
        System.out.print("How many dollars will be purchased? ");
        exercicios.clasAtrMet.conversao.CurrencyConverter.quantidade = scanner.nextDouble();
        System.out.print("Amount to be paid in reais = " + (CurrencyConverter.converter()));

        scanner.close();
    }
}
