class AirConditionerRunner{
public static void main(String sam[]){
		System.out.println("Power Status :"+AirConditioner.isPowerOn);
		
		
		AirConditioner.onOrOff();
		
		
		
		
		System.out.println("Power Status :"+AirConditioner.isPowerOn);
		
		AirConditioner.increaseTemprature();
		AirConditioner.increaseTemprature();
		AirConditioner.increaseTemprature();
		AirConditioner.increaseTemprature();
		AirConditioner.increaseTemprature();
		
		AirConditioner.decreaseTemprature();
		AirConditioner.decreaseTemprature();
		AirConditioner.decreaseTemprature();
		AirConditioner.decreaseTemprature();
		AirConditioner.decreaseTemprature();
		AirConditioner.decreaseTemprature();
		
		
		AirConditioner.onOrOff();
		
		
		
		System.out.println("Power Status :"+AirConditioner.isPowerOn);
		
	}
}