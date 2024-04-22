package open_closed_principal;

public interface InvoiceDao {

	public void save();
	
}


class DatabaseInvoiceDao implements InvoiceDao {

	@Override
	public void save() {
		// save to DB
		
	}
	
}

class FileInvoiceDao implements InvoiceDao {

	@Override
	public void save() {
		// save to File
		
	}
	
}
