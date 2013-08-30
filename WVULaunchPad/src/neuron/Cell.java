package neuron;

import java.util.HashMap;
import java.util.Set;

import neuron.parts.Axon;
import neuron.parts.Body;
import neuron.parts.Dendrite;
import neuron.parts.Input;
import neuron.parts.Nucleus;



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

	//Setters
	public void setName(String newName){
		this.name = newName;
	}
	public void setAxon(String filePath){
		axon = new Axon(filePath);
	}
	public void setAxon(Axon axon){
		if (axon != null) this.axon = axon;
	}
	
	public void setBody(String filePath){
		body = new Body(filePath);
	}
	public void setBody(Body givenBody){
		if (givenBody != null) this.body = givenBody;
	}
	
	public void setDendrite(String filePath){
		dendrite = new Dendrite(filePath);
	}
	public void setDendrite(Dendrite givenDendrite){
		if (givenDendrite != null) this.dendrite = givenDendrite;
	}
	
	public void setNucleus(String filePath){
		nucleus = new Nucleus(filePath);
	}
	public void setNucleus(Nucleus givenNucleus){
		if (givenNucleus != null) this.nucleus = givenNucleus;
	}
	
	public void addInput(String name, String filePath){
		inputs.put(name, new Input(filePath));
	}
	public void addInput(String name, Input givenInput){
		inputs.put(name, givenInput);
	}
	
	//Removers
	public void removeAxon() throws CellException{
		if (axon != null) axon = null;
		else throw new CellException("No axon exists to be removed.");
	}
	public void removeBody() throws CellException{
		if (body != null) body = null;
		else throw new CellException("No cell body exists to be removed.");
	}
	public void removeDendrite() throws CellException{
		if (dendrite != null) dendrite = null;
		else throw new CellException("No dendrite exists to be removed.");
	}
	public void removeNucleus() throws CellException{
		if (nucleus != null) nucleus = null;
		else throw new CellException("No nucleus exists to be removed.");
	}
	public void removeInput(String inputName) throws CellException{
		if (inputs.containsKey(inputName)){
			inputs.remove(inputName);
		}
		else throw new CellException("No such input exists to be removed.");
	}
	
	//Getters
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
	public String getName(){
		return name;
		
	}
	
	public String toString(){
		String id = name + ":\n\t";
		return id;
	}
	public String toXML(){
		return null;
	}
	
	@Override
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
	

}