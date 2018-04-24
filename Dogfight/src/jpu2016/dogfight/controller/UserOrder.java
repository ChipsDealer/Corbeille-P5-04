package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder{
	private int player;
	private Order order;
	
	public UserOrder(int player, Order order) 
	{
		
	}
	
	@Override
	public Order getOrder() {
		return this.order;
	}
	@Override
	public int getPlayer() {
		return this.player;
	}
	

}
