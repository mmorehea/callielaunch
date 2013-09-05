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
	public void setCellBody(String filePath){
		parts.put("body", new Body(filePath));
	}
	public void setDendrite(String filePath){
		parts.put("dendrite", new Dendrite(filePath));
	}
	public void setNucleus(String filePath){
		parts.put("nucleus", new Nucleus(filePath));
	}
	public void setInputs(String[] filePaths){
		for (String filePath : filePaths){
			inputs.add(new Input(filePath));
		}
	}
	
	//Getters
	public String getName(){
		return name;
	}
	public String getAxonPath(){
		return (parts.get("axon").getFilePath());	
	}
	public String getCellBodyPath(){
		return (parts.get("body").getFilePath());
	}
	public String getDendritePath(){
		return (parts.get("dendrite").getFilePath());
	}
	public String getNucleusPath(){
		return (parts.get("nucleus").getFilePath());
	}


	
	public String toString(){
		String id = name + ":\n\t";
		return id;
	}
	public String toXML(){
		return null;
	}
}