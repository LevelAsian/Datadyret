package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState{
	String balle = "Banan";
	Image ken;
	int kenx = 100;
	int keny = 100;
	int poeng = 0;
	String kake = Integer.toString(poeng);
	
	public Menu(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		ken = new Image("res/snoppen.jpg");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("Welcome to The Game", 50, 50);
		g.drawString(balle, 100, 200);
		g.drawString(kake, 50, 100);
		g.drawImage(ken, kenx, keny);
		g.drawOval(50, 300, 200, 100);
		g.drawString("PUSH", 130, 345);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		balle = "x: " + xpos + ", y: " + ypos + ".";
		Input input = gc.getInput();
		if(input.isKeyDown(Input.KEY_UP)){keny-=1;}
		if(input.isKeyDown(Input.KEY_DOWN)){keny+=1;}
		if(input.isKeyDown(Input.KEY_LEFT)){kenx-=1;}
		if(input.isKeyDown(Input.KEY_RIGHT)){kenx+=1;}
		
		if(input.isMousePressed(0)){poeng+=1;}
		kake = "Du har " + poeng + " poeng.";
		
		if((xpos>50 && xpos<250) && (ypos>500 && ypos<600)){
			if(input.isMouseButtonDown(0)){
				sbg.enterState(1);
			}
		}
	}
	
	public int getID(){
		return 0;
	}
}
