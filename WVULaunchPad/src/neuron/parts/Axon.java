package neuron.parts;

public class Axon extends Part{
	
	public Axon(String filePath){
		super.setFilePath(filePath);
		super.setType("axon");
	}
	@Override
	public Axon clone(){
		return new Axon(super.getFilePath());
	}
}
