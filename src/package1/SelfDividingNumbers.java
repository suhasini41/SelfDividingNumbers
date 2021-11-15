package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SelfDividingNumbers 
{
	private List<Integer> listOfSelfDividingNumbers(int start, int end) {
		List<Integer> list = new ArrayList<>();
		for(int i=start;i<=end;i++)
		{
			if(selfDividingNum(i)==true)
			{
				list.add(i);
			}
		}
		return list;
	}

	private boolean selfDividingNum(int n) {
		int n1 = n;
		int r = 0;
		boolean flag = false;
		while(n1>0)
		{
			r = n1%10;
			n1 = n1/10;
			if(r==0)
			{
				flag=false;
				break;
			}
			else if(n%r==0)
			{
				flag=true;
			}
			else
			{
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	@Test
	public void testCase1()
	{
		Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22};
		List<Integer> expectedList = new ArrayList<>();
		expectedList = Arrays.asList(a);
		Assert.assertEquals(listOfSelfDividingNumbers(1, 22),expectedList);
	}
	
	@Test
	public void testCase2()
	{
		Integer[] a = {11, 12, 15, 22, 24};
		List<Integer> expectedList = new ArrayList<>();
		expectedList = Arrays.asList(a);
		Assert.assertEquals(listOfSelfDividingNumbers(10, 30),expectedList);
	}
	
	@Test
	public void testCase3()
	{
		Integer[] a = {15, 22, 24, 33, 36, 44};
		List<Integer> expectedList = new ArrayList<>();
		expectedList = Arrays.asList(a);
		Assert.assertEquals(listOfSelfDividingNumbers(15, 45),expectedList);
	}

}
