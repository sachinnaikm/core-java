class LearningApp{

public static void createAccount(String fullName,String mobile,String email,String password,String confirmPassword){

System.out.println("FullName:"+fullName);
System.out.println("Mobile:"+mobile);
System.out.println("Email:"+email);
System.out.println("Password:"+password);
System.out.println("ConfirmPassword:"+confirmPassword);

}

public static void main(String sam[]){

System.out.println("Account Creation Started");

createAccount("SachinNaik","9876543210","sachin@gmail.com","Sachin@123","Sachin@123");

System.out.println("Account Created Successfully");
}
}