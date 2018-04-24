package jpu2016.dogfight.model;

import java.util.*;
import java.awt.*;

public class DogfightModel extends java.util.Observable implements IDogfightModel{
	
	private Sky sky;

	
	/******************************/
	
	IArea a1;
	ArrayList<IMobile> a11;
	
	
	private IMobile mobiles;
	
	
	/******************************/


	public DogfightModel() {
	}
	
	
	public IArea getArea() {
		return  a1;
	}
	
	
	public void buildArea(final Dimension dimension) {
		
	}
	
	public void addMobile(final IMobile Mobile) {
		
	}
	
	public void removeMobile(final IMobile Mobile) {
		
		
	}
	
	public ArrayList<IMobile> getMobiles(){
		return a11;
	}
	
	public IMobile getMobileByPlayer(final int player) {
		return mobiles;
	}
	
	public void setMobilesHavesMoved() {
		
	}


	@Override
	public void buildArea(java.awt.Dimension dimension) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
