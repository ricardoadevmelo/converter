package exercicios.clasAtrMet.converter;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dolar;
    public static double quantidade;

    public static double converter(){
        return (quantidade * dolar * IOF) + (quantidade * dolar);
    }
}
