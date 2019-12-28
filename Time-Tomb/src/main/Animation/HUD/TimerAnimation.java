package main.Animation.HUD;

import java.awt.image.BufferedImage;

import main.Game;
import main.Animation.Animation;

public class TimerAnimation extends Animation{

	public TimerAnimation(Game game) {
		super(game);
		this.width = 112;
		this.height = 112;
		this.fps = 10;
	}

	@Override
	public void loadImages() {
		for(BufferedImage i: game.img_timer){
			imgList.add(i);
		}
	}

}
