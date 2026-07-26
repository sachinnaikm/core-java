class Magicpin{

public static int search(String item){

System.out.println("search started");

int price=0;

if(item=="Magic Masala Fries"){
price=129;
}
else if(item=="Cheese Burger"){
price=179;
}
else if(item=="Chicken Burger"){
price=199;
}
else if(item=="Veg Burger"){
price=149;
}
else if(item=="Margherita Pizza"){
price=249;
}
else if(item=="Farmhouse Pizza"){
price=329;
}
else if(item=="Veg Biryani"){
price=229;
}
else if(item=="Chicken Biryani"){
price=299;
}
else if(item=="Egg Biryani"){
price=199;
}
else if(item=="Paneer Sandwich"){
price=129;
}
else if(item=="Chicken Sandwich"){
price=169;
}
else if(item=="French Fries"){
price=119;
}
else if(item=="Peri Peri Fries"){
price=149;
}
else if(item=="Veg Fried Rice"){
price=189;
}
else if(item=="Chicken Fried Rice"){
price=239;
}
else if(item=="Veg Noodles"){
price=179;
}
else if(item=="Chicken Noodles"){
price=229;
}
else if(item=="Paneer Tikka"){
price=269;
}
else if(item=="Chicken Tikka"){
price=319;
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
price=159;
}
else if(item=="Curd Rice"){
price=99;
}
else if(item=="Meals"){
price=209;
}
else if(item=="Brownie"){
price=109;
}
else if(item=="Ice Cream"){
price=89;
}
else if(item=="Cold Coffee"){
price=119;
}
else if(item=="Chocolate Shake"){
price=149;
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

if(item=="Magic Masala Fries"){
price=129*quantity;
}
else if(item=="Cheese Burger"){
price=179*quantity;
}
else if(item=="Chicken Burger"){
price=199*quantity;
}
else if(item=="Veg Burger"){
price=149*quantity;
}
else if(item=="Margherita Pizza"){
price=249*quantity;
}
else if(item=="Farmhouse Pizza"){
price=329*quantity;
}
else if(item=="Veg Biryani"){
price=229*quantity;
}
else if(item=="Chicken Biryani"){
price=299*quantity;
}
else if(item=="Egg Biryani"){
price=199*quantity;
}
else if(item=="Paneer Sandwich"){
price=129*quantity;
}
else if(item=="Chicken Sandwich"){
price=169*quantity;
}
else if(item=="French Fries"){
price=119*quantity;
}
else if(item=="Peri Peri Fries"){
price=149*quantity;
}
else if(item=="Veg Fried Rice"){
price=189*quantity;
}
else if(item=="Chicken Fried Rice"){
price=239*quantity;
}
else if(item=="Veg Noodles"){
price=179*quantity;
}
else if(item=="Chicken Noodles"){
price=229*quantity;
}
else if(item=="Paneer Tikka"){
price=269*quantity;
}
else if(item=="Chicken Tikka"){
price=319*quantity;
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
price=159*quantity;
}
else if(item=="Curd Rice"){
price=99*quantity;
}
else if(item=="Meals"){
price=209*quantity;
}
else if(item=="Brownie"){
price=109*quantity;
}
else if(item=="Ice Cream"){
price=89*quantity;
}
else if(item=="Cold Coffee"){
price=119*quantity;
}
else if(item=="Chocolate Shake"){
price=149*quantity;
}
else{
System.out.println(item+" not found..");
}

System.out.println("search ended");

return price;

}

public static void main(String food[]){

System.out.println("main started");

String anyThing="Farmhouse Pizza";

int price=search(anyThing);

System.out.println("The Price of "+anyThing+" is "+price);

int priceWithQuantity=search(anyThing,2);

System.out.println("The Price of "+anyThing+" is "+priceWithQuantity);

System.out.println("main ended");

}

}