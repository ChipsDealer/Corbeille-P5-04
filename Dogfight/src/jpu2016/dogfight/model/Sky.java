package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Dimension;

public class Sky implements IArea{

	
	private Image image;
	
	private Dimension dimension;

	
	
	
	
	//Constructeur
	public Sky(final jpu2016.dogfight.model.Dimension p_dimension) {
		
	}
	
	public Dimension getDimension() {
		return new Dimension();
	}
	
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	
	

}
