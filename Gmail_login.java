package encapsulation_programs;
// WAP Using Encapsulation
public class Gmail_login
{
		private int pin=1474;
		
	public int getPin() 
	{
			return pin;
	}

		public void setPin(int pin) 
		{
			this.pin = pin;
		}
		
		private String email="ayaz@outlook.com";
		
	public String getEmail() 
	{
			return email;
	}

		public void setEmail(String email) 
		{
			this.email = email;
		}

	public static void main(String[] args) 
	{
		Gmail_login G1=new Gmail_login();
		G1.setPin(3693);
		System.out.println(G1.getPin());
		G1.setEmail("ayazii@yahoo.com");
		System.out.println(G1.getEmail());
	}
 }

