package constructor;

public class Bus {
	int seats;
	String color;
	Bus(int seats,String color){
	this.seats = seats;
		this.color = color;
	}
	Bus(){
		this(40);
	}
	Bus(int seats){
		this(seats,"blue");
	}
	void busDetails() {
		System.out.println("The bus has " + seats + " seats " + "color " + color );
	}
}
