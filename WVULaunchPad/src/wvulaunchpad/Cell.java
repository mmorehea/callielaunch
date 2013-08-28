package wvulaunchpad;

import java.util.ArrayList;

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
	private ArrayList<Input> inputs = new ArrayList<Input>();
	
	public Cell(String givenName){
		this.name = givenName;
	}
	
	public void addAxon(String filePath){
		axon = new Axon(filePath);
	}
	public void addBody(String filePath){
		body = new Body(filePath);
	}
	public void addDendrite(String filePath){
		dendrite = new Dendrite(filePath);
	}
	public void addNucleus(String filePath){
		nucleus = new Nucleus(filePath);
	}
	public void addInput(String filePath){
		inputs.add(new Input(filePath));
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