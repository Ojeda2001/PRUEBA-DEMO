package ec.edu.utpl.ep.Pr1;

public class Documento {
    private String nombreArchivo;
    private String titulo;
    private int nroParrafos;

    public Documento(){
        nombreArchivo = "Nuevo Archivo";
        titulo = "ProgramaciÃ³n";
        nroParrafos = 1000;
    }

    public Documento(String nombreArchivo, String titulo) {
        setNombreArchivo(nombreArchivo);
        this.titulo = titulo;
    }

    public Documento(String nombreArchivo, String titulo, int nroParrafos) {
        setNombreArchivo(nombreArchivo);
        this.titulo = titulo;
        setNroParrafos(nroParrafos);
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        if(nombreArchivo.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacÃ­o");
        }
        this.nombreArchivo = nombreArchivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNroParrafos() {
        return nroParrafos;
    }

    public void setNroParrafos(int nroParrafos) {
        if(nroParrafos <= 0 || nroParrafos > 100000){
            throw new IllegalArgumentException("El # de pÃ¡rrafos esta fuera de rango");
        }
        this.nroParrafos = nroParrafos;
    }
}

}
