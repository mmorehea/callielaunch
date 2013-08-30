package neuron.parts;

public class Input extends Part{
	
	public Input(String filePath){
		super.setFilePath(filePath);
		super.setType("input");
	}
	@Override
	public Input clone(){
		return new Input(super.getFilePath());
	}
}
