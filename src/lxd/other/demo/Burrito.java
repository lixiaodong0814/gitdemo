package lxd.other.demo;

/*
 * enum 可以在switch里使用 
 * switch还可以包含int  char 
 */
public class Burrito {
	Spiciness degree;
	
	public Burrito(Spiciness degree) {
		this.degree = degree;
	}
	
	public void describe() {
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT: 	System.out.println("not spicy at all");
			break;
		case MILD: 	System.out.println("a little hot");
			break;
		case HOT: 
		case FLAMING:
		default:	System.out.println("maybe too hot");
		}
	}
	
	public static void main(String[] args) {
		Burrito 
			plain = new Burrito(Spiciness.NOT),
			greenChile = new Burrito(Spiciness.MEDIUM),
			jalapeno = new Burrito(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}
}
