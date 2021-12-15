package ui;

import javax.swing.JFrame;

import models.Pokemon;
import models.Tipos_Pokemon;
import utils.Almacen;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pokedex {
	private int position = 0, positionBack, positionFront;

	private JFrame frmPokedex;
	private JFrame parent;
	private Box hbTop_Top = Box.createHorizontalBox();
	private JButton btnPkmnAnterior = new JButton();
	private JLabel lblPkmnActual = new JLabel();
	private Component hgTop_Top_1 = Box.createHorizontalGlue();
	private Component hgTop_Top_2 = Box.createHorizontalGlue();
	private JButton btnPkmnSiguiente = new JButton();
	private Component vgPokedex_1 = Box.createVerticalGlue();
	private Component vgPokedex_2 = Box.createVerticalGlue();
	private Box vbMid = Box.createVerticalBox();
	private Box hbNombre = Box.createHorizontalBox();
	private JLabel lblNombre = new JLabel();
	private JLabel lblNumero = new JLabel();
	private Box vbStats = Box.createVerticalBox();
	private Box hbAlturaCategoria = Box.createHorizontalBox();
	private Box hbPesoHabilidad = Box.createHorizontalBox();
	private Box hbTipos = Box.createHorizontalBox();
	private final Box hbTop_Sub = Box.createHorizontalBox();
	private final JLabel lblPkmnAnterior = new JLabel();
	private final Box vbAltura = Box.createVerticalBox();
	private final JLabel lblTxtAltura = new JLabel("Altura");
	private final JLabel lblAltura = new JLabel();
	private final Box vbCategoria = Box.createVerticalBox();
	private final JLabel lblCategoria = new JLabel();
	private final JLabel lblTxtCategoria = new JLabel("Categoria");
	private final Box vbPeso = Box.createVerticalBox();
	private final JLabel lblTxtPeso = new JLabel("Peso");
	private final JLabel lblPeso = new JLabel();
	private final Box vbHabilidad = Box.createVerticalBox();
	private final JLabel lblTxtHabilidad = new JLabel("Habilidad");
	private final JLabel lblHabilidad = new JLabel();
	private final Box vbTipo = Box.createVerticalBox();
	private final JLabel lblTxtTipo = new JLabel("Tipo");
	private final Box hbTipo = Box.createHorizontalBox();
	private final JLabel lblTipo1 = new JLabel();
	private final JLabel lblTipo2 = new JLabel();
	private final Component vsMid_1 = Box.createVerticalStrut(60);
	private final JLabel lblAlturaEspacio = new JLabel("   ");
	private final JLabel lblAltCatEspacio = new JLabel("     ");
	private final JLabel lblCategoriaEspacio = new JLabel(" ");
	private final JLabel lblStatsEspacio_1 = new JLabel(" ");
	private final JLabel lblStatsEspacio_2 = new JLabel(" ");
	private final JLabel lblPesHabEspacio = new JLabel("       ");
	private final JLabel lblPesoEspacio = new JLabel(" ");
	private final JLabel lblHabEspacio = new JLabel(" ");
	private final JLabel lblStatsEspacio_3 = new JLabel(" ");
	private final JLabel lblStatsEspacio_4 = new JLabel(" ");
	private final Box hbTxtTipo = Box.createHorizontalBox();
	private final JLabel lblTxtTipoEspacio = new JLabel("                        ");
	private final JLabel lblTipoEspacio = new JLabel(" ");
	private final JLabel lblTiposEspacio_1 = new JLabel("   ");
	private final Box hbSub = Box.createHorizontalBox();
	private final Component hgSub_1 = Box.createHorizontalGlue();
	private final JButton btnCrear = new JButton("Crear");
	private final JButton btnActualizar = new JButton("Actualizar");
	private final Component hsSub_3 = Box.createHorizontalStrut(40);
	private final JButton btnBorrar = new JButton("Borrar");
	private final Component hgSub_2 = Box.createHorizontalGlue();
	private final JButton btnConocer = new JButton("Conocer");
	private final JButton btnOlvidar = new JButton("Olvidar");
	private final Component hsSub_2 = Box.createHorizontalStrut(40);
	private final Component hsSub_1 = Box.createHorizontalStrut(40);

	/**
	 * Create the application.
	 */
	public Pokedex(JFrame parent) {
		Almacen.pokemons.add(new Pokemon(1, "Bulbasaur", Tipos_Pokemon.Planta, Tipos_Pokemon.Veneno, 0.7, 6.9,
				"Espesura", "Semilla", true));
		Almacen.pokemons.add(new Pokemon(2, "Ivysaur", Tipos_Pokemon.Planta, Tipos_Pokemon.Veneno, 1, 13, "Espesura",
				"Semilla", false));
		Almacen.pokemons.add(new Pokemon(3, "Venusaur", Tipos_Pokemon.Planta, Tipos_Pokemon.Veneno, 2, 100, "Espesura",
				"Semilla", false));
		Almacen.pokemons.add(new Pokemon(4, "Charmander", Tipos_Pokemon.Fuego, Tipos_Pokemon.Ninguno, 0.6, 8.5,
				"Mar Llamas", "Lagartija", true));
		Almacen.pokemons.add(new Pokemon(5, "Charmeleon", Tipos_Pokemon.Fuego, Tipos_Pokemon.Ninguno, 1.1, 19,
				"Mar Llamas", "LLama", false));
		Almacen.pokemons.add(new Pokemon(6, "Charizard", Tipos_Pokemon.Fuego, Tipos_Pokemon.Volador, 1.7, 90.5,
				"Mar Llamas", "Lagartija", false));
		Almacen.pokemons.add(new Pokemon(7, "Squirtle", Tipos_Pokemon.Agua, Tipos_Pokemon.Ninguno, 0.5, 9, "Torrente",
				"Tortuguita", true));
		Almacen.pokemons.add(new Pokemon(8, "Wartortle", Tipos_Pokemon.Agua, Tipos_Pokemon.Ninguno, 1, 22.5, "Torrente",
				"Tortuga", false));
		Almacen.pokemons.add(new Pokemon(9, "Blastoise", Tipos_Pokemon.Agua, Tipos_Pokemon.Ninguno, 1.6, 85.5,
				"Torrente", "Armazón", false));
		this.positionBack = Almacen.pokemons.size() - 1;
		this.positionFront = position + 1;
		this.parent = parent;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.parent.setVisible(false);
		frmPokedex = new JFrame();
		frmPokedex.setTitle("Pokedex");
		frmPokedex.setBounds(100, 100, 1150, 800);
		frmPokedex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokedex.getContentPane().setLayout(new BoxLayout(frmPokedex.getContentPane(), BoxLayout.PAGE_AXIS));
		updateText();
		setUIComponents();
		setUIBehaviour();
	}

	public void setUIComponents() {
		frmPokedex.getContentPane().add(hbTop_Top);
		hbTop_Top.add(btnPkmnAnterior);

		hbTop_Top.add(hgTop_Top_1);
		hbTop_Top.add(lblPkmnActual);

		hbTop_Top.add(hgTop_Top_2);
		hbTop_Top.add(btnPkmnSiguiente);

		frmPokedex.getContentPane().add(hbTop_Sub);

		hbTop_Sub.add(lblPkmnAnterior);

		frmPokedex.getContentPane().add(vgPokedex_1);

		frmPokedex.getContentPane().add(vbMid);

		vbMid.add(hbNombre);

		hbNombre.add(lblNombre);

		hbNombre.add(lblNumero);

		vbMid.add(vsMid_1);

		vbMid.add(vbStats);

		vbStats.add(hbAlturaCategoria);

		hbAlturaCategoria.add(vbAltura);

		vbAltura.add(lblTxtAltura);

		vbAltura.add(lblAlturaEspacio);

		vbAltura.add(lblAltura);

		hbAlturaCategoria.add(lblAltCatEspacio);

		hbAlturaCategoria.add(vbCategoria);

		vbCategoria.add(lblTxtCategoria);

		vbCategoria.add(lblCategoriaEspacio);

		vbCategoria.add(lblCategoria);

		vbStats.add(lblStatsEspacio_1);

		vbStats.add(lblStatsEspacio_2);

		vbStats.add(hbPesoHabilidad);

		hbPesoHabilidad.add(vbPeso);

		vbPeso.add(lblTxtPeso);

		vbPeso.add(lblPesoEspacio);

		vbPeso.add(lblPeso);

		hbPesoHabilidad.add(lblPesHabEspacio);

		hbPesoHabilidad.add(vbHabilidad);

		vbHabilidad.add(lblTxtHabilidad);

		vbHabilidad.add(lblHabEspacio);

		vbHabilidad.add(lblHabilidad);

		vbStats.add(lblStatsEspacio_3);

		vbStats.add(lblStatsEspacio_4);

		vbStats.add(hbTipos);

		hbTipos.add(vbTipo);

		vbTipo.add(hbTxtTipo);
		hbTxtTipo.add(lblTxtTipo);

		hbTxtTipo.add(lblTxtTipoEspacio);

		vbTipo.add(lblTipoEspacio);

		vbTipo.add(hbTipo);

		hbTipo.add(lblTipo1);

		hbTipo.add(lblTiposEspacio_1);

		hbTipo.add(lblTipo2);

		frmPokedex.getContentPane().add(vgPokedex_2);

		frmPokedex.getContentPane().add(hbSub);

		hbSub.add(hgSub_1);
		
		hbSub.add(btnConocer);
		
		hbSub.add(btnOlvidar);
		
		hbSub.add(hsSub_1);

		hbSub.add(btnCrear);
		
		hbSub.add(hsSub_2);

		hbSub.add(btnActualizar);

		hbSub.add(hsSub_3);

		hbSub.add(btnBorrar);

		hbSub.add(hgSub_2);
		frmPokedex.setVisible(true);
	}

	public void setUIBehaviour() {
		btnPkmnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (position == Almacen.pokemons.size() - 1) {
					position = 0;
					positionFront = position + 1;
					positionBack = Almacen.pokemons.size() - 1;
				} else {
					position++;
					if (positionBack == Almacen.pokemons.size() - 1) {
						positionBack = 0;
					} else {
						positionBack++;
					}
					if (positionFront == Almacen.pokemons.size() - 1) {
						positionFront = 0;
					} else {
						positionFront++;
					}
				}
				updateText();
			}
		});

		btnPkmnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (position == 0) {
					position = Almacen.pokemons.size() - 1;
					positionFront = 0;
					positionBack = Almacen.pokemons.size() - 2;
				} else {
					position--;
					if (positionBack == 0) {
						positionBack = Almacen.pokemons.size() - 1;
					} else {
						positionBack--;
					}
					if (positionFront == 0) {
						positionFront = Almacen.pokemons.size() - 1;
					} else {
						positionFront--;
					}
				}
				updateText();
			}
		});
	}

	public void updateText() {
		if (Almacen.pokemons.get(positionBack).isConocido())
			btnPkmnAnterior.setText("<   " + Almacen.pokemons.get(positionBack).getNumeroPokedex() + " "
					+ Almacen.pokemons.get(positionBack).getNombre());
		else
			btnPkmnAnterior.setText("<   " + Almacen.pokemons.get(positionBack).getNumeroPokedex() + " ?????????");

		if (Almacen.pokemons.get(position).isConocido()) {
			lblPkmnActual.setText(Almacen.pokemons.get(position).getNombre());
			lblAltura.setText(Double.toString(Almacen.pokemons.get(position).getAltura()));
			lblNombre.setText(Almacen.pokemons.get(position).getNombre());
			lblNumero.setText("   Nº " + Almacen.pokemons.get(position).getNumeroPokedex());
			lblCategoria.setText(Almacen.pokemons.get(position).getCategoria());
			lblPeso.setText(Double.toString(Almacen.pokemons.get(position).getPeso()));
			lblHabilidad.setText(Almacen.pokemons.get(position).getHabilidad());

			lblTipo1.setText(Almacen.pokemons.get(position).getTipo1());
			if (!Almacen.pokemons.get(position).getTipo2().equals("Ninguno"))
				lblTipo2.setText(Almacen.pokemons.get(position).getTipo2());
			else
				lblTipo2.setText("");
			
			btnConocer.setVisible(false);
			btnOlvidar.setVisible(true);
		} else {
			lblPkmnActual.setText("?????????");
			lblAltura.setText("?????????");
			lblNombre.setText("?????????");
			lblNumero.setText("   Nº " + Almacen.pokemons.get(position).getNumeroPokedex());
			lblCategoria.setText("?????????");
			lblPeso.setText("?????????");
			lblHabilidad.setText("?????????");

			lblTipo1.setText("?????????");
			if (!Almacen.pokemons.get(position).getTipo2().equals("Ninguno"))
				lblTipo2.setText("?????????");
			else
				lblTipo2.setText("");
			
			btnConocer.setVisible(true);
			btnOlvidar.setVisible(false);
		}

		if (Almacen.pokemons.get(positionFront).isConocido())
			btnPkmnSiguiente.setText(Almacen.pokemons.get(positionFront).getNumeroPokedex() + " "
					+ Almacen.pokemons.get(positionFront).getNombre() + "   >");
		else
			btnPkmnSiguiente.setText(Almacen.pokemons.get(positionFront).getNumeroPokedex() + " ?????????   >");

	}
}
