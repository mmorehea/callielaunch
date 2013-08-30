package neuron.parts;

public class Body extends Part{
	
	public Body(String filePath){
		super.setFilePath(filePath);
		super.setType("body");
	}
	@Override
	public Body clone(){
		return new Body(super.getFilePath());
	}
}
