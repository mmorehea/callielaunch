package parts;

import static org.junit.Assert.*;

import neuron.parts.Axon;

import org.junit.Before;
import org.junit.Test;

public class AxonTest {
	Axon axon;
	@Before
	public void setUp() throws Exception {
		axon = new Axon("axon_path");
	}

	@Test
	public void test() {
		assertTrue("File path is axon_path", axon.getFilePath().equals("axon_path"));
	}

}
