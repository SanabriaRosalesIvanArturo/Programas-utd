package programas_u1_poo;

public class Programa01 {
	public String color;
	public int patas;
	
	public Programa01() {
	this.color="Cafe";
	this.patas=4;
	}
	public Programa01 (String color, int patas){
		this.color=color;
	    this.patas=patas;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programa01 a = new Programa01();
		System.out.println("hola mundo...");
	}

}
