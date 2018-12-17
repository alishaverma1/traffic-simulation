import java.util.Scanner;

public class TrafficSimulation 
{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			TrafficLight obj = new TrafficLight();
			obj.printIntersectionState();
			
			
			
			String input; //= scan.nextLine();
			while(obj.running)
			{
				System.out.println("Hit enter to run the simulation again.");
				input = scan.nextLine();
				
				obj.runMovement();
				obj.printIntersectionState();
				
				
				
				if(input.compareTo("exit")==0)
					break;
			}
		}
}
