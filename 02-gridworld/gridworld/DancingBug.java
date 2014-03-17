import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
  private int[] turns;
  private int i;


  public DancingBug(int[] t)
  {
    turns = t;
    i = 0;
}

	public void makeTurns() {
		for (int j = 0; j<turns[i]; j++)
			turn();
		i++;
		if (i <= turns.length)
			i = 0;
	}

  public void act() {
	if (canMove())
		move();
	makeTurns();
  }
	
