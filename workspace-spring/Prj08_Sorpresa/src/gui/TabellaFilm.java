package gui;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import pl.MVCFilmController;

public class TabellaFilm extends JFrame{

	MVCFilmController controller;
	
	public TabellaFilm() {

		controller = new MVCFilmController();
		
        //intestazioni
        String[] columns = new String[] {
            "Id", "Titolo", "Anno", "Rating"
        };
        
        List<String> all = controller.getAll();
        
        
        
        //film in tabella
        Object[][] data = new Object[][] {
            {1, "John", 40.0, false },
            {2, "Rambo", 70.0, false },
            {3, "Zorro", 60.0, true },
        };
        //create table with data
        JTable table = new JTable(controller.getFilmsObject(), columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("I film più tristi");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
	
	}
	
	public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TabellaFilm();
            }
        });
    }  
	
}
