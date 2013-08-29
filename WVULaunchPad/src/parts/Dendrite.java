package parts;

public class Dendrite extends Part{
	
	public Dendrite(String filePath){
		super.setFilePath(filePath);
	}
	public Dendrite clone(){
		return new Dendrite(super.getFilePath());
	}
}
