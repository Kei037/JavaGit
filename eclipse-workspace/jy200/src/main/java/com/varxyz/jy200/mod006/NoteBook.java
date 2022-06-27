package com.varxyz.jy200.mod006;

public class NoteBook extends Product {
	private boolean ThinkPad = false;
	
	public NoteBook(String name) {
		super(name);
		if (getName().startsWith("ThinkPad")) {
			ThinkPad = true;
		}
	}
	
	public double getPrice() {
		if(ThinkPad) {
			return 25000.0;
		}else {
			return 20000.0;
		}
	}
	
	public String getCpu() {
		if(ThinkPad) {
			return "i7";
		}else {
			return "i5";
		}
	}
}
