
public class qs_5 {

	public static void main(String[] args) {
             double tax,sal=150001;
             if(sal>=0 && sal<15000)
             {
            	 tax=0+(sal*0.15);
            	 System.out.println("Tax due "+tax);
             }
             if(sal>=15000 && sal<30000)
             {
            	  tax=2250+((sal-15000)*0.18);
            	  System.out.println("Tax due "+tax);
             }
             if(sal>=30000 && sal<50000)
             {
            	 tax=5400+((sal-30000)*0.22);
            	 System.out.println("Tax due "+tax);
             }
             if(sal>=50000 && sal<80000)
             {
            	 tax=11000+((sal-50000)*0.27);
            	 System.out.println("Tax due "+tax);           	 
             }
             if(sal>=80000 && sal<=150000)
             {
            	 tax=21600+((sal-80000)*0.33);
            	 System.out.println("Tax due "+tax);;
             }
             if(sal>150000)
            	 System.out.println("-1.0");
	}

}
