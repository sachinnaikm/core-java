class MindMatrix{

public static void createAccount(String fullName,String mobile,String email,String password){

System.out.println("Full Name:"+fullName);
System.out.println("Mobile:"+mobile);
System.out.println("Email:"+email);
System.out.println("Password:"+password);

}

public static void main(String sam[]){

System.out.println("MindMatrix Account Creation Started");

createAccount("Sachin Naik","9876543210","sachin@gmail.com","Sachin@123");

System.out.println("Account Created Successfully");
}
}