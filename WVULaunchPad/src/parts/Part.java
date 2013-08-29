package parts;

public abstract class Part{
	
	private String filePath;
	
	public String getFilePath(){
		return filePath;
	}
	public void setFilePath(String givenFilePath){
		this.filePath = givenFilePath;
	}
	
	
	
//-----legacy code---
// author tonye	
//    /**
//	 * 
//	 */
//	private static final long serialVersionUID = -6831229235386955326L;
//	String name;
//        File file; 
//
// public Part(File filename){
// file = filename;
// name = " ";
//}
//  public void setName(String str){
//	  System.err.println(str);
//	  Matcher m = Pattern.compile("\\s*Input\\s(\\d+)\\s*").matcher(str);
//	  if(m.matches()){
//		  name = "in"+ m.group(1);
//	  }
//	  else if(str.equalsIgnoreCase("dendrites"))
//		  name = "dendrite";
//	  else
//		  name = str.toLowerCase();
//}
// 
// public String[] toStringArr(){
//        return new String[]{name,file.getAbsolutePath()};
//     
// }
// 
// @Override
// public String toString(){
//	 return " "+name+" "+file.getAbsolutePath();
// }
}
