package Practice;
import java.util.Scanner;
	public class ForTask2
	{
public static void main(String[] args)
	{
for (int i = 1; i <= 5; i++)
	{
	int num;

	if(i%2 == 0)
	{
	num = 0;

	for (int j = 1; j <= 5; j++)
	{
	System.out.print(num);

	num = (num == 0)? 1 : 0;
	}}
	else
	{
	num = 1;

	for (int j = 1; j <= 5; j++)
	{
	System.out.print(num);

	num = (num == 0)? 1 : 0;
	}
	}

	System.out.println("\n");
	}

	
	}
	}

