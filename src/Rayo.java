public class Rayo extends Figura {

    public Rayo(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);

    }

    public Rayo() {
    }

    public void Dibujar() {
        System.out.println("Soy un Rayo");
    }
}