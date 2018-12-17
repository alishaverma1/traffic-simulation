import java.util.Random;

public class TrafficLight 
{
	private Vehicle[] north =  new Vehicle[5];
	private Vehicle[] south =  new Vehicle[5];
	private Vehicle[] east =  new Vehicle[5];
	private Vehicle[] west =  new Vehicle[5];
	
	
	//private Vehicle[] north2 =  new Vehicle[5];
	//private Vehicle[] south2 =  new Vehicle[5];
	//private Vehicle[] east2 =  new Vehicle[5];
	//private Vehicle[] west2 =  new Vehicle[5];
	
	
	public boolean running; //indicates whether simulation is running or not
	private boolean nS; //if NS direction has a green light or not
	private boolean eW; //if EW direction has a green light or not
	
	private final int TIME = 5; //how long the light stays green for one direction or the other
	
	public Vehicle[] randomSize()
	{
		Vehicle[] randomSize = new Vehicle[5];
		//Random rand = new Random();
		int rnd = (int)(Math.random()*4)+1;
		
		for(int i = 0; i<rnd; i++)
		{
			randomSize[i]=randomVehicle();
		}
		return randomSize;
	}
	
	public Vehicle randomVehicle() //loop numbers for each vehicle and call random vehicles to be added
	{
		Vehicle randomVehicle = null;
		//Random rand = new Random();
		int rnd = (int)(Math.random()*3)+1;
		
		if(rnd==1)
		{
			randomVehicle = new Car();
		}
		if(rnd == 2)
		{
			randomVehicle = new Truck();
		}
		if(rnd == 3)
		{
			randomVehicle = new Semi();
		}
		if(rnd == 4)
		{
			randomVehicle = new Emergency();
		}
		return randomVehicle;
	}
	public TrafficLight()
	{
		/*north[0] = new Semi();
		north[1] = new Truck();
		north[2]= new Car();
		
		south[0] = new Truck();
		
		east[0] = new Car();
		east[1] = new Car();
		east[2] = new Semi();
		east[3] = new Truck();
		
		west[0] = new Truck();
		west[1] = new Car();*/
		
		north = randomSize();
		south = randomSize();
		east = randomSize();
		west = randomSize();
		
		running = true;
		
		nS = true;
		eW = false;
	}
	public void printIntersectionState() //prints state of intersection
	{
		String ns = "";
		if(nS) 
		{
			ns = "G";
		} 
		else 
		{
			ns = "R";
		}
		String ew = "";
		if(eW)
		{
			ew = "G";
		}
		else
			ew = "R";
		
		System.out.println("NS: " + ns + "         | " + check(north, 4) + " |                         ");
		System.out.println("EW: " + ew + "         | " + check(north, 3) + " |                         ");
		System.out.println("              | " + check(north, 2) + " |                        ");
		System.out.println("              | " + check(north, 1) + " |                        ");
		System.out.println("--------------| " + check(north, 0) + " |--------------");
		System.out.println();
		System.out.println();
		System.out.println("  " + check(west, 4) + "  " + check(west, 3) + "  " + check(west, 2) + "  " + check(west, 1) + "  " + check(west, 0) + "   " + check(east, 0) + "  " + check(east, 1) + "  " + check(east, 2) + "  " + check(east, 3) + "  " + check(east, 4));
		System.out.println();
		System.out.println();
		System.out.println("--------------| " + check(south, 0) + " |--------------");
		System.out.println("              | " + check(south, 1) + " |              ");
		System.out.println("              | " + check(south, 2) + " |              ");
		System.out.println("              | " + check(south, 3) + " |              ");
		System.out.println("              | " + check(south, 4) + " |              ");
	}
	
	public String check(Vehicle[] veh, int num)
	{
		if(veh[num]!=null)
		{
			return veh[num].toString();
		}
		return " ";
	}
	/*public String printVehicle(Vehicle[] veh, int num) //ERROR: ALWAYS RETURNS A BLANK SPACE
	{
		String ans = "" + veh[num];
		if(!(veh[num].equals("C")))
		{
			ans = " ";
		}
		else if(!(veh[num].equals("S")))
		{
			ans = " ";
		}
		else if(!(veh[num].equals("T")))
		{
			ans = " ";
		}
		else if(!(veh[num].equals("E")))
		{
			ans = " ";
		}
		return ans;
	}*/
	
	public void addVehicle(Vehicle[] direction, boolean emergency)
	{
		if(emergency)
		{
			if(direction == north)
			{
				if(north[0]==null)
				{
					north[0] = new Emergency();
				}
				else if(north[1]==null)
				{
					north[1] = new Emergency();
				}
				else if(north[2]==null)
				{
					north[2] = new Emergency();
				}
				else if(north[3]==null)
				{
					north[3] = new Emergency();
				}
				else if(north[4]==null)
				{
					north[4] = new Emergency();
				}
			}
			else if(direction == south)
			{
				if(south[0]==null)
				{
					south[0] = new Emergency();
				}
				else if(south[1]==null)
				{
					south[1] = new Emergency();
				}
				else if(south[2]==null)
				{
					south[2] = new Emergency();
				}
				else if(south[3]==null)
				{
					south[3] = new Emergency();
				}
				else if(south[4]==null)
				{
					south[4] = new Emergency();
				}
			}
			if(direction == east)
			{
				if(east[0]==null)
				{
					east[0] = new Emergency();
				}
				else if(east[1]==null)
				{
					east[1] = new Emergency();
				}
				else if(east[2]==null)
				{
					east[2] = new Emergency();
				}
				else if(east[3]==null)
				{
					east[3] = new Emergency();
				}
				else if(east[4]==null)
				{
					east[4] = new Emergency();
				}
			}
			else if(direction == west)
			{
				if(west[0]==null)
				{
					west[0] = new Emergency();
				}
				else if(west[1]==null)
				{
					west[1] = new Emergency();
				}
				else if(west[2]==null)
				{
					west[2] = new Emergency();
				}
				else if(west[3]==null)
				{
					west[3] = new Emergency();
				}
				else if(west[4]==null)
				{
					west[4] = new Emergency();
				}
			}
		}
		else
		{
			if(direction == north)
			{
				if(north[0]==null)
				{
					north[0] = new Car();
				}
				else if(north[1]==null)
				{
					north[1] = new Truck();
				}
				else if(north[2]==null)
				{
					north[2] = new Semi();
				}
				else if(north[3]==null)
				{
					north[3] = new Car();
				}
				else if(north[4]==null)
				{
					north[4] = new Semi();
				}
			}
			else if(direction == south)
			{
				if(south[0]==null)
				{
					south[0] = new Truck();
				}
				else if(south[1]==null)
				{
					south[1] = new Semi();
				}
				else if(south[2]==null)
				{
					south[2] = new Semi();
				}
				else if(south[3]==null)
				{
					south[3] = new Car();
				}
				else if(south[4]==null)
				{
					south[4] = new Truck();
				}
			}
			if(direction == east)
			{
				if(east[0]==null)
				{
					east[0] = new Truck();
				}
				else if(east[1]==null)
				{
					east[1] = new Car();
				}
				else if(east[2]==null)
				{
					east[2] = new Semi();
				}
				else if(east[3]==null)
				{
					east[3] = new Car();
				}
				else if(east[4]==null)
				{
					east[4] = new Truck();
				}
			}
			else if(direction == west)
			{
				if(west[0]==null)
				{
					west[0] = new Car();
				}
				else if(west[1]==null)
				{
					west[1] = new Semi();
				}
				else if(west[2]==null)
				{
					west[2] = new Truck();
				}
				else if(west[3]==null)
				{
					west[3] = new Semi();
				}
				else if(west[4]==null)
				{
					west[4] = new Car();
				}
			}
		}
	}
	public boolean noVehicles() //returns true if there are no vehicles left in any direction
	{
		boolean ans = true;
		for(Vehicle veh:north)
		{
			if(veh!=null)
			{
				ans = false;
				break;
			}
		}
		for(Vehicle veh:south)
		{
			if(veh!=null)
			{
				ans = false;
				break;
			}
		}
		for(Vehicle veh:east)
		{
			if(veh!=null)
			{
				ans = false;
				break;
			}
		}
		for(Vehicle veh:west)
		{
			if(veh!=null)
			{
				ans = false;
				break;
			}
		}
		return ans;
	}
	public boolean anyEmergency()  //returns true if there are any emergency vehicles in any direction
	{
		boolean ans = false;
		for(Vehicle veh:north)
		{
			if(veh.getIsEmergency()==true)
			{
				ans = true;
				break;
			}
		}
		for(Vehicle veh:south)
		{
			if(veh.getIsEmergency()==true)
			{
				ans = true;
				break;
			}
		}
		for(Vehicle veh:east)
		{
			if(veh.getIsEmergency()==true)
			{
				ans = true;
				break;
			}
		}
		for(Vehicle veh:west)
		{
			if(veh.getIsEmergency()==true)
			{
				ans = true;
				break;
			}
		}
		return ans;
	}
	public boolean specificEmergency(Vehicle[] direction) //returns true if there is an emergency vehicle in the direction parameter
	{
		boolean ans = false;
		for(Vehicle veh:direction)
		{
			if(veh.getIsEmergency()==true)
			{
				ans = true;
				break;
			}
		}
		return ans;
	}
	public void moveVehicle() // moves finds which direction has an emergency vehicle in it, moves that vehicle to the front of that direction, and turns the light green for that direction, even if it was green last time
	{
		if(specificEmergency(north)==true)
		{
			int index = 0;
			for(int i = 0; i<north.length; i++)
			{
				if(north[i].getIsEmergency()==true)
				{
					index = i;
					break;
				}
			}
			Vehicle valueBeingMoved = north[index];

			 for (int i = index; i > 0; i--) 
			 {
				 north[i] = north[i-1];
			 }
			 north[0] = valueBeingMoved;
			 nS = true;
		}
		if(specificEmergency(south)==true)
		{
			int index = 0;
			for(int i = 0; i<south.length; i++)
			{
				if(south[i].getIsEmergency()==true)
				{
					index = i;
					break;
				}
			}
			Vehicle valueBeingMoved = south[index];

			 for (int i = index; i > 0; i--) 
			 {
				 south[i] = south[i-1];
			 }
			 south[0] = valueBeingMoved;
			 nS = true;
		}
		if(specificEmergency(east)==true)
		{
			int index = 0;
			for(int i = 0; i<east.length; i++)
			{
				if(east[i].getIsEmergency()==true)
				{
					index = i;
					break;
				}
			}
			Vehicle valueBeingMoved = east[index];

			 for (int i = index; i > 0; i--) 
			 {
				 east[i] = east[i-1];
			 }
			 east[0] = valueBeingMoved;
			 eW = true;
		}
		if(specificEmergency(west)==true)
		{
			int index = 0;
			for(int i = 0; i<west.length; i++)
			{
				if(west[i].getIsEmergency()==true)
				{
					index = i;
					break;
				}
			}
			Vehicle valueBeingMoved = west[index];

			 for (int i = index; i > 0; i--) 
			 {
				 west[i] = west[i-1];
			 }
			 west[0] = valueBeingMoved;
			 eW = true;
		}
	}
	
	public void removeElement(int index, Vehicle[] array)
	{
		for(int i = index; i<array.length-1; i++)
		{
			array[i] = null;
			array[i]=array[i+1];
		}
	}
	
	
	/*public void runMovement2()
	{
		int runningTime = TIME;
		
		while(runningTime != 0 && (northSize != 0 || southSize != 0 || eastSize != 0 || westSize != 0) )
		{
			if(nS)
			{
				//removeNS
				
				
			}
			else
			{
				//removeEW
			}
		}
		
		
		
		
	}*/
	
	
	
	
	
	public void runMovement()
	{
		int runningTime = TIME;
		
		while(runningTime!=0)
		{
			if(nS)
			{
				if(north[0]!=null && south[0]!=null)
				{
					if(runningTime>north[0].getTime() && runningTime>south[0].getTime())
					{
						int max = Math.max(north[0].getTime(), south[0].getTime());
						runningTime = runningTime - max;
						removeElement(0, north);
						removeElement(0, south);
					}
					else if(runningTime>north[0].getTime() && runningTime<south[0].getTime())
					{
						runningTime = runningTime - north[0].getTime();
						removeElement(0, north);
					}
					else if(runningTime<north[0].getTime() && runningTime>south[0].getTime())
					{
						runningTime = runningTime - south[0].getTime();
						removeElement(0, south);
					}
					else
					{
						//do nothing
						nS = false;
						eW = true;
						runningTime = TIME;
						break;
					}
				}
				else if(north[0]!=null && south[0]==null)
				{
					if(runningTime>north[0].getTime())
					{
						runningTime = runningTime - north[0].getTime();
						removeElement(0, north);
					}
					else
					{
						//do nothing
						nS = false;
						eW = true;
						runningTime = TIME;
						break;
					}
				}
				else if(north[0]==null && south[0]!=null)
				{
					if(runningTime>south[0].getTime())
					{
						runningTime = runningTime - south[0].getTime();
						removeElement(0, south);
					}
					else
					{
						//do nothing
						nS = false;
						eW = true;
						runningTime = TIME;
						break;
					}
				}
				else // both null
				{
					nS = false;
					eW = true;
					runningTime = TIME;
					break;
				}
			}
			if(eW)
			{
				if(east[0]!=null && west[0]!=null)
				{
					if(runningTime>east[0].getTime() && runningTime>west[0].getTime())
					{
						int max = Math.max(east[0].getTime(), west[0].getTime());
						runningTime = runningTime - max;
						removeElement(0, east);
						removeElement(0, west);
					}
					else if(runningTime>east[0].getTime() && runningTime<west[0].getTime())
					{
						runningTime = runningTime - east[0].getTime();
						removeElement(0, west);
					}
					else if(runningTime<east[0].getTime() && runningTime>west[0].getTime())
					{
						runningTime = runningTime - west[0].getTime();
						removeElement(0, west);
					}
					else
					{
						nS = true;
						eW = false;
						runningTime = TIME;
						break;
					}
				}
				else if(east[0]!=null && west[0]==null)
				{
					if(runningTime>east[0].getTime())
					{
						runningTime = runningTime - east[0].getTime();
						removeElement(0, east);
					}
					else
					{
						nS = true;
						eW = false;
						runningTime = TIME;
						break;
					}
				}
				else if(east[0]==null && west[0]!=null)
				{
					if(runningTime>west[0].getTime())
					{
						runningTime = runningTime - west[0].getTime();
						removeElement(0, west);
					}
					else
					{
						nS = true;
						eW = false;
						runningTime = TIME;
						break;
					}
				}
				else
				{
					nS = true;
					eW = false;
					runningTime = TIME;
					break;
				}
			}
				
		}
		
		if(noVehicles() == false)
		{
			int randomDir = 1 + (int)(Math.random() * 4);
			int randomCar = 1 + (int)(Math.random() * 4);
				
				Vehicle v = null;
				if(randomCar == 1)
					v = new Car();
				else if(randomCar == 2)
					v = new Truck();
				else if(randomCar ==3)
					v = new Semi();
				else
					v = new Emergency();
				
				Vehicle[] arr = null;
				if(randomDir == 1)
					arr = north;
				else if(randomDir == 2)
					arr = south;
				else if(randomDir == 3)
					arr = east;
				else
					arr = west;
				
				int index = -1;
				if(arr[0]==null)
					index = 0;
				else if(arr[1]==null)
					index = 1;
				else if(arr[2]==null)
					index = 2;
				else  if(arr[3]==null)
					index = 3;
				else
					index = 4;
				
				arr[index] = v;
				
			}
		else
		{
			running = false;
		}
	}
}
