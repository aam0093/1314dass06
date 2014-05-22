package lanSimulation.internals;

import lanSimulation.Network;

public class WorkStation extends Node {

	public WorkStation(String name) {
		super(name);
	}

	public WorkStation(byte type, String name, Node nextNode) {
		super(name, nextNode);
	}

	
	@Override
	public void printOn(StringBuffer buf, Network network) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}

	@Override
	public void printXMLOn(StringBuffer buf, Network network) {
		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");
	}
	
}
