public class Main {
    public static void main(String[] args) throws Exception {

        Lienzo lienzo = new Lienzo();

        Figura figura1 = Build.build("ESTRELLA");
        figura1.getClass().getName();
        lienzo.add(figura1, new Rectangulo(new Point(2, 2), new Point(5, 5)));

        Figura figura2 = Build.build("CORAZON");
        lienzo.add(figura2, new Rectangulo(new Point(0, 0), new Point(3, 3)));

        Figura figura3 = Build.build("RAYO");
        lienzo.add(figura3, new Rectangulo(new Point(2, 6), new Point(9, 7)));

        System.out.println(lienzo.lista);
        System.out.println("Soy un " + figura1 + " de color " + figura1.getColorFondo() + " con borde " + figura1.getColorBorde());
        System.out.println("Soy un " + figura2 + " de color " + figura2.getColorFondo() + " con borde " + figura2.getColorBorde());
        System.out.println("Soy un " + figura3 + " de color " + figura3.getColorFondo() + " con borde " + figura3.getColorBorde());

    }

}