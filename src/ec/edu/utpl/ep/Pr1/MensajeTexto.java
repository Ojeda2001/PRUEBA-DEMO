package ec.edu.utpl.ep.Pr1;

public class MensajeTexto {
    private String texto;
    private String nroDestinatario;
    private int cantidadCaracteres;

    public MensajeTexto() {
        texto = "Hola mundo";
        nroDestinatario = "0952";
        cantidadCaracteres = 240;
    }

    public MensajeTexto(String texto, String nroDestinatario) {
        setTexto(texto);
        this.nroDestinatario = nroDestinatario;
    }

    public MensajeTexto(String texto, String nroDestinatario, int cantidadCaracteres) {
        setTexto(texto);
        this.nroDestinatario = nroDestinatario;
        setCantidadCaracteres(cantidadCaracteres);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if(texto.isBlank()){
            throw new IllegalArgumentException("El texto no puede estar vacÃ­o");
        }
        this.texto = texto;
    }

    public String getNroDestinatario() {
        return nroDestinatario;
    }

    public void setNroDestinatario(String nroDestinatario) {
        this.nroDestinatario = nroDestinatario;
    }

    public int getCantidadCaracteres() {
        return cantidadCaracteres;
    }

    public void setCantidadCaracteres(int cantidadCaracteres) {
        if(cantidadCaracteres <= 0 || getCantidadCaracteres() > 240){
            throw new IllegalArgumentException("El # de caracteres estÃ¡ fuera del rango");
        }
        this.cantidadCaracteres = cantidadCaracteres;
    }
}


}
