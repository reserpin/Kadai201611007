package differential;

import java.util.Scanner;

public class Differential_lib implements Differential_if {
	Scanner scan = new Scanner(System.in);
	
	private double a,h;
	
	public double scan_num(){
		System.out.print("nuber > ");
		double n = Double.parseDouble(scan.next());
		return n;
	}
	
	public void num_a(double n){
		this.a = n;
	}
	public void num_h(double n){
		this.h = n;
	}
	
	public double getRx(){
			return 2 * a;
	}
	public double getDx(){
			return (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;
	}
	public double Gosa(){
		double Rx = getRx();
		double Dx = getDx();
		double Gosa =  Math.sqrt( Math.pow(Rx-Dx,2))*Rx*100;
		return Gosa;
	}
	public void seid(){
		double gosa2 = 10000000;
		double hsin = 0;
		double Dx=0;
		for(int i = 0;i < 1000; i++){
			this.h = this.h/2;
			double gosa = Gosa();
			if(gosa<gosa2){
				gosa2 = gosa;
				hsin = this.h;
				Dx = getDx();
			}
		}
		System.out.println("計算値の最適値はh = "+ hsin +"の"+Dx+"で誤差は"+gosa2+"です。");
	}
}
