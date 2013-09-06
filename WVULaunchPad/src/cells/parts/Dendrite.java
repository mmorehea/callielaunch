package cells.parts;

public class Dendrite extends Part{
	
	public Dendrite(String filePath){
		super.setFilePath(filePath);
		super.setType("dendrite");
	}
	@Override
	public Dendrite clone(){
		return new Dendrite(super.getFilePath());
	}
}
