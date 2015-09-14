import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class Retirement {

		public static void main(String[] args) {
			Scanner Input = new Scanner(System.in);
			System.out.println("Enter Number of years to work:");
			double YTW = Input.nextDouble();
			System.out.println("Enter Annual Return1:");
			double AR1 = Input.nextDouble();
			System.out.println("Enter Years Retired:");
			double YR = Input.nextDouble();
			System.out.println("Enter Annual Return");
			double AR = Input.nextDouble();
			System.out.println("Enter Required Income");
			double RI = Input.nextDouble();
			System.out.println("Enter Monthly SSI");
			double MSSI = Input.nextDouble();
			
			double r;
			double n;
			double y;
			double p;
			double f;
			boolean t;
			
			double PV;
			r = (AR1/12);
			n = YR*12;
			y = RI-MSSI;
			f = 0;
			t = false;
			
			PV = FinanceLib.pv(r, n, y, f, t);
			
			System.out.println("What you need saved: " + (-1)*PV);
			
			double PMT;
			
			r = (AR/12);
			n = YTW*12;
			p = 0;
			f = PV;
			t = false;
			
			PMT = FinanceLib.pmt(r,n,p,f,t);
			System.out.println("Save each month: " + PMT);
			
		}
}
