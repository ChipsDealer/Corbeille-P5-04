package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.*;

public class DogFightController implements IOrderPerformer {

	private IDogfightModel dogfightModel;

	private IViewSystem viewSystem;

	private static int TIME_SLEEP = 30;

	public DogFightController(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	public void orderPerform(UserOrder userOrder) {

	}

	public void play() {

	}

	public void setViewSystem(IViewSystem viewSystem) {

	}

	private void launchMissile(int player) {

	}

	private void gameLoop() {

	}
}
