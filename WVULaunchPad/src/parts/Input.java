package parts;

public class Input extends Part{
	
	public Input(String filePath){
		super.setFilePath(filePath);
	}
	@Override
	public Input clone(){
		return new Input(super.getFilePath());
	}
}
