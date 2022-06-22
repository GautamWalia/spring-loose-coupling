package com.practice;

public class Student {
	//private int id;
	private Cheat cheat;
	
	
	
//	public void setId(int id) {
//		this.id = id;
//	}


	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void cheating() {
		cheat.cheat();
		//System.out.println("My id is: "+id+ " and have done cheating");
	} 

}
