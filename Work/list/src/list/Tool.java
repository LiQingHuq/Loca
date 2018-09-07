package list;

public class Tool <JJ>{
	private JJ q;

	public JJ getQ() {
		return q;
	}

	public void setQ(JJ q) {
		this.q = q;
	}
	public <w> void show(w str){
		System.out.println("show:"+str.toString());
	}
	public void print(JJ str){
		System.out.println("print:"+str.toString());
	}
}
