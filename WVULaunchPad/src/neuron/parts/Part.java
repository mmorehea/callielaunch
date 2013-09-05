package neuron.parts;

public abstract class Part{
	
	private String filePath;
	private String type;
	
	public String getFilePath(){
		return filePath;
	}
	public void setFilePath(String givenFilePath){
		this.filePath = givenFilePath;
	}
	public String getType(){
		return type;
	}
	protected void setType(String givenType){
		this.type = givenType;
	}
	public String toString(){
		return "Part; " + type + ", Path: " + filePath;
	}
	public String toXML(){
		return null;
	}
}
