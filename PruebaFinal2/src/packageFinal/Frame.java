package packageFinal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	private final long serialVersionUID = (long) 1.1;
	private JPanel jPanel1 = new JPanel();
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JButton jButton3 = new JButton();
	private String mensaje = "";
	private int total = 0;
	private int filas = 17;
	private int columnas = 17;
	private int pacoT = 10;
	private int zorrilloC = 5;
	private int kromiK = 3;
	private int contadorJuego = 1;
	public JButton metroCuadrado[][] = new JButton[filas][columnas];
	public String[][] mensajeClik = new String[filas][columnas];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
