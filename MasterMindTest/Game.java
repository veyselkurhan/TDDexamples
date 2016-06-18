import java.lang.reflect.Array;
import java.util.ArrayList;
public class Game {
final int realnumber=1234;
int counter=0;
ArrayList<Integer>digits=new ArrayList<Integer>();

Predictions lastPrediction=new Predictions();
public boolean correctPrediction(int a)
{
	if(a==realnumber)return true;
return false;
}
public ArrayList<Integer> theMakeDigits(int a)
{ArrayList<Integer>digits=new ArrayList<Integer>();
int digit=a/1000;
digits.add(digit);
a=a%1000;
digit=a/100;
digits.add(digit);
a=a%100;
digit=a/10;
digits.add(digit);
a=a%10;
digits.add(a);
return digits;
}
public String wrongPrediction(int a){
	int wrongPlace=0;
	int correctPlace=0;
ArrayList<Integer>realDigits=theMakeDigits(realnumber);
ArrayList<Integer>predictionDigits=theMakeDigits(a);

for(int c=0;c<realDigits.size();c++)
{
	if(realDigits.contains(predictionDigits.get(c)))
	{
		if(predictionDigits.get(c)==realDigits.get(c))correctPlace++;
		else wrongPlace++;
	}
	}
return  correctPlace+"+"+" "+wrongPlace+"-";
}
public void predict(Predictions p)
{
	lastPrediction=p;
	counter++;
	if(p.number==realnumber){
		
		finish();
		}
	else wrongPrediction(p.number);
	
}
public int getRealNumber()
{
	return realnumber;
}
public void finish(){
	
	System.out.println("congratulations! you completed in tries"+getCounter());
}
public int getCounter(){
	return counter++;
}
}
