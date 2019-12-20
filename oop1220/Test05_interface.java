package oop1220;
class Unit{
	int currentHP;
	int x,y;
}

interface Movable{
	
	void move(int x,int y);
}

interface Attackable{
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable{
	
}


class Fight extends Unit implements Fightable{
	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}


class Fight2 implements Movable, Attackable{
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
}


public class Test05_interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
