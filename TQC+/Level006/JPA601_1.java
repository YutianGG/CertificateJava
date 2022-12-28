
public class JPA601_1
{
	public static void main(String[] args) 
	{
		Engine e1 = new Engine(1600);
		System.out.println("1600:" + e1.getCost());
		Engine e2 = new Engine(2000);
		System.out.println("2000:" + e2.getCost());
		Aircond a1 = new Aircond("Auto");
		System.out.println("Auto:" + a1.getCost());
		Aircond a2 = new Aircond("Manual");
		System.out.println("Auto:" + a2.getCost());
		Sound s = new Sound();
		System.out.println("Sound:" + s.getCost());
	}
}

class Part 
{
	int cost;
	int getCost()
	{
		return cost;
	}
}
class Engine extends Part
{
	Engine(int cc)
	{
		if(cc == 1600)
			cost = 20000;
		else if(cc == 2000)
		{
			cost = 25000;
		}
	}
}
class Aircond extends Part
{
	Aircond(String aircond)
	{
		if(aircond == "Auto")
			cost = 12000;
		else if(aircond == "Manual")
		{
			cost = 10000;
		}
	}
}
class Sound extends Part
{
	Sound()
	{
		cost = 2000;
	}
}




