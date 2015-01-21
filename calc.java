public class calc{
	//declares vars
	private int x;
	private int y;
	private int z;
	private int ans;

	public void setX(int x){
		this.x=x;
	}

	public void setY(int y){
		this.y=y;
	}

	public void setZ(int z){
		this.z=z;
	}

	public void compute(){
		ans=x+y+z;
	}

	public int nci(){
		return ans;
	}

}