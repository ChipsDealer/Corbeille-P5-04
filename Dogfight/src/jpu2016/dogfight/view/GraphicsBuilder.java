package jpu2016.dogfight.view;

import jpu2016.dogfight.model;

import java.awt.Graphics;
import java.awt.image.*;


public class GraphicsBuilder implements jpu2016.gameframe.IGraphicsBuilder {
		
	private IDogfightModel dogfightModel;
	private BufferedImage emptySky;
	
	public GraphicsBuilder(final IDogfightModel dogfightmodel) {
		// TODO Auto-generated constructor stub
			
	}
	public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {
		
	}
	private void buildEmptySky() {
		
	}
	
	private void drawMobile(final IMobile mobile, final Graphics graphics, final ImageObserver observer) {
		
	}
	 public int getGlobalWidth() {
		 return 5;
	}
	 
	 public int getGlobalHeight() {
		 return 5;
	}
	
		

}

