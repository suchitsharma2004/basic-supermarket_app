package supermarket.products;

public class cart {
	public static void  main(String[]args) {
		BeverageProducts Sprite= new BeverageProducts("Sprite",2.5,10,SugarLevel.LIGHT);
		BeverageProducts Cola= new BeverageProducts("Cola",4,0,SugarLevel.ADDED_SUGAR);
		
		
		DairyProducts curd=new DairyProducts("Curd",5.5,50,Fat.SKIMMED);
		DairyProducts milk=new DairyProducts("milk",5.5,50,Fat.FULLCREAAM);
		
		
		System.out.println(Sprite.isHealthy());
		System.out.println(Cola.isHealthy());
		
		
		
		System.out.println(Sprite.GetActualPrice());
		System.out.println(Cola.GetActualPrice());
		System.out.println(curd.GetActualPrice());
		System.out.println(milk.GetActualPrice());

		System.out.println(Sprite);
		System.out.println(Cola);
		System.out.println(curd);
		System.out.println(milk);

		
	}


}
