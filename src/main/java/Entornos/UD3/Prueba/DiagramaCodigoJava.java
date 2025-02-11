package Entornos.UD3.Prueba;

public class DiagramaCodigoJava {
    public class Categoria{
        private int codigo;
        private String nombre;
        public Categoria(int codigoCategoria, String nombreCategoria){
            this.codigo = codigoCategoria;
            this.nombre = nombreCategoria;
        }
        public int getCodigoCategoria() {
            return codigo;
        }
        public String getNombreCategoria() {
            return nombre;
        }
    }
    public class Libros extends Categoria{
        private int ISBN;
        private String titulo;
        private int codigoCategoria;
        private String nombreCategoria;
        public Libros(int ISBN, String titulo, int codigoCategoria, String nombreCategoria){
            super(codigoCategoria, nombreCategoria);
            this.ISBN = ISBN;
            this.titulo = titulo;
        }
        public int getISBN() {
            return ISBN;
        }
        public String getTitulo() {
            return titulo;
        }
        public int getCodigoCategoria() {
            return codigoCategoria;
        }
        public String getNombreCategoria() {
            return nombreCategoria;
        }
    }
    public class Biblioteca {
        private int codigo;
        private String nombre;
        public Biblioteca(int codBiblioteca, String nombreBiblioteca){
            this.codigo = codBiblioteca;
            this.nombre = nombreBiblioteca;
        }
        public int getCodigo() {
            return codigo;
        }
        public String getNombre() {
            return nombre;
        }
    }
}
