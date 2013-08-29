package parts;

public class Input extends Part{
	
	public Input(String filePath){
		super.setFilePath(filePath);
	}
	public Input clone(){
		return new Input(super.getFilePath());
	}
}
