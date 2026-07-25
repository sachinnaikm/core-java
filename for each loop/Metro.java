class Metro{
public static void main(String sam[]){
String purpleLine[]={"Whitefield","HopeFarm","Kadugodi","Nallurhalli","SriSathyaSaiHospital","PattandurAgrahara","ITPL","Hoodi","Garudacharpalya","Mahadevapura","Baiyappanahalli","MGRoad","Majestic","Vijayanagar","Kengeri"};
String greenLine[]={"Nagasandra","Dasarahalli","Jalahalli","Peenya","Yeshwanthpur","Mahalakshmi","Rajajinagar","KuvempuRoad","Majestic","Chickpete","KRMarket","NationalCollege","Lalbagh","SouthEndCircle","JPNagar","Yelachenahalli"};

System.out.println("Purple Line Stations");
for(String station:purpleLine){
System.out.println(station);
}

System.out.println("Green Line Stations");
for(String station:greenLine){
System.out.println(station);
}
}
}