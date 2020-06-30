package packageFinal;

public class Kromi extends Carro {
	int anoFabricacion = 0;
	String marca = "";
public Kromi(int CantOcupantes, String FechaIngreso, int[][] MetroCuadrado) {
		super(CantOcupantes, FechaIngreso, MetroCuadrado);
		// TODO Auto-generated constructor stub
	}
public int getAnoFabricacion() {
	return anoFabricacion;
}
public void setAnoFabricacion(int AnoFabricacion) {
	this.anoFabricacion = AnoFabricacion;
}
public String getMarca() {
	return marca;
}
public void setMarca(String Marca) {
	this.marca = Marca;
}


}
