public class age{
	//declare variables
	private int age;
	private String message;
	//constructor
	public age(){
		age=0;
		message="";
	}
	//set method
	public void setAge(int age){
		this.age=age;
	}
	//compute
	public void compute(){
		if(age>=18){
			message="Welcome!";
		}
		else{
			message="Go away!";
		}
	}

	//get method
	public String getMessage(){
		return message;
	}
}