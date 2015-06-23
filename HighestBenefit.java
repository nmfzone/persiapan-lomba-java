import java.util.Scanner;

public class HighestBenefit {

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		int masuk,max,min,testCase;
		int[] datas;

		masuk = io.nextInt();

		for(int i=0;i < masuk;i++)
		{
			testCase = io.nextInt();
			datas = new int[testCase];
			min = 200000;
			max = 0;
			for(int k=0;k < testCase;k++)
			{
				datas[k] = io.nextInt();
				if (datas[k] <= min)
				{
					min = datas[k];
				}
				if (datas[k] >= max)
				{
					max = datas[k];
				}
			}
			System.out.println("Case #" + (i+1) + ": " + (max-min));
		}
	}

}