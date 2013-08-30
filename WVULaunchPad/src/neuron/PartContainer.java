package neuron;

import java.util.HashMap;

import neuron.parts.Axon;
import neuron.parts.Body;
import neuron.parts.Dendrite;
import neuron.parts.Input;
import neuron.parts.Nucleus;

public class PartContainer {
	private String name;
	private Axon axon;
	private Body body;
	private Dendrite dendrite;
	private Nucleus nucleus;
	private HashMap<String, Input> inputs = new HashMap<String, Input>();
	
	
}
