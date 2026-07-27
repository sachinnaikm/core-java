class Calculator {

public static void add() {
	int first = 10;
	int second = 20;
	int total = first + second;
	System.out.println(total);
}

public static void sub(){
	int first=10;
	int second=20;
	int total = first-second;
	System.out.println(total);
}

public static void multiplication(){
	int first=10;
	int second=20;
	int total=first*second;
	System.out.println(total);
}

public static void devide(){
	int first=10;
	int second=20;
	int total=first/second;
	System.out.println(total);
}
public static void main(String sam[]) {

System.out.println("Main Started");
        add();
		sub();
		multiplication();
		devide();
System.out.println("Main End");
    } 
}