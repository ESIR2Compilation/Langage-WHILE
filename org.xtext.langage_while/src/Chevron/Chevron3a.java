package Chevron;

import java.util.List;

public class Chevron3a {

	
	private String op;
	private String write;
	private List<Chevron3a> Read1;
	private List<Chevron3a> Read2;
	
	
	public Chevron3a(String op, String write, List<Chevron3a> read1,
			List<Chevron3a> read2) {
		super();
		this.op = op;
		this.write = write;
		Read1 = read1;
		Read2 = read2;
	}
	

	public String getOp() {
		return op;
	}


	public void setOp(String op) {
		this.op = op;
	}


	public String getWrite() {
		return write;
	}


	public void setWrite(String write) {
		this.write = write;
	}


	public List<Chevron3a> getRead1() {
		return Read1;
	}


	public void setRead1(List<Chevron3a> read1) {
		Read1 = read1;
	}


	public List<Chevron3a> getRead2() {
		return Read2;
	}


	public void setRead2(List<Chevron3a> read2) {
		Read2 = read2;
	}
}
