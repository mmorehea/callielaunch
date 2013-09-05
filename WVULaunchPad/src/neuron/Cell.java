package neuron;

import java.util.ArrayList;
import java.util.HashMap;

import neuron.parts.Axon;
import neuron.parts.Body;
import neuron.parts.Dendrite;
import neuron.parts.Input;
import neuron.parts.Nucleus;
import neuron.parts.Part;


public class Cell{
	private String name;
	private HashMap<String, Part> parts = new HashMap<String, Part>();
	private ArrayList<Input> inputs = new ArrayList<Input>();
	
	
	public Cell(String givenName){
		this.name = givenName;
	}

	//Setters
	public void setName(String newName){
		this.name = newName;
	}
	public void setAxon(String filePath){
		parts.put("axon", new Axon(filePath));
	}
	public void setBody(String filePath){
		parts.put("body", new Body(filePath));
	}
	public void setDendrite(String filePath){
		parts.put("dendrite", new Dendrite(filePath));
	}
	public void setNucleus(String filePath){
		parts.put("nucleus", new Nucleus(filePath));
	}
	public void setInputs(String[] filePaths){
		inputs = new ArrayList<Input>();
		for (String filePath : filePaths){
			inputs.add(new Input(filePath));
		}
	}
	
	public void removeAxon(){
		parts.remove("axon");
	}
	public void removeBody(){
		parts.remove("body");
	}
	public void removeDendrite(){
		parts.remove("dendrite");
	}
	public void removeNucleus(){
		parts.remove("nucleus");
	}
	
	//Getters
	public String getName(){
		return name;
	}
	public String getAxonPath(){
		return (parts.get("axon").getFilePath());	
	}
	public String getBodyPath(){
		return (parts.get("body").getFilePath());
	}
	public String getDendritePath(){
		return (parts.get("dendrite").getFilePath());
	}
	public String getNucleusPath(){
		return (parts.get("nucleus").getFilePath());
	}


	public Cell clone(){
		Cell clonedCell = new Cell(this.name);
		
		clonedCell.setAxon(parts.get("axon").getFilePath());
		clonedCell.setBody(parts.get("body").getFilePath());
		clonedCell.setDendrite(parts.get("dendrite").getFilePath());
		clonedCell.setNucleus(parts.get("nucleus").getFilePath());
		
		String[] clonedInputPaths = new String[inputs.size()];
		for (int i = 0; i < inputs.size(); i++){
			clonedInputPaths[i] = inputs.get(i).getFilePath();
		}
		clonedCell.setInputs(clonedInputPaths);
		return null;
	}
	
	public String toString(){
		String id = name + ":\n\t";
		return id;
	}
	public String toXML(){
		return null;
	}
}