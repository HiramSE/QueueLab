package TestedClass;
/**
 * 
 * @author pedroirivera-vega
 *
 */
public class Job {
	private int pid;			//id of this job
	private int arrivalTime;	//arrival time of this job
	private int remainingTime;  //remaining service time for this job
	private int departureTime;  //time when the service for this job is comleted
	
	//Constructor
	public Job(int id,int at, int rt){
		pid = id;
		arrivalTime = at;
		remainingTime = rt;
	}
	//getters and setters
	public int getDepartureTime(){
		return departureTime;
	}
	
	public int getPid(){
		return pid;
	}
	public int getArrivalTime(){
		return arrivalTime;
	}
	public int getRemainingTime(){
		return remainingTime;
	}
	public void setDepartureTime(int departureTime){
		this.departureTime = departureTime;
	}
	/**
	 * Registers an update of serviced received by this job.
	 * @param q the time of the service being registered.
	 */
	public void isServed(int q){
		if(q < 0) return;	//just positive values of q
		remainingTime -= q;
	}
	/**
	 * Generates a string that describes this job; useful for printing 
	 * information about the job.
	 */
	
	public String toString(){
		return "PID = " + pid + 
				" Arrival Time = " + arrivalTime +
				" Remaining Time = " + remainingTime +
				" Departure Time = " + departureTime;
	}
}
