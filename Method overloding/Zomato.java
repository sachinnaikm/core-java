class Zomato{

public static int search(String item){

System.out.println("search started");

int price=0;

if(item=="Veg Biryani"){
price=229;
}
else if(item=="Chicken Biryani"){
price=299;
}
else if(item=="Egg Biryani"){
price=199;
}
else if(item=="Mutton Biryani"){
price=349;
}
else if(item=="Burger"){
price=99;
}
else if(item=="Pizza"){
price=249;
}
else if(item=="Paneer Pizza"){
price=289;
}
else if(item=="Veg Burger"){
price=129;
}
else if(item=="Chicken Burger"){
price=179;
}
else if(item=="French Fries"){
price=119;
}
else if(item=="Peri Peri Fries"){
price=149;
}
else if(item=="Veg Fried Rice"){
price=169;
}
else if(item=="Chicken Fried Rice"){
price=229;
}
else if(item=="Veg Noodles"){
price=159;
}
else if(item=="Chicken Noodles"){
price=219;
}
else if(item=="Paneer Sandwich"){
price=99;
}
else if(item=="Chicken Sandwich"){
price=149;
}
else if(item=="Momos"){
price=139;
}
else if(item=="Paneer Tikka"){
price=259;
}
else if(item=="Chicken Tikka"){
price=299;
}
else if(item=="Butter Naan"){
price=45;
}
else if(item=="Garlic Naan"){
price=55;
}
else if(item=="Chapati"){
price=30;
}
else if(item=="Kulcha"){
price=65;
}
else if(item=="Jeera Rice"){
price=159;
}
else if(item=="Curd Rice"){
price=109;
}
else if(item=="Meals"){
price=199;
}
else if(item=="Brownie"){
price=99;
}
else if(item=="Ice Cream"){
price=89;
}
else if(item=="Soft Drink"){
price=60;
}
else{
System.out.println(item+" not found..");
}

System.out.println("search ended");

return price;

}

public static int search(String item,int quantity){

System.out.println("search started");

int price=0;

if(item=="Veg Biryani"){
price=229*quantity;
}
else if(item=="Chicken Biryani"){
price=299*quantity;
}
else if(item=="Egg Biryani"){
price=199*quantity;
}
else if(item=="Mutton Biryani"){
price=349*quantity;
}
else if(item=="Burger"){
price=99*quantity;
}
else if(item=="Pizza"){
price=249*quantity;
}
else if(item=="Paneer Pizza"){
price=289*quantity;
}
else if(item=="Veg Burger"){
price=129*quantity;
}
else if(item=="Chicken Burger"){
price=179*quantity;
}
else if(item=="French Fries"){
price=119*quantity;
}
else if(item=="Peri Peri Fries"){
price=149*quantity;
}
else if(item=="Veg Fried Rice"){
price=169*quantity;
}
else if(item=="Chicken Fried Rice"){
price=229*quantity;
}
else if(item=="Veg Noodles"){
price=159*quantity;
}
else if(item=="Chicken Noodles"){
price=219*quantity;
}
else if(item=="Paneer Sandwich"){
price=99*quantity;
}
else if(item=="Chicken Sandwich"){
price=149*quantity;
}
else if(item=="Momos"){
price=139*quantity;
}
else if(item=="Paneer Tikka"){
price=259*quantity;
}
else if(item=="Chicken Tikka"){
price=299*quantity;
}
else if(item=="Butter Naan"){
price=45*quantity;
}
else if(item=="Garlic Naan"){
price=55*quantity;
}
else if(item=="Chapati"){
price=30*quantity;
}
else if(item=="Kulcha"){
price=65*quantity;
}
else if(item=="Jeera Rice"){
price=159*quantity;
}
else if(item=="Curd Rice"){
price=109*quantity;
}
else if(item=="Meals"){
price=199*quantity;
}
else if(item=="Brownie"){
price=99*quantity;
}
else if(item=="Ice Cream"){
price=89*quantity;
}
else if(item=="Soft Drink"){
price=60*quantity;
}
else{
System.out.println(item+" not found..");
}

System.out.println("search ended");

return price;

}

public static void main(String food[]){

System.out.println("main started");

String anyThing="Chicken Biryani";

int price=search(anyThing);

System.out.println("The Price of "+anyThing+" is "+price);

int priceWithQuantity=search(anyThing,3);

System.out.println("The Price of "+anyThing+" is "+priceWithQuantity);

System.out.println("main ended");

}

}