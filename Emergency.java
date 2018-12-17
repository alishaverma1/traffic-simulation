
public class Emergency extends Vehicle
{
	public Emergency()
	{
		super();
		isEmergency = true;
		time = 1;
		type = "E";
	}
	
	public String toString()
	{
		
		return type;
	}
}
