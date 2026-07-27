class LinkedIn{

public static void createAccount(String firstName,String lastName,String email,String password){

System.out.println("FirstName:"+firstName);
System.out.println("LastName:"+lastName);
System.out.println("Email:"+email);
System.out.println("Password:"+password);

}

public static void main(String sam[]){

System.out.println("LinkedIn SignUp Started");

createAccount("Sachin","Naik","sachin@gmail.com","Sachin@123");

System.out.println("Account Created Successfully");
}
}