package differential;

public class Differential_lib implements Differential_if {

	private double a, h;
	
	public Differential_lib(double a, double h) {
		this.a = a;
		this.h = h;
	}

	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		return 2 * this.a;
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub
		return (Math.pow(this.a +  this.h, 2)-Math.pow(this.a, 2))/h;
	}
	
	public double Relative() {
		double R = getRx();
		double D = getDx();
		double RE = Math.abs(R - D);
		return RE / R * 100;
	}
	
	public double Relative2() {
		double a[] = new double[10];
		a[0] = 0;
		double b[] = new double[0];
		double R = getRx();
		a[1] = getDx();
		for(int i = 2; i < 10; i++) {
				this.h = this.h / 10;
				double D2 = getDx();				
				a[i] = Math.abs(R - D2) / R * 100;
				if(a[i] > a[i-1]) break; 
			}
			
		return this.h * 10;
	}
					
	

}
