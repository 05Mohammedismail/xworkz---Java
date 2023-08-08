package com.xworkz.abstraction.app.washingMachine;

public class Vinod {
	
	private WashingMachine machine;
	
	public Vinod(WashingMachine machine) {
	this.machine = machine;
	}
	
	public void getRinse() {
		if(machine!= null) {
			System.out.println("Machine is not null");
			this.machine.rinse();
		}
		else {
			System.err.println("machine is null, machine cannot rinse");
		}
	}
	

}
