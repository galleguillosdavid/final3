package packageFinal;

public class Caguano extends Carro {
	int alcance = 0;
	String colorconf = "";
	
public int getAlcance() {
	return alcance;
}
public void setAlcance(int alcance) {
	this.alcance = alcance;
}
public String getColorconf() {
	return colorconf;
}
public void setColorconf(String colorconf) {
	this.colorconf = colorconf;
}
public Caguano(int[][] MetroCuadrado, int Alcance, String Colorconf) {
	super(Alcance, Colorconf, MetroCuadrado);
	this.alcance = Alcance;
	this.colorconf = Colorconf;
}


}
