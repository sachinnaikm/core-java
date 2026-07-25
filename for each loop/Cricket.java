class Cricket{
public static void main(String sam[]){
String menBatters[]={"ViratKohli","RohitSharma","ShubmanGill","JoeRoot","SteveSmith","KaneWilliamson","BabarAzam","TravisHead","KLRahul","RishabhPant"};
String menBowlers[]={"JaspritBumrah","MohammedShami","KuldeepYadav","RavindraJadeja","PatCummins","MitchellStarc","RashidKhan","TrentBoult","JoshHazlewood","ShaheenAfridi"};
String womenBatters[]={"SmritiMandhana","HarmanpreetKaur","ShafaliVerma","JemimahRodrigues","BethMooney","MegLanning","EllysePerry","NatSciverBrunt","LauraWolvaardt","ChamariAthapaththu"};
String womenBowlers[]={"DeeptiSharma","RenukaSingh","SophieEcclestone","MeganSchutt","ShabnimIsmail","AmeliaKerr","JessJonassen","PoonamYadav","RadhaYadav","AlanaKing"};

System.out.println("Top 10 Men Batters");
for(String player:menBatters){
System.out.println(player);
}

System.out.println("Top 10 Men Bowlers");
for(String player:menBowlers){
System.out.println(player);
}

System.out.println("Top 10 Women Batters");
for(String player:womenBatters){
System.out.println(player);
}

System.out.println("Top 10 Women Bowlers");
for(String player:womenBowlers){
System.out.println(player);
}
}
}