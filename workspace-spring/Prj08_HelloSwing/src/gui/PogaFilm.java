package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Film;
import pl.MVCFilmController;

public class PogaFilm extends JFrame  implements ActionListener{

	JLabel labelTitolo;
	JLabel labelTitoloFilm;
	JLabel labelAnno;
	JLabel labelRating;
	JTextField titolo; 
	JTextField anno; 
	JTextField rating; 
	JButton btn;
	MVCFilmController mvc;
	
	public PogaFilm() {

		this.mvc = new MVCFilmController();
		
		this.labelTitolo = new JLabel("Aggiungi film triste");
		this.labelTitoloFilm = new JLabel();
		this.labelAnno = new JLabel();
		this.labelRating = new JLabel();
		
		this.labelTitolo.setFont(new Font("Arial", Font.PLAIN, 28));
		this.labelAnno.setFont(new Font("Arial", Font.PLAIN, 28));
		this.labelTitoloFilm.setFont(new Font("Arial", Font.PLAIN, 28));
		this.labelRating.setFont(new Font("Arial", Font.PLAIN, 28));
		
		this.titolo = new JTextField();
		titolo.setSize(250, 20);
		labelTitoloFilm.setText("Titolo");
		
		this.anno = new JTextField();
		anno.setSize(50, 20);
		labelAnno.setText("Anno");
		
		this.rating = new JTextField();
		rating.setSize(50, 20);
		labelRating.setText("Valutazione");
		
		this.titolo.setFont(new Font("Arial", Font.PLAIN, 28));
		this.anno.setFont(new Font("Arial", Font.PLAIN, 28));
		this.rating.setFont(new Font("Arial", Font.PLAIN, 28));

		this.btn = new JButton("Add Film");
		btn.addActionListener(this);
		btn.setFont(new Font("Arial", Font.PLAIN, 28));
		btn.setBackground(Color.RED);
		
		BorderLayout border = new BorderLayout(); 
		FlowLayout flow = new FlowLayout(); 
		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(3,2));
		panel.setBackground(new Color(0xCCCCCC));
		panel.add(labelTitoloFilm);
		panel.add(titolo);
		panel.add(labelAnno);
		panel.add(anno);
		panel.add(labelRating);
		panel.add(rating);
		
		
		this.setLayout(border);
		
		 //this.frame = new JFrame();
		this.setTitle("I miei film TRISTI");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(labelTitolo,BorderLayout.NORTH);
		
		this.add(panel, BorderLayout.CENTER);
		
		this.add(btn, BorderLayout.SOUTH);
		
//		frame.pack();
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		  
		PogaFilm pf = new PogaFilm();

	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = titolo.getText();
		String annoText = anno.getText();
		String ratingText = rating.getText();
		Film f = new Film();
		f.setTitolo(text);
		f.setAnno(Integer.parseInt(annoText));
		f.setRating(Double.parseDouble(ratingText));
		
		this.mvc.add(f);
		
		System.out.println("Film da inserire: " + text);
	}

}
