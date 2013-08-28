package wvulaunchpad;

import java.util.HashMap;

import parts.Axon;
import parts.Body;
import parts.Dendrite;
import parts.Input;
import parts.Nucleus;


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
		axon = new Axon(filePath);
	}
	public void setBody(String filePath){
		body = new Body(filePath);
	}
	public void setDendrite(String filePath){
		dendrite = new Dendrite(filePath);
	}
	public void setNucleus(String filePath){
		nucleus = new Nucleus(filePath);
	}
	public void setInput(String name, String filePath){
		inputs.put(name, new Input(filePath));
	}
	
	public void removeAxon(){
		if (axon != null){
			axon = null;
		}
	}
	public void removeBody(){
		if (axon != null){
			axon = null;
		}
	}
	public void removeDendrite(){
		if (axon != null){
			axon = null;
		}
	}
	public void removeNucleus(){
		if (axon != null){
			axon = null;
		}
	}
	public void removeInput(String inputName){
		if (inputs.containsKey(inputName)){
			inputs.remove(inputName);
		}
	}
	
	public String getAxonFilePath(){
		
	}
	public String getBodyFilePath(){
		
	}
	public String getDendriteFilePath(){
		
	}
	public String getNucleusFilePath(){
		
	}
	public String getInputFilePath(String inputName){
		
	}
	
	public void setName(String givenName){
		this.name = givenName;
	}
	public String getName(){
		return name;
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