package AI_Quest;

public class Tv_08_20 {
	String color = "black";
	boolean power = false;
	int channel = 0;
	
	public Tv_08_20() {
	}
	public void power() {
			this.power = !this.power;
		
	}
	public void channelUp() {
		this.channel = channel+1;
	}
	public void channeldown() {
		this.channel = channel-1;
	}
	public void print() {
		System.out.println("color :"+this.color+" power :"+this.power+" channel: "+this.channel);
	}
}
