package ec.edu.utpl.ep.preg3;

public class Book {
        private String title;
        private int nroPaginas;
        private double peso;
        private boolean isOnlyPaper;

        public Book(String title) {
            this.title = title;
        }

        public Book(String title, int nroPaginas, double peso) {
            this.title = title;
            this.nroPaginas = nroPaginas;
            this.peso = peso;
        }

        public Book(String title, int nroPaginas, double peso, boolean isOnlyPaper) {
            this.title = title;
            this.nroPaginas = nroPaginas;
            this.peso = peso;
            this.isOnlyPaper = isOnlyPaper;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getNroPaginas() {
            return nroPaginas;
        }

        public void setNroPaginas(int nroPaginas) {
            this.nroPaginas = nroPaginas;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public boolean isOnlyPaper() {
            return isOnlyPaper;
        }

        public void setOnlyPaper(boolean onlyPaper) {
            isOnlyPaper = onlyPaper;
        }
    }

}
