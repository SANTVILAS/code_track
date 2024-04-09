package has_a_relatioship;

public class Collage {
	
	private String collageName;
	private String collageLocation;
	
	public Collage(String collageName, String collageLocation) {
		
		this.collageName = collageName;
		this.collageLocation = collageLocation;
	}

	@Override
	public String toString() {
		return "Collage [collageName=" + collageName + ", collageLocation=" + collageLocation + "]";
	}
	
	
	

}
