package neuron;

public class Body extends Part{
	
	public Body(String filePath){
		super.setFilePath(filePath);
	}
	@Override
	public Body clone(){
		return new Body(super.getFilePath());
	}
}
