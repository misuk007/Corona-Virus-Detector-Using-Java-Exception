package exception;

import java.util.Scanner;

public class throwcheck {
	
	void firststage() {
		
		Scanner age= new Scanner(System.in);
		System.out.print("-----Welcome To Online Corona Testing-----\nPlease answer all of this questions");
		System.out.print("\nYour Age: ");
		int year=age.nextInt();
		try{
			if (year <= 0)
			throw new ArithmeticException();
			}
		catch(ArithmeticException e)
		{
			System.out.print("\nYou entered 0 or less "+e);
		}
		try{if(year > 100)
			throw new ArithmeticException();}
		catch(ArithmeticException e1)
		{
			System.out.print("\nYour age is more than 100, if you have any sickness please go to nearest hospital "+e1);
		}
			System.out.println("\nYou are "+year+" years old");
			}
	
	void gender() {
		System.out.print("\nEnter your Gender ");
		System.out.print("\nFor Male write M, For Female write F, For Others write O:  ");
		Scanner sex = new Scanner(System.in);
	    String a = sex.nextLine();
	    if(a.equals("M"))
	      System.out.println("\nYour Gender Is Male");
	    else if(a.equals("F"))
		      System.out.println("\nYour Gender Is Female");
	    else if(a.equals("O"))
		      System.out.println("\nYour Gender Is Others");
	    else
	    	try{
	    	throw new Exception();
	    } 
	    catch(Exception e){
	    System.out.println("\nPlease enter correct gender information "+e);}
	}
			
	void contract(){
		
		System.out.print("\nDid you met with a foreigner or Bangladeshi immigrant recently: (Y/N)\n");
		Scanner tress = new Scanner(System.in);
	    String b = tress.nextLine();
	    if(b.equals("Y"))
	      System.out.println("\n OK :(  Did this guy has fever? or dry caugh: (Y/N)\n ");
	    else if(b.equals("N"))
		      System.out.println("\nOk  :) Did you have fever? (Y/N)\n");
	    else
	    	try{
	    	throw new Exception();
	    } 
	    catch(Exception e){
	    System.out.println("\nPlease enter Y for Yes and N for No "+e);}
	    
	    
	    String c = tress.nextLine();
	    if(c.equals("Y"))
		      System.out.println("\nOk  :) Do you have fever with throat pain? (Y/N)\n");
	    else if(c.equals("N"))
		      System.out.println("\nGood  :) Do you have throat pain? (Y/N)\n");
	    else
	    	try{
	    	throw new Exception();
	    } 
	    catch(Exception e){
	    System.out.println("\nPlease enter Y for Yes and N for No "+e);}
	    
	    String d = tress.nextLine();
	    if(d.equals("Y"))
		      System.out.println("\nOk  :(  \n");
	    else if(d.equals("N"))
		      System.out.println("\nGood  :) you have minimum chance to get infect with coronoa virus (Y/N)\n");
	    else
	    	try{
	    	throw new Exception();
	    } 
	    catch(Exception e){
	    System.out.println("\nPlease enter Y for Yes and N for No "+e);}
	    
	    if(d.equals("Y"))
		      System.out.println("");
	    else if(d.equals("N"))
	    System.out.print("Let's tell about your body temperature\n");
	    
	}
	
	
	void temperaturedetect(){
		Scanner temperature= new Scanner(System.in);
		System.out.print("-------TEMPERATURE--------\n");
		System.out.print("\nTemperature should be 98 to 105 degree celcius");
		System.out.print("\nWhat is your body temperature now?  ");
		int tmp=temperature.nextInt();
		if(tmp==99)
			System.out.println("Don't worry you have normal body temperature");
		try{
			if (tmp < 98)
			throw new ArithmeticException();
			}
		catch(ArithmeticException e)
		{
			System.out.print("\nBody temperature is less than 98 degree, please enter exact value  "+e);
		}
		try{if(tmp > 105)
			throw new ArithmeticException();}
		catch(ArithmeticException e1)
		{
			System.out.print("\nYou have very high temperature "+e1);
		}
		System.out.print("\nYour body temperature is "+tmp+" degree celcius\n");
	}
	
	
	
	
	void anotherdetection(){
		System.out.println("We need more information\n");
		System.out.println("Do you have shortness of breath ?  (Y/N)\n");
		Scanner detection = new Scanner(System.in);
	    String b = detection.nextLine();
	    if(b.equals("Y"))
	      System.out.println("\n Ok :(  Do you have muscle pain ?  (Y/N)\n ");
	    else if(b.equals("N"))
		      System.out.println("\nGood :) you are out of risk :) \n");
	    else
	    	try{
	    	throw new Exception();
	    } 
	    catch(Exception e){
	    System.out.println("\nPlease enter Y for Yes and N for No "+e);}
	    
	    
	    String c = detection.nextLine();
	    if(c.equals("Y"))
		      System.out.println("\nOk  :) You have maximum chance to got infected with corona virus \n"
		    		  +"Please go to nearest hospital");
	    else if(c.equals("Y"))
		      System.out.println("\nOk  :)  \n");
	    else if(c.equals("N"))
		      System.out.println("\nGood  :) Though you don't have any muscle pain, you need to go the nearest hospital \n "
		    		  + "You can take normal medicine: Napa, Salaine, Vitamic C type food");
	          
	    else
	    	try{
	    	throw new Exception();
	    } 
	    catch(Exception e){
	    System.out.println("\nPlease enter Y for Yes and N for No "+e);}	
	}
	void hospital(){
		System.out.print("\nYour nearest corona testing hospital"+"\nWrite your division Code\n");
		System.out.print("DHAKA=DH; SYLHET=SY; CHITTAGONG=CH; BARISAL=BA; RAJSHAHI=RJ; KHULNA=KH; Rangpur=RR ");
		Scanner medical = new Scanner(System.in);
	    String hos = medical.nextLine();
		if(hos.equals("DH"))
		      System.out.println("\nKurmitula Hospital, Kuwet Bangladesh Hospital, Mughda Hospital, Dhaka Medical, Dhaka Mohanagar Hospital");
	    else if(hos.equals("SY"))
		      System.out.println("\nSamsuddin Hospital, Sylhet Medical");
	    else if(hos.equals("CH"))
		      System.out.println("\nChittagong Field Hospital, Chittagong Medical, Holycrisent Hospital");
	    else if(hos.equals("BA"))
		      System.out.println("\nBarisal Medical \n");
	    else if(hos.equals("RJ"))
		      System.out.println("\nRajshahi Medical, Ziaur Rahman Medical\n");
	    else if(hos.equals("KH"))
		      System.out.println("\nKhulna Medical\n");
	    else if(hos.equals("RR"))
		      System.out.println("\nRajshahi Medical, Dinajpur Medical\n");
	    else
	    	try{
	    	throw new Exception();
	    } 
	    catch(Exception e){
	    System.out.println("\n\nPlease enter correct code of your division Like DH for Dhaka, RR for Rangpur\n "+e);}
	}
	
	void rating(){
		System.out.println("\nPlease give your feedback Write G for Good and B Bad  (G/B)\n");
		Scanner rating = new Scanner(System.in);
	    String rate = rating.nextLine();
		if(rate.equals("G"))
		      System.out.println("\nThank you for your feedback");
	    else if(rate.equals("B"))
		      System.out.println("\nThank you for your feedback");
	    else
	    	try{
	    	throw new Exception();
	    } 
	    catch(Exception e){
	    System.out.println("\n\nFor your feedback just write G or D\n "+e);}
		
	}
	
	public static void main(String[] args) {
		while(true){
		throwcheck t = new throwcheck();
		t.firststage();
		t.gender();
		t.contract();
		t.temperaturedetect();
		t.anotherdetection();
		t.hospital();
		t.rating();
		System.out.println("\nStay Home, Stay Safe\n");
		System.out.println("Use good quality mask");
		System.out.println("Keep proper distnace from others, when you go outside");
		System.out.println("--------------------------------------\n\n");
		System.out.println("Next person: ");	
	}
	}
}
