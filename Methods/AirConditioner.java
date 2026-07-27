class AirConditioner{
	static boolean isPowerOn;
	static int temprature=24;
	
	public static void onOrOff(){
		if(isPowerOn==false){
			isPowerOn=true;
			System.out.println("AirConditiner is turn on Successefully");	
		}
		else{
			isPowerOn=false;
			System.out.println("The Air Conditioner is Turned off");
		}
	}
	
public static void increaseTemprature(){
	if(isPowerOn==true){
		if(temprature<30){
			temprature++;
			System.out.println("Current Temprature:"+temprature);
		}
		else{
			System.out.println("Maximum Temperature Reached");
		}
		
	}
	else{
		System.out.println("turn on your AirConditioner");
	}
}

public static void decreaseTemprature(){
	if(isPowerOn==true){
		if(temprature>16){
			temprature--;
			System.out.println("Current Temprature:"+temprature);
		}
		else{
			System.out.println("Minimum Temprature Reached");
		}
		
	}
	else{
		System.out.println("Please turn on your Airconditioner first");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String sam[]){
		System.out.println("Power Status :"+isPowerOn);
		
		
		onOrOff();
		
		
		
		
		System.out.println("Power Status :"+isPowerOn);
		
		increaseTemprature();
		increaseTemprature();
		increaseTemprature();
		increaseTemprature();
		increaseTemprature();
		
		decreaseTemprature();
		decreaseTemprature();
		decreaseTemprature();
		decreaseTemprature();
		decreaseTemprature();
		decreaseTemprature();
		
		
		onOrOff();
		
		
		
		System.out.println("Power Status :"+isPowerOn);
		
	}
}