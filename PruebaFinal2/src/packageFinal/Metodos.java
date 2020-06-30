package packageFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Metodos {

	public static class Frame extends JFrame {

		private JPanel MostrarMatriz = new JPanel();
		private JButton Boton1 = new JButton();
		private JButton Boton2 = new JButton();
		private JButton Boton3 = new JButton();
		private String mensaje = "";
		private int total = 0;
		private int filas = 17;
		private int columnas = 17;
		private int trupalla = 10;
		private int caguano = 5;
		private int Kromi = 3;
		private int contadorJuego = 1;
		public JButton metroCuadrado[][] = new JButton[filas][columnas];
		public String[][] mensajeClik = new String[filas][columnas];

		public static void main(String[] args) {
			Frame pruebafinaljava = new Frame();
		}

		public Frame() {
			try {
				juego();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void juego() throws Exception {

			this.getContentPane().setLayout(null);
			this.setSize(new Dimension(526, 579));
			this.setTitle("Angry Eggs");

			MostrarMatriz.setBounds(new Rectangle(0, 0, 527, 580));
			MostrarMatriz.setLayout(null);

			Boton1.setText("Reinicio");
			Boton1.setBounds(new Rectangle(00, 510, 170, 30));

			Boton1.setHorizontalTextPosition(SwingConstants.CENTER);

			Boton2.setText("Total");
			Boton2.setBounds(new Rectangle(170, 510, 170, 30));

			Boton2.setHorizontalTextPosition(SwingConstants.CENTER);

			Boton3.setText("Rendirse");
			Boton3.setBounds(new Rectangle(340, 510, 170, 30));

			Boton3.setHorizontalTextPosition(SwingConstants.CENTER);

			Boton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Boton1_actionPerformed(e);
				}
			});
			Boton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent f) {
					Boton2_actionPerformed(f);
				}
			});
			Boton3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent g) {
					Boton3_actionPerformed(g);
				}
			});
			getContentPane().add(Boton1, null);
			getContentPane().add(Boton2, null);
			getContentPane().add(Boton3, null);
			getContentPane().add(MostrarMatriz, null);
			cargarTablero();
			instalartrupalla();
			instalarcaguano();
			instalarCromiK();
			setVisible(true);
			cordenadametroCuadrado();
		}

		private void Boton1_actionPerformed(ActionEvent e) {
			for (int i = 1; i < filas - 1; i++) {
				for (int z = 1; z < columnas - 1; z++) {
					mensajeClik[i][z] = "";
					metroCuadrado[i][z].setEnabled(true);
					metroCuadrado[i][z].setText("");
				}
			}
			instalartrupalla();
			instalarcaguano();
			instalarCromiK();
			this.setTitle("Angry Eggs");
			contadorJuego = contadorJuego + 1;
			Boton1.setText("Batalla " + contadorJuego);
			this.setTitle("... A la carga!!!");
		}

		private void Boton2_actionPerformed(ActionEvent f) {
		}

		private void Boton3_actionPerformed(ActionEvent g) {
			for (int i = 1; i < filas - 1; i++) {
				for (int z = 1; z < columnas - 1; z++) {
					textometroCuadrado();
				}
			}
			total = 0;
			Boton2.setText(" " + total + " Puntos");

			this.setTitle("Si te caes 1 vez, te levantas 2 !!!");
		}
// —– Inicializa el tablero a 0

		public void cargarTablero() {
			for (int i = 0; i < filas; i++) {
				for (int z = 0; z < columnas; z++) {
					mensajeClik[i][z] = "H";
					metroCuadrado[i][z] = new JButton();
					MostrarMatriz.add(metroCuadrado[i][z]);
					metroCuadrado[i][z].setBounds(i * 30, z * 30, 30, 30);
					metroCuadrado[i][z].setMargin(new Insets(0, 0, 0, 0));
					metroCuadrado[i][z].setFont(new Font("Tahoma", 0, 13));

// lanzador de huevos
					metroCuadrado[i][z].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent lanzarHuevo) {
							for (int i = 1; i < filas - 1; i++) {
								for (int z = 1; z < columnas - 1; z++) {
									if (lanzarHuevo.getSource() == metroCuadrado[i][z]) {
										showTextTop(i, z);

									}
								}
							}
						}
					});

				}
			}
		}

		public void instalartrupalla() {
			double I = 0;
			double Z = 0;
			int contadorpacosT = 0;
			do {
				I = Math.random() * getfilas();
				Z = Math.random() * getcolumnas();
				int i = (int) I;
				int z = (int) Z;
				{
					if (mensajeClik[i][z] != ("T") && i > 0 && i < 16 && z > 0 && z < 16) {
						mensajeClik[i][z] = ("T");
						contadorpacosT++;
					}
				}
			} while (contadorpacosT < gettrupalla());
		}

		public void settrupalla(int strupalla) {
			trupalla = strupalla;
		}

		public int gettrupalla() {
			return trupalla;
		}

		public void instalarcaguano() {
			double I = 0;
			double Z = 0;
			int contadorcaguano = 0;
			do {
				I = Math.random() * getfilas();
				Z = Math.random() * getcolumnas();
				int i = (int) I;
				int z = (int) Z;
				{
					if (mensajeClik[i][z] != ("T") && mensajeClik[i][z] != ("C") && i > 0 && i < 15 && z > 0
							&& z < 16) {
						mensajeClik[i][z] = ("C");
						mensajeClik[i + 1][z] = ("C");
						contadorcaguano++;
					}
				}
			} while (contadorcaguano < getcaguano());
		}

		public void setZorriloC(int Caguano) {
			caguano = Caguano;
		}

		public int getcaguano() {
			return caguano;
		}

		public void instalarCromiK() {
			double I = 0;
			double Z = 0;
			int contadorKromi = 0;
			do {
				I = Math.random() * getfilas();
				Z = Math.random() * getcolumnas();
				int i = (int) I;
				int z = (int) Z;
				{
					if (mensajeClik[i][z] != ("T") && mensajeClik[i][z] != ("C") && mensajeClik[i][z] != ("K") && i > 0
							&& i < 16 && z > 0 && z < 14) {
						mensajeClik[i][z] = ("K");
						mensajeClik[i][z + 1] = ("K");
						mensajeClik[i][z + 2] = ("K");
						contadorKromi++;
					}
				}
			} while (contadorKromi < getKromi());
		}

		public void setKromi(int Kromi) {
			Kromi = Kromi;
		}

		public int getKromi() {
			return Kromi;
		}

		public void setfilas(int Filas) {
			filas = Filas;
		}

		public int getfilas() {
			return filas;
		}

		public void setcolumnas(int scolumnas) {
			columnas = scolumnas;
		}

		public int getcolumnas() {
			return columnas;
		}

		public void setmensaje(String smensaje) {
			mensaje = smensaje;
		}

		public String getmensaje() {
			return mensaje;
		}

		public void settotal(int stotal) {
			total = stotal;
		}

		public int gettotal() {
			return total;
		}

// —- Escribo las coordenada en los laterales.
		public void cordenadametroCuadrado() {
			for (int i = 0; i < filas; i++) {
				for (int z = 0; z < columnas; z++) {

					if (z == 0 && i > 0 && i < columnas - 1) {
						metroCuadrado[i][z].setText("" + i);
					}
					if (z == filas - 1 && i > 0 && i < columnas - 1) {
						metroCuadrado[i][z].setText("" + i);
					}
					if (i == 0 && z > 0 && z < filas - 1) {
						metroCuadrado[i][z].setText("" + z);
					}
					if (i == columnas - 1 && z > 0 && z < filas - 1) {
						metroCuadrado[i][z].setText("" + z);
					}
				}
			}
		}

// —- Muestra el texto en todos los metroCuadrado cuando hay paco,zorrillo o
// micro.

		public void textometroCuadrado() {
			for (int i = 1; i < filas - 1; i++) {
				for (int z = 1; z < columnas - 1; z++) {
					metroCuadrado[i][z].setText(mensajeClik[i][z]);
					metroCuadrado[i][z].setEnabled(false);
					Boton1.setText("¿Reiniciar?");
				}
			}
		}

// Suma y mensajes variados

		public void showTextTop(int i, int z) {
			metroCuadrado[i][z].setText(mensajeClik[i][z]);
			metroCuadrado[i][z].setEnabled(false);

			if (mensajeClik[i][z] == "") {
				metroCuadrado[i][z].setEnabled(false);
				mensaje = "casi intentalo denuevo";
			} else {

				if (metroCuadrado[i][z].getText() == "T") {
					total = total + 1;
					mensaje = "Trupaya derrotada, ¡Sigue asi!";
					Boton2.setText("1 Punto");
					this.setTitle(mensaje + " Total " + total + " Puntos");
				}
				if (metroCuadrado[i][z].getText() == "C") {
					total = total + 2;
					mensaje = "Una parte de un Caguano, ¡Sigue asi!";
					Boton2.setText("2 Puntos");
					this.setTitle(mensaje + " Total " + total + " Puntos");
					if (metroCuadrado[i + 1][z].getText() == "C" || metroCuadrado[i - 1][z].getText() == "C") {
						mensaje = "Caguano derrotado 2 puntos, mas 7 extra.";
						total = total + 7;
						Boton2.setText("7 Puntos");
						this.setTitle(mensaje + " Total " + total + " Puntos");
					}
				}

				if (metroCuadrado[i][z].getText() == "K") {
					mensaje = "Una parte de una Kromi, ¡Sigue asi!";
					total = total + 3;
					Boton2.setText("3 Puntos");
					this.setTitle(mensaje + " Total " + total + " Puntos");
					if (metroCuadrado[i][z + 2].getText() == "K" || metroCuadrado[i][z - 2].getText() == "K") {
						mensaje = "Kromi derrotada 3 puntos, mas 10 extra.";
						total = total + 10;
						Boton2.setText("10 Puntos");
						this.setTitle(mensaje + " Total " + total + " Puntos");
					}
				}

				if (total > 93) {
					finalGame();
				}
			}
		}

// Fin ganar
		public void finalGame() {
			this.setTitle("Eres nombrado ''Awake Emerito'' ");
			Boton1.setText("Champeon");
		}
	}

}
