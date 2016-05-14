

public class Booking implements Observer {
	
	private String Time;
	
	private String Dates;
	
	
	private static int observerIDTracker = 0;
		
	private int observerID;
	
	
	private Info d;
	
	public Time(Info d){
		
	
		this.d = d;
		this.observerID = ++observerIDTracker;
		System.out.println("Patient Name " + this.observerID +" Patient  ID " + this.observerID);
		

		
		d.addPatients(this);
		
	}

	public void update(String Dates,String Time) {
		
		this.Dates = Dates;
		this.Time = Time;
		printBooking();
		
	}
	
	public void printBooking(){
		System.out.println("Updating to Doctor \n");
		System.out.println(observerID + "\nDate: " + Dates + "\nTime: " + 
				Time +  "\n");
		
	}
	
	public Details getDetail()
	{
		return (this.d);
		
	}
	
}
