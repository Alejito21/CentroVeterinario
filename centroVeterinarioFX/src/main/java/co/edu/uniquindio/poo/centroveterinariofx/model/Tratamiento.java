package co.edu.uniquindio.poo.centroveterinariofx.model;

public class Tratamiento {
    public String medicamento;
    public int cantidad;
    public double dosis;

    public Tratamiento(String medicamento, int cantidad, double dosis) {
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.dosis = dosis;

    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }
}
