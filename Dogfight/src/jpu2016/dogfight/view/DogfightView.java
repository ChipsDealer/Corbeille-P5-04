package jpu2016.dogfight.view;
import java.lang.Runnable;
import jpu2016.gameframe.*;
import java.util.*;


public class DogfightView implements Runnable, IViewSystem {
		
	
	private GraphicsBuilder graphicsBuilder;
	private EventPerformer eventPerformer;
	private GameFrame gameFrame;
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		// TODO Auto-generated constructor stub
	}
	
	
	public String displayMessage(String message) {
		return message;
	}
	
	public void closeAll() {
		
	}
	
	public void run() {
		
	}	
	
	
	
	
	public GameFrame getGameFrame() {
		return gameFrame;
	}

	public void setGameFrame(GameFrame gameFrame) {
		this.gameFrame = gameFrame;
	}

	public EventPerformer getEventPerformer() {
		return eventPerformer;
	}

	public void setEventPerformer(EventPerformer eventPerformer) {
		this.eventPerformer = eventPerformer;
	}

	public GraphicsBuilder getGraphicsBuilder() {
		return graphicsBuilder;
	}

	public void setGraphicsBuilder(GraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}
}

	
	
	
	

