package single_responsibility_principal;

public class InvoicePrinter {

	private Invoice invoice;
	
	public InvoicePrinter(Invoice invoice) {
		this.invoice =invoice;
	}
}
