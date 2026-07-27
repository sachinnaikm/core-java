class WashingMachine{

static boolean isPowerOn;
static int timer=0;

public static void onOrOff(){

if(isPowerOn==false){
isPowerOn=true;
System.out.println("Washing Machine is Turned On Successfully");
}
else{
isPowerOn=false;
System.out.println("Washing Machine is Turned Off");
}

}

public static void increaseTimer(){

if(isPowerOn==true){

if(timer<10){
timer++;
System.out.println("Current Timer : "+timer);
}
else{
System.out.println("Maximum Timer Reached");
}

}
else{
System.out.println("Please Turn On Washing Machine");
}

}

public static void decreaseTimer(){

if(isPowerOn==true){

if(timer>0){
timer--;
System.out.println("Current Timer : "+timer);
}
else{
System.out.println("Minimum Timer Reached");
}

}
else{
System.out.println("Please Turn On Washing Machine");
}

}

public static void main(String sam[]){

System.out.println("Power Status : "+isPowerOn);

onOrOff();

System.out.println("Power Status : "+isPowerOn);

increaseTimer();
increaseTimer();
increaseTimer();
increaseTimer();
increaseTimer();
increaseTimer();
increaseTimer();
increaseTimer();
increaseTimer();
increaseTimer();
increaseTimer();

decreaseTimer();
decreaseTimer();
decreaseTimer();
decreaseTimer();
decreaseTimer();
decreaseTimer();
decreaseTimer();
decreaseTimer();
decreaseTimer();
decreaseTimer();
decreaseTimer();

onOrOff();

System.out.println("Power Status : "+isPowerOn);

}

}