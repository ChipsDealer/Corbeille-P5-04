package jpu2016.gameframe;

import java.awt.Graphics;
//import javax.swing.JPanel; 
//import java.util.Observer;
import java.util.Observable;

public class GamePanel extends javax.swing.JPanel implements java.util.Observer{

	private IGraphicsBuilder graphicsBuilder; 
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		// TODO Auto-generated constructor stub
	}
	
	public void update(Observable observer) {
		
	}
	
	public void paintComponent(Graphics graphic) {
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}


}
