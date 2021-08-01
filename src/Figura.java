public abstract class Figura implements IFigura, Draw {

    protected String colorBorde;
    protected String colorFondo;
    protected Rectangulo rectangulo;
    // private enumFigura enumFigura;

    public Figura(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        this.colorBorde = colorBorde;
        this.colorFondo = colorFondo;
        this.rectangulo = rectangulo;
    }
    
    public Figura() {

    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

}