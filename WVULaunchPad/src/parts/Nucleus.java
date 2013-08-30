package parts;

public class Nucleus extends Part {
	
	public Nucleus(String filePath){
		super.setFilePath(filePath);
	}
	@Override
	public Nucleus clone(){
		return new Nucleus(super.getFilePath());
	}
}
