public class Calculadora {
    private String nombreCalculadora;

    public Calculadora(String nombre){
        this.nombreCalculadora=nombre;
    }

    public String getNombreCalculadora() {
        return nombreCalculadora;
    }

    public int sumar(int primerNumero, int segundoNumero){
        int resultado;
        resultado=primerNumero+segundoNumero;
        return resultado;
    }
    public int restar(int primerNumero, int segundoNumero){
        int resultado= primerNumero-segundoNumero;
        return resultado;
    }
    public int multiplicar(int primerNumero, int segundoNumero){
        return primerNumero*segundoNumero;
    }
}
