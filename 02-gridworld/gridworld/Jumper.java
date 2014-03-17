package info.gridworld.actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class Jumper extends Bug {

	public Jumper() {
		super();
	}
	
	public boolean canJump() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
		if (!gr.isValid(next))
			return false;
		Actor neighbor = gr.get(next);
		return (neighbor == null) || (neighbor instanceof Flower);
	}

	public void jump() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();
	}

	public void move() {
 	   Grid<Actor> gr = getGrid();
 	   if (gr == null)
 	     return;
 	   Location loc = getLocation();
 	   Location next = loc.getAdjacentLocation(getDirection());
 	   if (gr.isValid(next))
 	     moveTo(next);
 	   else
 	     removeSelfFromGrid();
	}

	public void act() {
		if (canJump())
			jump();
		else if (canMove())
			move();
		else
			turn();
	}

}




































