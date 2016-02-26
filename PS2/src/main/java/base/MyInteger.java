package base;

public class MyInteger {

	private int iValue=0;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	


	public boolean isEven()
	{
		return (getiValue() % 2 == 0);
		
	}
	
	public static boolean isEven(int iValue)
	{

		
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
		
	}
	
	public static boolean isEven(MyInteger myInt)
	{
		return myInt.isEven();
	}
	
	public boolean isOdd()
	{
		//return (getiValue() % 2 ==1);
		return !isEven();
	}
	
	public static boolean isOdd(int iValue)
	{
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}
	
	public  static boolean isOdd(MyInteger myInt)
	{
		return myInt.isOdd();
	}
	
	public boolean isPrime()
	{
        int factor = 0;
        for (factor = 2; factor <= iValue / 2; factor++) {
            if (iValue % factor != 0) {
                return true;
            }
        }
        return false;
    }

	
	public static boolean isPrime(int iValue)
	{
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}
	
	public static boolean isPrime(MyInteger myInt)
	{
		return myInt.isPrime();
	}
	
	public boolean equals(int iValue)
	{
		return (getiValue()== iValue);
	}
	
	public boolean equals(MyInteger myInt)
	{
		return (getiValue()==myInt.getiValue());
	}
	

	
	
		

}
