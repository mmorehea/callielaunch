package cells.parts;

public class Nucleus extends Part {
	
	public Nucleus(String filePath){
		super.setFilePath(filePath);
		super.setType("nucleus");
	}
	@Override
	public Nucleus clone(){
		return new Nucleus(super.getFilePath());
	}
}
