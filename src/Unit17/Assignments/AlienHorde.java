package Unit17.Assignments;


//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Misc.Alex;

public class AlienHorde
{
	private ArrayList<Alien> aliens;

	public AlienHorde(int size)
	{
		Alien[] horde = new Alien[size];
		for(int i = 0; i < size; i++) {
			horde[i] = new Alien((int) (StarFighter.WIDTH/2 + (1.1*Alien.WIDTH*i*alternate(i))), -100, 1);
		}
		setAliens(new ArrayList<Alien>(Arrays.asList(horde)));
	}
	public static int alternate(int i) {
		return i%2 == 0 ? i : -i;
	}
	public void setAliens(ArrayList<Alien> aa) {
		aliens = aa;
	}
	public List<Alien> getAliens() {
		return aliens;
	}
	public void add(Alien al)
	{
	   aliens.add(al);
	}

	public void draw( Graphics window )
	{
		for( Alien a : aliens)
			a.draw( window );
	}

	public void move()
	{
		for(Alien a : aliens)
		{
			a.move(a.getDirection());
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		aliens.removeIf((Alien alien) -> {
			for(Ammo a : shots) {
				if(GameObject.collision(alien, a)) {
					alien.setActive(false);
					a.setActive(false);
					return true;
				}
			}
			return false;
		});
	}

	public String toString()
	{
		return "" + aliens;
	}
}
