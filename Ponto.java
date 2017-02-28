//Matheus Nascimento
public class Ponto{
	private  double x, y;
	public void setX(double x){
		this.x = x;
	}
	public  double getX(){
		return x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getY(){
		return y;
	}
	public static void main(String []args){
		Ponto p1 = new Ponto();
		p1.setX(10);
		p1.setY(20);
		Ponto p2 = new Ponto();
		p2.setX(15);
		p2.setY(30);
		//A operação parar calcular a distância entre dois pontos foi diminuido
		double d = Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY() - p2.getY()),2); //√¯(x1 - x2)² + (y1 - y2)²
		System.out.println(d);
		//Operação para calcular a área da reta
		double = area_reta = ((p1.getY() + p2.getY()) * (Math.abs(p1.getX() - p2.getX()))) / 2; // ((B + b) * h )/ 2
		System.out.println (area_reta);
	}
}
