class SmartTV{
	
	static boolean isPowerOn;
	static int volume=0;
	
	public static void onOroff(){
		if(isPowerOn==false){
			isPowerOn=true;
			System.out.println("TV On Successfully");	
		}
		else{
			isPowerOn=false;
			System.out.println("TV is Off");
		}
	}
	public static void increaseVolume(){
		if(isPowerOn==true){
			
			if(volume<5){
				volume++;
				System.out.println("Current Volume : "+volume);
			}
			else{
				System.out.println("Maximum Volume Reached");
			}
			
		}
		else{
			System.out.println("Please Turn On Your TV");
		}
	}
	public static void decreaseVolume(){
		
			if(isPowerOn==true){
				
				if(volume>0){
					volume--;
					System.out.println("current void:"+volume);
				}
				else{
					System.out.println("Current Volume : "+volume);
				}
				
			}
			else{
				System.out.println("Minimum Volume Reached");
			}
		}
	public static void main(String sam[]){
		System.out.println("power status:"+isPowerOn);
		onOroff();
		
		
		System.out.println("power status:"+isPowerOn);
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();

		
		onOroff();
		
		
		System.out.println("power status:"+isPowerOn);
	}
}