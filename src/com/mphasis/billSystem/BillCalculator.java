package com.mphasis.billSystem;

public class BillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int units=280;
     double billToPay=0;
     if(units<100) {
    	 billToPay=units*1.20;    	 
     }else if(units<300){
    	 billToPay=units*1.20+(units-100)*2;
    	 
     }
     System.out.println("The Electricity bill for "+units+" is : "+billToPay);
	}

}
