package week1.day1;

public class mobile {
	 
		public String mobileModel = "apple";
		public int mobileWeight = 150;
		public boolean fullCharge = false;
		public double mobileCost = 50000.300;{
			
			System.out.println("mobileModel");
			System.out.println("mobileWeight");
			System.out.println("fullCharge");
			System.out.println("mobileCost");
		}
		
	
	public void makeCall()
	{
		System.out.println("makeCall");
	}
    public void smsMsg()
    {
    	System.out.println("smsMsg");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          mobile call= new mobile();
          call.makeCall();
          call.smsMsg();
  			System.out.println(call.mobileModel);
  			System.out.println(call.mobileWeight);
  			System.out.println(call.fullCharge);
  			System.out.println(call.mobileCost);
	}

}
