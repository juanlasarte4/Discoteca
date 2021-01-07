package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MisAlbums {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MisAlbums window = new MisAlbums();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MisAlbums() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel campoNombre = new JLabel("");
		campoNombre.setBounds(110, 122, 48, 14);
		frame.getContentPane().add(campoNombre);
		
		JLabel campoAnno = new JLabel("a");
		campoAnno.setBounds(295, 122, 48, 14);
		frame.getContentPane().add(campoAnno);
		
		JLabel campoArtista = new JLabel("a");
		campoArtista.setBounds(443, 122, 48, 14);
		frame.getContentPane().add(campoArtista);
		
		JLabel campoFormato = new JLabel("a");
		campoFormato.setBounds(585, 122, 48, 14);
		frame.getContentPane().add(campoFormato);
		
		JButton botonAnterior = new JButton("Anterior");
		botonAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botonAnterior.setBounds(163, 333, 89, 23);
		frame.getContentPane().add(botonAnterior);
		
		JButton botonSiguiente = new JButton("Siguiente");
		botonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botonSiguiente.setBounds(402, 333, 89, 23);
		frame.getContentPane().add(botonSiguiente);
	}
}