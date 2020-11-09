
public class EatCake {

	
	
	
	
	public EatCake() {
		
		
	}
	
	public static void eatCake(Cake cake) {
		if(!cake.isEmpty()) {
		cake.takeABite();
		eatCake(cake);
		}
		else {
			System.out.println("No more cake eating, the cake is gone :(");
		}
		
	}
	
	
	public static void main(String[] args) {
		Cake cake = new Cake();
		eatCake(cake);
		System.out.println("Cake is gone, eating is finished.");
		
		

	}

}
