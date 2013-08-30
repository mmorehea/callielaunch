package wvulaunchpad;

import java.util.HashMap;

public class Set {
	private String name;
	
	private HashMap<String, Cell> cells = new HashMap<String, Cell>();
		
	public Set(String givenName){
		this.name = givenName;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void addCell(String cellName, Cell cell){
		if (cells.containsKey(cellName)){
			throw new CellException("This set already contains a cell with that name.")
		}
		else cells.put(cellName, cell.clone());
	}
	public Cell getCell(String cellName) throws CellException{
		if (cells.containsKey(cellName)){
			return cells.get(cellName);
		}
		else throw new CellException("Cannot find the cell: " + cellName);
	}
	public void removeCell(String cellName) throws CellException{
		if (cells.containsKey(cellName)){
			cells.remove(cellName);
		}
	}
}
