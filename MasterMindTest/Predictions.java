import java.util.ArrayList;


public class Predictions {
	int counter=0;
	int number=0;

	ArrayList<Integer>digits=new ArrayList<Integer>();
public void FourDigitControl(int a) throws NonFourDigitException
	{
		if(a>9999||a<1000)throw new NonFourDigitException("this is not four digit number");

	}
public boolean isTheValueInteger(String value)
{boolean nonIntegerValue=true;
try
{
	Integer.parseInt(value);
nonIntegerValue=false;
}
catch(Exception e)
{
	}
return nonIntegerValue;
}
public boolean isTheFirstDigitZero(int number)
{
	String value=String.valueOf(number);
	if(value.charAt(0)=='0')return true;
	return false;
}
public boolean digitsDifferent(int a)
{
	
	int digit=a/1000;
	digits.add(digit);
	a=a%1000;
	digit=a/100;
if(digits.contains(digit)==true)
	return false;
digits.add(digit);
a=a%100;
digit=a/10;
if(digits.contains(digit)==true)
	return false;
digits.add(digit);
a=a%10;
if(digits.contains(a)==true)
	return false;
digits.add(digit);
	return true;
	
}
public void setPrediction(int a){
if(isTheValueInteger(String.valueOf(a)))
{
	boolean b=false;
	try
	{
 FourDigitControl(a);
 b=true;
	}
	catch(NonFourDigitException e)
	{
		// exception;
	}
	if(b==true)
	{
		if(!isTheFirstDigitZero(a))
		{digits.clear();
			if(digitsDifferent(a))
			{
				number=a;
			}
		}
	}
}
}
}

