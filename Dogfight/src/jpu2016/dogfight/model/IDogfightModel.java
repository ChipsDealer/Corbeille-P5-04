package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;

public interface IDogfightModel {
	
	public IArea getArea();
	
	public void buildArea(final Dimension dimension);
	
	public void addMobile(final IMobile Mobile);
	
	public void removeMobile(final IMobile Mobile);
	
	public ArrayList<IMobile> getMobiles();
	
	public IMobile getMobileByPlayer(final int player);
	
	public void setMobilesHavesMoved();
	

}
