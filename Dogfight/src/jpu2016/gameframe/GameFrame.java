package jpu2016.gameframe;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.Observable;

public class GameFrame extends JFrame implements KeyListener{
	
	private IEventPerformer eventPerformer;
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		// TODO Auto-generated constructor stub
	}
	public void keyPressed(KeyEvent keyEvent) {
		
	}
	public void keyReleased(KeyEvent keyEvent) {
		
	}
	public void keyTyped(KeyEvent keyEvent) {
		
	}
	
	
	
	public IEventPerformer getEventPerformer() {
		return eventPerformer;
	}
	public void setEventPerformer(IEventPerformer eventPerformer) {
		this.eventPerformer = eventPerformer;
	}

}
