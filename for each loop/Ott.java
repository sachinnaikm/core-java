class Ott{
public static void main(String sam[]){
String netflix[]={"Wednesday","Extraction","RedNotice","BirdBox","TheGrayMan","Lift","Damsel","Atlas","Luther","Bright","Polar","Spaceman","TheMother","Kate","Lou","ArmyOfTheDead","Code8","ProjectPower","TripleFrontier","HeartOfStone","CarryOn","OutsideTheWire","RebelRidge","6Underground","SpenserConfidential"};
String amazon[]={"Mirzapur","Farzi","Panchayat","FamilyMan","PaatalLok","Citadel","Breathe","Suzhal","Jubilee","Poacher","HostelDaze","BandishBandits","MadeInHeaven","CrashCourse","MumbaiDiaries","TheLastHour","Dhootha","InspectorRishi","Chhorii","Sherni","SardarUdham","JaiBhim","Tanhaji","ModernLove","CampusBeats"};
String jiohotstar[]={"MSDhoni","Aarya","SpecialOps","CriminalJustice","KeralaCrimeFiles","TheNightManager","CityOfDreams","Lootere","Mathagam","Label","Kannagi","Moving","BigMouth","Snowdrop","Connect","Vigil","TheFreelancer","KarmmaCalling","Showtime","GyaarahGyaarah","Parampara","Arya","KoffeeWithKaran","CommanderKaranSaxena","WeddingAgreement"};

System.out.println("The available movies in Netflix");
for(String movie:netflix){
System.out.println(movie);
}

System.out.println("The available movies in Amazon Prime");
for(String movie:amazon){
System.out.println(movie);
}

System.out.println("The available movies in JioHotstar");
for(String movie:jiohotstar){
System.out.println(movie);
}
}
}