package Spillet;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState{
	
	public Play(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("Halla", 50, 50);
		g.drawOval(400, 300, 200, 100);
		g.drawString("PUSH", 480, 345);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		Input input = gc.getInput();
		if((xpos>400 && xpos<700) && (ypos>500 && ypos<600)){
			if(input.isMouseButtonDown(0)){
				sbg.enterState(0);
			}
		}
	}
	
	public int getID(){
		return 1;
	}
}
