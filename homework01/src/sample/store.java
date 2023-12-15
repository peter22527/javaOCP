package sample;

public class store {
	//
	private String name;
	private Integer led;
	private Integer ram;
	private Integer mouse;
	private Integer sum1;
	private Integer sum2;
	private Integer sum3;
	//
	public store(String name, Integer led, Integer ram, Integer mouse) 
	{
		super();
		this.name = name;
		//this.led = led*4999;
		if (led>0) {this.led=led*4999;} 
		else {throw new IllegalArgumentException();}
		
		//this.ram = ram*1280;
		if (ram>0) {this.ram=ram*1280;} 
		else {throw new IllegalArgumentException();}
		
		//this.mouse = mouse*799;
		if (mouse>0) {this.mouse=mouse*799;} 
		else {throw new IllegalArgumentException();}
		
		this.sum1 = led*4999+ram*1280+mouse*799;
		this.sum2=(int)(sum1*0.95);
		this.sum3=(int)(sum2*0.95);
		
     //
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLed() {
		return led;
	}
	public void setLed(Integer led) {
		this.led = led;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getMouse() {
		return mouse;
	}
	public void setMouse(Integer mouse) {
		this.mouse = mouse;
	}
	public Integer getSum1() {
		return sum1;
	}
	public void setSum1(Integer sum1) {
		this.sum1 = sum1;
	}
	public Integer getSum2() {
		return sum2;
	}
	public void setSum2(Integer sum2) {
		this.sum2 = sum2;
	}
	public Integer getSum3() {
		return sum3;
	}
	public void setSum3(Integer sum3) {
		this.sum3 = sum3;
	}

	        

	
	
	

}
