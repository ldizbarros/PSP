package ejercicio6;

public class Cuenta {
    
    private static double saldo = 950;

    public Cuenta() {
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        Cuenta.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Saldo de la cuenta = "+saldo;
    }

}
