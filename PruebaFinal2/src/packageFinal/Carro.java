package packageFinal;

import java.util.Arrays;

public class Carro {
int cantOcupantes = 0;
String fechaIngreso = "";
int metroCuadrado[][] = new int[15][15];
public int getCantOcupantes() {
	return cantOcupantes;
}
public void setCantOcupantes(int CantOcupantes) {
	this.cantOcupantes = CantOcupantes;
}
public String getFechaIngreso() {
	return fechaIngreso;
}
public void setFechaIngreso(String FechaIngreso) {
	this.fechaIngreso = FechaIngreso;
}
public int[][] getMetroCuadrado() {
	return metroCuadrado;
}
public void setMetroCuadrado(int[][] MetroCuadrado) {
	this.metroCuadrado = MetroCuadrado;
}
@Override
public String toString() {
	return "Carro [cantOcupantes=" + cantOcupantes + ", fechaIngreso=" + fechaIngreso + ", metroCuadrado="
			+ Arrays.toString(metroCuadrado) + "]";
}
public Carro(int CantOcupantes, String FechaIngreso, int[][] MetroCuadrado) {
	this.cantOcupantes = CantOcupantes;
	this.fechaIngreso = FechaIngreso;
	this.metroCuadrado = MetroCuadrado;
}

		}

		
		