public class Corazon extends Figura {

    public Corazon(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);
    }

    public Corazon() {
    }

    public void Dibujar() {
        System.out.println("Soy un corazón");
    }
}