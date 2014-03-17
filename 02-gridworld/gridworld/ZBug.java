import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
  private int steps;
  private int sideLength;
  private boolean edge?;


  public ZBug(int length)
  {
    steps = 0;
    sideLength = length;
    edge = true;
    turn();
    turn();
}

  public void act()
  {
    if (steps < sideLength && canMove())
    {
move();
steps++; }

else if (canMove()) {
      turn();
      turn();
      turn();
      if (edge? == false) {
	turn();
	turn();
	}
      edge? = !edge?;
      steps = 0;
} }
}
