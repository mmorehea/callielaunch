package parts;

public class Axon extends Part{
	
	public Axon(String filePath){
		super.setFilePath(filePath);
	}
	public Axon clone(){
		return new Axon(super.getFilePath());
	}
}
