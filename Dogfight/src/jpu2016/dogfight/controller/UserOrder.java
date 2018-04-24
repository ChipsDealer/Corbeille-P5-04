package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {

	private Order order;

	private int player;

	public UserOrder(int player, Order order) {
		this.player = player;
		this.order = order;
	}

	public int getPlayer() {
		return this.player;
	}


	public Order getOrder() {
		return this.order;
	}
}
