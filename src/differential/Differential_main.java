package differential;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Differential_lib dlib = new Differential_lib();
		System.out.println("a :");
		double n = dlib.scan_num();
		dlib.num_a(n);
		System.out.println("h :");
		n = dlib.scan_num();
		//n=1;
		dlib.num_h(n);
		dlib.seid();
	}

}

// a = 1 ‚Ì‚Ìh‚ÌÅ“K’l‚Í7.450580596923828E-9
