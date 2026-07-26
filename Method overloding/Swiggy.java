class Swiggy{

public static int search(String item){

System.out.println("search started");

int price=0;

if(item=="Burger"){
price=99;
}
else if(item=="Pizza"){
price=129;
}
else if(item=="Veg Biryani"){
price=224;
}
else if(item=="Paneer Sandwich"){
price=55;
}
else if(item=="Chicken Kabab"){
price=155;
}
else if(item=="French Fries"){
price=119;
}
else if(item=="Peri Peri Fries"){
price=139;
}
else if(item=="Chicken Burger"){
price=179;
}
else if(item=="Veg Burger"){
price=129;
}
else if(item=="Chicken Biryani"){
price=299;
}
else if(item=="Egg Biryani"){
price=199;
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
else if(item=="Momos"){
price=149;
}
else if(item=="Paneer Tikka"){
price=249;
}
else if(item=="Chicken Tikka"){
price=289;
}
else if(item=="Butter Naan"){
price=40;
}
else if(item=="Garlic Naan"){
price=55;
}
else if(item=="Chapati"){
price=25;
}
else if(item=="Kulcha"){
price=60;
}
else if(item=="Jeera Rice"){
price=149;
}
else if(item=="Curd Rice"){
price=119;
}
else if(item=="Meals"){
price=199;
}
else if(item=="Ice Cream"){
price=80;
}
else if(item=="Brownie"){
price=95;
}
else if(item=="Soft Drink"){
price=50;
}
else if(item=="Coffee"){
price=60;
}
else if(item=="Chocolate Shake"){
price=140;
}
else{
System.out.println(item+" not found.. ");
}

System.out.println("search ended");

return price;

}

public static int search(String item,int quantity){

System.out.println("search started");

int price=0;

if(item=="Burger"){
price=99*quantity;
}
else if(item=="Pizza"){
price=129*quantity;
}
else if(item=="Veg Biryani"){
price=224*quantity;
}
else if(item=="Paneer Sandwich"){
price=55*quantity;
}
else if(item=="Chicken Kabab"){
price=155*quantity;
}
else if(item=="French Fries"){
price=119*quantity;
}
else if(item=="Peri Peri Fries"){
price=139*quantity;
}
else if(item=="Chicken Burger"){
price=179*quantity;
}
else if(item=="Veg Burger"){
price=129*quantity;
}
else if(item=="Chicken Biryani"){
price=299*quantity;
}
else if(item=="Egg Biryani"){
price=199*quantity;
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
else if(item=="Momos"){
price=149*quantity;
}
else if(item=="Paneer Tikka"){
price=249*quantity;
}
else if(item=="Chicken Tikka"){
price=289*quantity;
}
else if(item=="Butter Naan"){
price=40*quantity;
}
else if(item=="Garlic Naan"){
price=55*quantity;
}
else if(item=="Chapati"){
price=25*quantity;
}
else if(item=="Kulcha"){
price=60*quantity;
}
else if(item=="Jeera Rice"){
price=149*quantity;
}
else if(item=="Curd Rice"){
price=119*quantity;
}
else if(item=="Meals"){
price=199*quantity;
}
else if(item=="Ice Cream"){
price=80*quantity;
}
else if(item=="Brownie"){
price=95*quantity;
}
else if(item=="Soft Drink"){
price=50*quantity;
}
else if(item=="Coffee"){
price=60*quantity;
}
else if(item=="Chocolate Shake"){
price=140*quantity;
}
else{
System.out.println(item+" not found.. ");
}

System.out.println("search ended");

return price;

}

public static void main(String food[]){

System.out.println("main started");

String anyThing="Paneer Sandwich";

int price=search(anyThing);
System.out.println("The Price of "+anyThing+" is "+price);

int priceWithQuantity=search(anyThing,4);
System.out.println("The Price of "+anyThing+" is "+priceWithQuantity);

System.out.println("main ended");

}

}