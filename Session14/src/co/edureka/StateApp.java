package co.edureka;

interface State{
	void showState();
}

// Create Different States 
class Booked implements State{
	public void showState() {
		System.out.println(">> Cab is Booked");
	}
}

class Idle implements State{
	public void showState() {
		System.out.println(">> Cab is Idle");
	}
}

class Cancelled implements State{
	public void showState() {
		System.out.println(">> Cab is Cancelled");
	}
}

class Cab{
	
	State state; // HAS-A Relationship
	
	void changeState(State state){
		this.state = state;
	}
}

public class StateApp {

	public static void main(String[] args) {
		
		Idle iState = new Idle();
		Booked bState = new Booked();
		Cancelled cState = new Cancelled();
		
		Cab cab = new Cab();
		System.out.println(">> Driver Logged in for Cab KA12AB1234");
		cab.changeState(iState); // When Driver will Login
		cab.state.showState();

		System.out.println();
		
		// After some time a request came to Driver for a trip and Driver accepted the Request
		System.out.println(">> Driver Accepted the Ride Request");
		cab.changeState(bState);
		cab.state.showState();
		
		System.out.println();
		
		// Due to Some Reasons customer would like to cancel the Cab
		System.out.println(">> Customer had to cancel the Ride");
		cab.changeState(cState);
		cab.state.showState();
		
		System.out.println();
		
		//After some time lets say a minute lets change state to Idle Again so that driver can get more Ride Requests
		System.out.println(">> Driver made available again for Cab KA12AB1234");
		cab.changeState(iState); // When Driver will Login
		cab.state.showState();
	}

}
