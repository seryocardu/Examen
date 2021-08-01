public class Estrella extends Figura {

    public Estrella(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);
    }

    public Estrella() {
    }

    public void Dibujar() {
        System.out.println("Soy una Estrella");
    }
}