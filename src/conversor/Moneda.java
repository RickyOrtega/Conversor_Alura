package conversor;

public class Moneda {
    private double valorUnitarioEnCOP;
    private double valorCOPEnMonedaDestino;
    private String nombreDivisa;

    public Moneda(double valorUnitarioEnCOP, double valorCOPEnMonedaDestino, String nombreDivisa) {
        this.valorUnitarioEnCOP = valorUnitarioEnCOP;
        this.valorCOPEnMonedaDestino = valorCOPEnMonedaDestino;
        this.nombreDivisa = nombreDivisa;
    }

    public double getValorUnitarioEnCOP() {
        return valorUnitarioEnCOP;
    }

    public void setValorUnitarioEnCOP(double valorUnitarioEnCOP) {
        this.valorUnitarioEnCOP = valorUnitarioEnCOP;
    }

    public double getValorCOPEnMonedaDestino() {
        return valorCOPEnMonedaDestino;
    }

    public void setValorCOPEnMonedaDestino(double valorCOPEnMonedaDestino) {
        this.valorCOPEnMonedaDestino = valorCOPEnMonedaDestino;
    }

    public String getNombreDivisa() {
        return nombreDivisa;
    }

    public void setNombreDivisa(String nombreDivisa) {
        this.nombreDivisa = nombreDivisa;
    }
}