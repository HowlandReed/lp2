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
		double x12, y12, d;
		x12 = (p1.getX() - p2.getX());
		y12 = (p1.getY() - p2.getY());
		d = Math.sqrt(Math.pow(x12, 2) + Math.pow(y12, 2));
		System.out.println(d);
	}
}
