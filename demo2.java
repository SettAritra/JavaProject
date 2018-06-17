public class demo2 {
	public int i,j,k;
	
	public demo2(int i){
		this(i,2,3);
	}
	public demo2(int i, int j){
		this(i,j,3);
	}
	public demo2(int i, int j, int k) {
		System.out.println("values are:" + i + "-" + j + "-" + k);
	}

}
