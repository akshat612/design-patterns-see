import java.util.ArrayList;
import java.util.Iterator;

public class Info implements doctor{
	
	private ArrayList<Observer> observers;
	Iterator<Observer> i=observers.iterator();
	
	private String TimeSlot;
	private String DateSlot;
	private int observerId;
	
	
	String arr[][]={{"12-05-2015","09:00-11:30","0"},{"13-05-2015","12:30-04:30","0"},{"14-05-2015","10:00-11:00","0"}}; 
    
	
	
	public Details(){
		
		observers = new ArrayList<Observer>();
	}
	
	public void addPatients(Observer newObserver) {
		
		observers.add(newObserver);
		
	}


	public void nextPatient() {
		
		if(i.hasNext())
		{
		 System.out.println(i);
		}
		
	}
	
	public void setAppointment(String Dates,String Time){
		
		this.Dates = Dates;
		this.Time = Time;
		System.out.println(Dates +" Date ");
		System.out.println(Time +" Time \n");
		arr[0][2]="1";
		notifyDoc();
		for(Observer observer : observers){
			
			observer.update(Dates,Time);
			
		}
		
		
		
	}

	
	public void bookings() {
		
		System.out.println("Available timings");
		for(int i=0;i<3;i++)
		{
			if(arr[i][2]!="1")
			{
			System.out.println("Slot "+ (i+1));
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println("\n");
			}
		}
		
	}
	
	public void notifyDoc()
	{
		System.out.println("Available Slots After Booking \n");
		for(int i=0;i<3;i++)
		{
			if(arr[i][2]!="1")
			{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
			    }
			System.out.println("\n");
			}
		}
	}
		
		
		
	
	
	
}
