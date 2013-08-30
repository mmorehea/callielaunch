package parts;

public class Axon extends Part{
	
	public Axon(String filePath){
		super.setFilePath(filePath);
	}
	@Override
	public Axon clone(){
		return new Axon(super.getFilePath());
	}
}
