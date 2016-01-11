package code3a;

public abstract class Chevron {

	private String write;
	private String read1;
	private String read2;
	
	public Chevron(String write, String read1, String read2) {
		super();
		this.write = write;
		this.read1 = read1;
		this.read2 = read2;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		this.write = write;
	}

	public String getRead1() {
		return read1;
	}

	public void setRead1(String read1) {
		this.read1 = read1;
	}

	public String getRead2() {
		return read2;
	}

	public void setRead2(String read2) {
		this.read2 = read2;
	}
	
	public abstract String toString();
	public abstract String getCodeJava();
	
	
}
