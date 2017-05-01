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
			horde[i] = new Alien(20 + (Alien.WIDTH/2)*i, 10, 1);
		}
		setAliens(new ArrayList<Alien>(Arrays.asList(horde)));
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
		boolean[] dead = new boolean[aliens.size()];
		int count = 0;
		IterateShots: for(int i = 0; i < shots.size();) {
			Ammo s = shots.get(i);
			boolean alienRemoved = false;
			IterateAliens: for(int j = 0; j < aliens.size(); j++) {
				System.out.println(count++);
				Alien a = aliens.get(j);
				
				if(
						GameObject.collision(s, a)
						) {
					
					aliens.remove(j);
					shots.remove(i);
					continue IterateShots;
				}
			}
			i++;
		}
	}

	public String toString()
	{
		return "" + aliens;
	}
}
