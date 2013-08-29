package wvulaunchpad;

import java.util.HashMap;
import java.util.Set;

import parts.Axon;
import parts.Body;
import parts.Dendrite;
import parts.Input;
import parts.Nucleus;
import parts.PartFactory;


public class Cell{
	private String name;
	private Axon axon;
	private Body body;
	private Dendrite dendrite;
	private Nucleus nucleus;
	private HashMap<String, Input> inputs = new HashMap<String, Input>();
	
	public Cell(String givenName){
		this.name = givenName;
	}
	
	public void setAxon(String filePath){
		axon = new PartFactory().makeAxon(filePath);
	}
	public void setAxon(Axon axon){
		if (axon != null) this.axon = axon;
	}
	
	public void setBody(String filePath){
		body = new PartFactory().makeBody(filePath);
	}
	public void setBody(Body body){
		if (body != null) this.body = body;
	}
	
	public void setDendrite(String filePath){
		dendrite = new PartFactory().makeDendrite(filePath);
	}
	public void setDendrite(Dendrite dendrite){
		if (dendrite != null) this.dendrite = dendrite;
	}
	
	public void setNucleus(String filePath){
		nucleus = new PartFactory().makeNucleus(filePath);
	}
	public void setNucleus(Nucleus nucleus){
		if (nucleus != null) this.nucleus = nucleus;
	}
	
	public void addInput(String name, String filePath){
		inputs.put(name, new Input(filePath));
	}
	public void addInput(String name, Input input){
		inputs.put(name, input);
	}
	
	public void removeAxon() throws CellException{
		if (axon != null){
			axon = null;
		}
		else throw new CellException("No axon exists to be removed.");
	}
	public void removeBody() throws CellException{
		if (body != null){
			body = null;
		}
		else throw new CellException("No cell body exists to be removed.");
	}
	public void removeDendrite() throws CellException{
		if (dendrite != null){
			dendrite = null;
		}
		else throw new CellException("No dendrite exists to be removed.");
	}
	public void removeNucleus() throws CellException{
		if (nucleus != null){
			nucleus = null;
		}
		else throw new CellException("No nucleus exists to be removed.");
	}
	public void removeInput(String inputName) throws CellException{
		if (inputs.containsKey(inputName)){
			inputs.remove(inputName);
		}
		else throw new CellException("No such input exists to be removed.");
	}
	
	public String getAxonFilePath(){
		return axon.getFilePath();
	}
	public String getBodyFilePath(){
		return body.getFilePath();
	}
	public String getDendriteFilePath(){
		return dendrite.getFilePath();
	}
	public String getNucleusFilePath(){
		return nucleus.getFilePath();
	}
	public String getInputFilePath(String inputName) throws CellException{
		if (inputs.containsKey(inputName)){
			return inputs.get(inputName).getFilePath();
		}
		else throw new CellException("Cannot find the input: " + inputName);
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	public String getName(){
		return name;
	}
	
	public Cell clone(){
		Cell clonedCell = new Cell(name);
		
		clonedCell.setAxon(axon.clone());
		clonedCell.setBody(body.clone());
		clonedCell.setDendrite(dendrite.clone());
		clonedCell.setNucleus(nucleus.clone());
		
		String[] inputNames = (String[]) inputs.keySet().toArray();
		for (int i = 0; i < inputNames.length; i++){
			Input clonedInput = inputs.get(inputNames[i]).clone();
			clonedCell.addInput(inputNames[i], clonedInput);	
		}
		
		return clonedCell;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//---legacy code---
// author tonye	
//    private ArrayList<Part> parts = new ArrayList<Part>();
//    String name = " ";
//
//    public Cell() {
//    }
//
//    public void addPart(Part o) {
//        parts.add(o);
//    }
//
//    public String cellParts(String n) {
//        name = n;
//        String s = " ";
//        for (int i = 0; i < parts.size(); i++) {
//            Part p = parts.get(i);
//            s = n + " " + p.toString();
//            System.out.println("These are the cell parts " + s);
//        }
//        return s;
//
//    }
}