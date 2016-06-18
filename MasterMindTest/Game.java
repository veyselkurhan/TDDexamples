import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
public class Game {
 int realnumber;
 
int counter=0;
ArrayList<Integer>digits=new ArrayList<Integer>();

Predictions lastPrediction=new Predictions();
public Game()
{
	realnumber=createRandomNumber();
}
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
public int createRandomNumber()
{
	ArrayList<Integer>numbers=new ArrayList<Integer>();
	ArrayList<Integer>random=new ArrayList<Integer>();
	for(int a=0;a<10;a++)
		numbers.add(a);
	Collections.shuffle(numbers);
	for(int a=0;a<4;a++)
	{
		if(a==0)
		{
			while(numbers.get(a)==0)
			{
				Collections.shuffle(numbers);
				
			}
		random.add(numbers.get(a));	
		}
		else
		{
			while(random.contains(numbers.get(a)))
			{
				Collections.shuffle(numbers);
			}
			random.add(numbers.get(a));
		}
		String randomNumber="";
		for(int c=0;c<random.size();c++)
		{
			randomNumber+=random.get(c);
		}
		realnumber=Integer.parseInt(randomNumber);
			}
return realnumber;
}
}
