class BankRunner{
public static void main(String[]sam){

String sbibranches[]={"Vijayanagar"};
String sbibranches1[]={"Administrative Unit,Zonal Office,Zone2,Network II,Bangalore"};
String sbibranches2[]={"AECS B Layout"};
String sbibranches3[]={"Akash Nagar"};
String sbibranches4[]={"Ananthapura Gate"};
String sbibranches5[]={"Attoor Layout,Bangalore"};
String sbibranches6[]={"Begur"};
String sbibranches7[]={"Bellandur,Bangalore"};
String sbibranches8[]={"Bharathnagar II Phase"};
String sbibranches9[]={"Brigade Metropolis,Bangalore"};




Bank bank=new Bank();
bank.bankId=1;
bank.bankName="SBI Bank";
bank.ifscCode="SBI0099801";
bank.location="Bengaluru";
bank.address="Vijayanagar";
bank.branches=sbibranches;

System.out.println("==========First Bank Details==========");
System.out.println("Bank Id:"+bank.bankId);
System.out.println("Bank Name:"+bank.bankName);
System.out.println("IFSC Code:"+bank.ifscCode);
System.out.println("Location:"+bank.location);
System.out.println("Address:"+bank.address);
System.out.println("Branches:");
for(String branch:bank.branches){
System.out.println(branch);
}


Bank bank1=new Bank();
bank1.bankId=2;
bank1.bankName="STATE BANK OF INDIA";
bank1.ifscCode="SBIN0015895";
bank1.location="Bangalore";
bank1.address="No.911,II Floor,State Bank Building,Infantry Road,Shivajinagar,Bangalore-560001";
bank1.branches=sbibranches;

System.out.println("=========Second Bank Details=============");
System.out.println("Bank Id:"+bank1.bankId);
System.out.println("Bank Name:"+bank1.bankName);
System.out.println("IFSC Code:"+bank1.ifscCode);
System.out.println("Location:"+bank1.location);
System.out.println("Address:"+bank1.address);
System.out.println("Branches:");
for(String branch:bank1.branches){
System.out.println(branch);
}



Bank bank2=new Bank();
bank2.bankId=3;
bank2.bankName="STATE BANK OF INDIA";
bank2.ifscCode="SBIN0041190";
bank2.location="Bangalore";
bank2.address="No.739,The Aircraft Employees Co-Operative Society Ltd Layout,B Block,Begur Hobli,Singasandra Village,80 Feet Main Road,Bangalore-560027";
bank2.branches=sbibranches2;

System.out.println("=========Third Bank Details=============");
System.out.println("Bank Id:"+bank2.bankId);
System.out.println("Bank Name:"+bank2.bankName);
System.out.println("IFSC Code:"+bank2.ifscCode);
System.out.println("Location:"+bank2.location);
System.out.println("Address:"+bank2.address);
System.out.println("Branches:");
for(String branch:bank2.branches){
System.out.println(branch);
}


Bank bank3=new Bank();
bank3.bankId=4;
bank3.bankName="STATE BANK OF INDIA";
bank3.ifscCode="SBIN0015033";
bank3.location="Bangalore";
bank3.address="92,B Narayanapura,Akash Nagar,K R Puram Hobli,Bangalore-560016";
bank3.branches=sbibranches3;

System.out.println("=========Fourth Bank Details=============");
System.out.println("Bank Id:"+bank3.bankId);
System.out.println("Bank Name:"+bank3.bankName);
System.out.println("IFSC Code:"+bank3.ifscCode);
System.out.println("Location:"+bank3.location);
System.out.println("Address:"+bank3.address);
System.out.println("Branches:");
for(String branch:bank3.branches){
System.out.println(branch);
}


Bank bank4=new Bank();
bank4.bankId=5;
bank4.bankName="STATE BANK OF INDIA";
bank4.ifscCode="SBIN0041203";
bank4.location="Bangalore";
bank4.address="NPA Reddy Arcade,Ananthapura,Yelahanka,Bangalore-560085";
bank4.branches=sbibranches4;

System.out.println("=========Fifth Bank Details=============");
System.out.println("Bank Id:"+bank4.bankId);
System.out.println("Bank Name:"+bank4.bankName);
System.out.println("IFSC Code:"+bank4.ifscCode);
System.out.println("Location:"+bank4.location);
System.out.println("Address:"+bank4.address);
System.out.println("Branches:");
for(String branch:bank4.branches){
System.out.println(branch);
}


Bank bank5=new Bank();
bank5.bankId=6;
bank5.bankName="STATE BANK OF INDIA";
bank5.ifscCode="SBIN0013282";
bank5.location="Bangalore";
bank5.address="Adjacent to KMF Dairy,80FT Double Road,Yelahanka Satellite Town,Bangalore-560064";
bank5.branches=sbibranches5;

System.out.println("=========Sixth Bank Details=============");
System.out.println("Bank Id:"+bank5.bankId);
System.out.println("Bank Name:"+bank5.bankName);
System.out.println("IFSC Code:"+bank5.ifscCode);
System.out.println("Location:"+bank5.location);
System.out.println("Address:"+bank5.address);
System.out.println("Branches:");
for(String branch:bank5.branches){
System.out.println(branch);
}


Bank bank6=new Bank();
bank6.bankId=7;
bank6.bankName="STATE BANK OF INDIA";
bank6.ifscCode="SBIN0018916";
bank6.location="Bangalore";
bank6.address="Radiant Shine Commercial Building,S.No.53/3,Yelanahalli,Begur,Bangalore-560068";
bank6.branches=sbibranches6;

System.out.println("=========Seventh Bank Details=============");
System.out.println("Bank Id:"+bank6.bankId);
System.out.println("Bank Name:"+bank6.bankName);
System.out.println("IFSC Code:"+bank6.ifscCode);
System.out.println("Location:"+bank6.location);
System.out.println("Address:"+bank6.address);
System.out.println("Branches:");
for(String branch:bank6.branches){
System.out.println(branch);
}


Bank bank7=new Bank();
bank7.bankId=8;
bank7.bankName="STATE BANK OF INDIA";
bank7.ifscCode="SBIN0015647";
bank7.location="Bangalore";
bank7.address="Surajpur Main Road,Kaikondrahalli,Bellandur Ward,Bangalore-560035";
bank7.branches=sbibranches7;

System.out.println("=========Eighth Bank Details=============");
System.out.println("Bank Id:"+bank7.bankId);
System.out.println("Bank Name:"+bank7.bankName);
System.out.println("IFSC Code:"+bank7.ifscCode);
System.out.println("Location:"+bank7.location);
System.out.println("Address:"+bank7.address);
System.out.println("Branches:");
for(String branch:bank7.branches){
System.out.println(branch);
}


Bank bank8=new Bank();
bank8.bankId=9;
bank8.bankName="STATE BANK OF INDIA";
bank8.ifscCode="SBIN0041198";
bank8.location="Bangalore";
bank8.address="Vijayalakshmi Complex,S-1207,Bharathnagar II Phase,Bangalore-560091";
bank8.branches=sbibranches8;

System.out.println("=========Ninth Bank Details=============");
System.out.println("Bank Id:"+bank8.bankId);
System.out.println("Bank Name:"+bank8.bankName);
System.out.println("IFSC Code:"+bank8.ifscCode);
System.out.println("Location:"+bank8.location);
System.out.println("Address:"+bank8.address);
System.out.println("Branches:");
for(String branch:bank8.branches){
System.out.println(branch);
}


Bank bank9=new Bank();
bank9.bankId=10;
bank9.bankName="STATE BANK OF INDIA";
bank9.ifscCode="SBIN0015034";
bank9.location="Bangalore";
bank9.address="M/S Brigade Enterprises,Whitefield Road,Bangalore-560016";
bank9.branches=sbibranches9;

System.out.println("=============================Tenth Bank Details============================");
System.out.println("Bank Id:"+bank9.bankId);
System.out.println("Bank Name:"+bank9.bankName);
System.out.println("IFSC Code:"+bank9.ifscCode);
System.out.println("Location:"+bank9.location);
System.out.println("Address:"+bank9.address);
System.out.println("Branches:");
for(String branch:bank9.branches){
System.out.println(branch);
}















































































}
}