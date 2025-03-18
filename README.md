Esquema del preyecto:

📁 Proyecto (Carpeta del proyecto)

   📂 src/com/Proyecto/ → Código fuente principal
   
      📂 historial/ → Implementación de pilas
      
      📂 pestañas/ → Implementación de listas enlazadas
      
      📂 descargas/ → Implementación de colas
      
      📂 marcadores/ → Implementación de arreglos estáticos (Listas simples) y árboles
      
      📂 grafos/ → Implementación de relaciones de contenido (opcional)
      
      📂 ui/ → Interfaz de usuario (opcional)
      
   📂 src/com/Proyecto/Main.java → Clase principal para ejecutar el simulador //no se ha agregado//

Faltantes:
   * Arreglas Clase pilas
   * Añadir Listas Simples
   * hacer la union de cada uno en el main para que sirva como un navegador
   * investigar como hacer interfaz visual




import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Marcador [] marcadores = new Marcador[2];
        Scanner s = new Scanner(System.in);

        int numMarcadores = 0;
        boolean salir= false;
        while (!salir) {
            System.out.print("Digite cuantos marcadores desea agregar: ");
            numMarcadores= s.nextInt();
            s.nextLine();
            for (int i = 0; i < numMarcadores; i++) {
                System.out.println(""" 
                \n Por favor ingrese la categoria, la URL y el titulo
                """);
                var catergoria= s.nextLine();
                var url= s.nextLine();
                var titulo= s.nextLine();
                marcadores[i]= new Marcador();
                marcadores[i].setCategoria(catergoria);
                marcadores[i].setUrl(url);
                marcadores[i].setTitulo(titulo);
            }
            System.out.print("Desea salir S/N: ");
            String eleccion= s.nextLine().toLowerCase().trim();
            if (eleccion.equals("s")){
                salir= true;

            }else{
                System.out.print("Cuantos espacios desea tener:");
                int nuevaPosicion = s.nextInt();
                marcadores = redimensionar(marcadores,nuevaPosicion);
                salir= false;
            }

        }
        for (int i = 0; i <numMarcadores ; i++) {
            marcadores[i].informacion();
            System.out.println();
        }

    }
    public static Marcador[] redimensionar(Marcador[] redimension,int capacidad){
        Marcador [] marcadores = new Marcador[capacidad];
        System.arraycopy(redimension, 0, marcadores,0,redimension.length);
        return marcadores;
    }
}




public class Marcador {
    private String url;
    private String titulo;
    private String categoria;

    public Marcador(){
        this.categoria = "";
        this.titulo= "";
        this.url= "";
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void informacion(){
        System.out.println("URL: " + url + "\nNombre: " + titulo + "\nCategoria: " + categoria);
    }

}





public class Marcador {
    private String url;
    private String titulo;
    private String categoria;

    public Marcador(String url, String titulo, String categoria) {
        this.url = url;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getUrl() { return url; }
    public String getTitulo() { return titulo; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return "Título: " + titulo + ", URL: " + url + ", Categoría: " + categoria;
    }
}