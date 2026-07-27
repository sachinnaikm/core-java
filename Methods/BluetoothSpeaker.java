class BluetoothSpeaker{

static boolean isConnected;
static int volume=0;

public static void onOrOff(){

if(isConnected==false){
isConnected=true;
System.out.println("Bluetooth Speaker is Connected Successfully");
}
else{
isConnected=false;
System.out.println("Bluetooth Speaker is Disconnected");
}

}

public static void increaseVolume(){

if(isConnected==true){

if(volume<10){
volume++;
System.out.println("Current Volume : "+volume);
}
else{
System.out.println("Maximum Volume Reached");
}

}
else{
System.out.println("Please Connect Bluetooth Speaker First");
}

}

public static void decreaseVolume(){

if(isConnected==true){

if(volume>0){
volume--;
System.out.println("Current Volume : "+volume);
}
else{
System.out.println("Minimum Volume Reached");
}

}
else{
System.out.println("Please Connect Bluetooth Speaker First");
}

}

public static void main(String sam[]){

System.out.println("Initial Status : "+isConnected);

onOrOff();

System.out.println("Current Status : "+isConnected);

increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
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
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();

onOrOff();

System.out.println("Current Status : "+isConnected);

}

}