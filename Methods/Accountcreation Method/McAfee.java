class McAfee{

public static void createAccount(String firstName,String lastName,String email,String password){

System.out.println("First Name:"+firstName);
System.out.println("Last Name:"+lastName);
System.out.println("Email:"+email);
System.out.println("Password:"+password);

}

public static void main(String sam[]){

System.out.println("McAfee Account Creation Started");

createAccount("Sachin","Naik","sachin@gmail.com","Sachin@123");

System.out.println("Account Created Successfully");
}
}