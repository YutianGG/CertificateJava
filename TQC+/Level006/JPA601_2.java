
public class JPA601_2 
{
	public static void main(String[] args)
	{
		BasicCar bc = new BasicCar(1600, "Manual");
		System.out.println("BasicCar cost:" + bc.cost());
		System.out.println("BasicCar price:" + bc.price());
		LuxCar lc = new LuxCar(2000, "Auto");
		System.out.println("LuxCar cost:" + lc.cost());
		System.out.println("LuxCar price:" + lc.price());
	}
}

abstract class Car 
{
	Engine engine;
	Aircond aircond;
	
	Car(Engine engine, Aircond aircond)
	{
		this.engine = engine;
		this.aircond = aircond;
	}
	
	int getPartCost() 
	{		
		return engine.getCost() + aircond.getCost();
	}
	
	abstract double cost();
	
	double price() 
	{
		return cost() * 1.2;
	}
}

class BasicCar extends Car
{
	BasicCar(int cc, String aircond)
	{
		super(new Engine(cc), new Aircond(aircond));
	}
	
	double cost() 
	{
		return getPartCost() + 5000;
	}
}

class LuxCar extends Car {
	LuxCar(int cc, String aircond) 
	{
		super(new Engine(cc), new Aircond(aircond));
	}
	
	double cost()
	{
		return getPartCost() + 10000;
	}
}
