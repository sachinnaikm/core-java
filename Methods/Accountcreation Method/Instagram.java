class Instagram{

public static void createAccount(String mobile,String password,String birthday,String fullName,String userName){

System.out.println("Mobile:"+mobile);
System.out.println("Password:"+password);
System.out.println("Birthday:"+birthday);
System.out.println("Full Name:"+fullName);
System.out.println("User Name:"+userName);

}

public static void main(String sam[]){

System.out.println("Instagram Sign Up Started");

createAccount("9876543210","Sachin@123","01-06-2004","Sachin Naik","sachin_018");

System.out.println("Account Created Successfully");
}
}