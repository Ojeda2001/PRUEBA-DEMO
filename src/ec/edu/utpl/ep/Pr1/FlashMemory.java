package ec.edu.utpl.ep.Pr1;

public class FlashMemory {
    private String marca;
    private double capacidad;
    private String version;

    public FlashMemory() {
    }

    public FlashMemory(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public FlashMemory(String marca, double capacidad, String version) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.version = version;
    }

    public void setMarca(String marca) {
        if (marca.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        }
        this.marca = marca;
    }

    public void setCapacidad(double capacidad) {
        if(capacidad <= 0 || capacidad > 1){
            throw new IllegalArgumentException("Valor fuera de Rango");
        }
        this.capacidad = capacidad;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMarca() {
        return marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public String getVersion() {
        return version;
    }

}
