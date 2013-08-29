package parts;

public class Body extends Part{
	
	public Body(String filePath){
		super.setFilePath(filePath);
	}
	public Body clone(){
		return new Body(super.getFilePath());
	}
}
