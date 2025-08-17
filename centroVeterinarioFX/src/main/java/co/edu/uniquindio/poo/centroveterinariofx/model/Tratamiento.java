package co.edu.uniquindio.poo.centroveterinariofx.model;

public class Tratamiento {
    public String medicamento;
    public int cantidad;
    public double dosis;

    // Método: public Tratamiento(String medicamento, int cantidad, double dosis)
    // Descripción: Explica la funcionalidad de este método
    public Tratamiento(String medicamento, int cantidad, double dosis) {
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.dosis = dosis;

    }

    // Método: public String getMedicamento()
    // Descripción: Explica la funcionalidad de este método
    public String getMedicamento() {
        return medicamento;
    }

    // Método: public void setMedicamento(String medicamento)
    // Descripción: Explica la funcionalidad de este método
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    // Método: public int getCantidad()
    // Descripción: Explica la funcionalidad de este método
    public int getCantidad() {
        return cantidad;
    }

    // Método: public void setCantidad(int cantidad)
    // Descripción: Explica la funcionalidad de este método
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método: public double getDosis()
    // Descripción: Explica la funcionalidad de este método
    public double getDosis() {
        return dosis;
    }

    // Método: public void setDosis(double dosis)
    // Descripción: Explica la funcionalidad de este método
    public void setDosis(double dosis) {
        this.dosis = dosis;
    }
}
