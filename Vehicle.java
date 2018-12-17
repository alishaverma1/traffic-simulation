public abstract class Vehicle 
{
	public int time; //represents the time for one vehicle to get through the intersection
	public boolean isEmergency; //whether or not this is an emergency vehicle
	public String type;
	
	public Vehicle() //default constructor
	{
		time = 0;
		isEmergency = false;
	}
	
	public Vehicle(int t, boolean emergency) //regular constructor
	{
		time = t;
		isEmergency = emergency;
	}
	
	public int getTime()
	{
		return time;
	}
	
	public boolean getIsEmergency()
	{
		return isEmergency;
	}
	
	public String toString()
	{
		return type;
	}
}
