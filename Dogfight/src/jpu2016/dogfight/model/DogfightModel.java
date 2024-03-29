package jpu2016.dogfight.model;

import java.util.*;
import java.awt.*;


public class DogfightModel extends java.util.Observable implements IDogfightModel{
	
	private Sky sky;

	
	/******************************/
	
	IArea a1;
	
	
	
	//Collection d'objets
	private ArrayList<IMobile> mobiles;
	
	
	/******************************/

	
	private IMobile mobiles1;
	
	
	/******************************/


	public DogfightModel() {
	}
	
	
	public IArea getArea() {
		return  a1;
	}
	
	
	public void buildArea(final Dimension dimension) {
		this.sky = new Sky(dimension);
	}
	
	public void addMobile(final IMobile Mobile) {
		
	}
	
	public void removeMobile(final IMobile Mobile) {
		
		
	}
	
	public ArrayList<IMobile> getMobiles(){
		return mobiles;
	}
	
	public IMobile getMobileByPlayer(final int player) {
		return mobiles1;
	}
	
	public void setMobilesHavesMoved() {
		
	}


	@Override
	public void buildArea(java.awt.Dimension dimension) {
		// TODO Auto-generated method stub
		
	}


	public Sky getSky() {
		return sky;
	}


	public void setSky(Sky sky) {
		this.sky = sky;
	}


	public IArea getA1() {
		return a1;
	}


	public void setA1(IArea a1) {
		this.a1 = a1;
	}


	public ArrayList<IMobile> getA11() {
		return mobiles;
	}


	public void setA11(ArrayList<IMobile> a11) {
		this.mobiles = mobiles;
	}


	public void setMobiles(IMobile mobiles1) {
		this.mobiles1 = mobiles1;
	}
	
	
	

}
