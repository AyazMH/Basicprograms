package colletions;
// WAP Using UpCasting concept
class Universe
{
	void Sun()
	{
		System.out.println("The Sun is the star at the center of the Solar System");
	}
	void Moon()
	{
		System.out.println("The Moon is the brightest celestial object in Earth's night sky");

	}	
}
public class Earth_UpCasting extends Universe
{
	void Ocean()      //------> We cannot access the property of the child class in the concept of UpCasting
	{
		
	}

	public static void main(String[] args)
	{
		Universe U1=new Earth_UpCasting();
		U1.Sun();
		U1.Moon();
		
	}

}
