package ec.edu.utpl.ep.Pr1;

public class Cuaderno {
    private String marca;
    private String tipo;
    private int nroHojas;

    public Cuaderno() {
        marca = "norma";
        tipo = "Lineas";
        nroHojas = 100;
    }

    public Cuaderno(String marca, int nroHojas) {
        setMarca(marca);
        setNroHojas(nroHojas);
    }

    public Cuaderno(String marca, String tipo, int nroHojas) {
        setMarca(marca);
        setNroHojas(nroHojas);
        this.nroHojas = nroHojas;
    }

    public void setMarca(String marca) {
        if (marca.isBlank()){
            this.marca = "norma";
        } else {
            this.marca = marca;
        }
    }

    public void setNroHojas(int nroHojas) {
        if(nroHojas<=0  || nroHojas>200){
            this.nroHojas = 200;
        } else {
            this.nroHojas = nroHojas;
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getNroHojas() {
        return nroHojas;
    }

    public String getTipo() {
        return tipo;
    }


}



