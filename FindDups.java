package week2day2;

import java.util.Arrays;


public class FindDups {

	

	public static void main(String[] args) {
		
	int[] numbers= {1,2,3,4,7,4,6,6};
	Arrays.sort(numbers);
	for (int i = 0;i<numbers.length-1;i++)
	{
		if(numbers[i]==numbers[i+1])
		{
			System.out.println(numbers[i]);
		}
	}
	

	}

}
