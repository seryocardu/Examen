import java.util.*;

public class Lienzo implements Draw {

	Figura figura;
	IFigura ifigura;
	List<Figura> lista = new ArrayList<Figura>();

	public void Dibujar() {

		figura.setColorBorde("Negro");
		figura.setColorFondo("Blanco");
	}

	public void add(Figura figura, Rectangulo rectangulo) {
		figura.setRectangulo(rectangulo);
		lista.add(figura);
		figura.Dibujar();
		figura.setColorBorde("Negro");
		figura.setColorFondo("Blanco");
	}
	public void getSelected(Point randomPoint){
		for(int i=0; i<lista.size(); i++){
			lista.get(i);
		}
	}
}
