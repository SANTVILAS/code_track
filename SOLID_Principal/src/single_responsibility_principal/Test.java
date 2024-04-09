package single_responsibility_principal;

public class Test {

	public static void main(String[] args) {
		Marker marker = new Marker("Camlin", "Black", 2024, 20);
		Invoice invoice = new Invoice(marker, 2);
        int finalPrice=invoice.calculateTotal();
        System.out.println(finalPrice);

	}

}
