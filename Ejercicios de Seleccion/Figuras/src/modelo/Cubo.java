package modelo;

public class Cubo extends Cuadrado{

		private double cubo;
		
		public Cubo(double cubo,double area) {
		
			super(0.0, 0.0);
			this.cubo=cubo;
		}
		

		public double getCubo() {
			return cubo;
		}


		public void setCubo(double cubo) {
			this.cubo = cubo;
		}

		
		@Override
		public double calcular_Area() {
			double res;
			res=Math.pow(getCubo(), 3);
			setArea(res);
			return getArea();	
		}
		
		@Override
		public double calcular_Perimetro() {
			setPerimetro(getCubo()*4);
			return getPerimetro();
			
			
			
		}				
}
