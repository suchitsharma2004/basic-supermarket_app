package supermarket.products;

public class DairyProducts extends GroceryProducts {
	private Fat Fat;
public DairyProducts(String name, double price, double discount,Fat Fat) {
		super(name, price, discount);
		// TODO Auto-generated constructor stub
		this.Fat=Fat;
	}

public Fat getFat() {
	return Fat;
}

public void setFat(Fat fat) {
	Fat = fat;
}
public String toString() {
	return super.toString()+"Fat Level: "+ Fat;
}

}
