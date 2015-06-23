import java.util.Scanner;

public class CountingPairs {

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		int masuk,testCase,combination,diff=0;
		int[] datas;

		masuk = io.nextInt();

		for(int i=0;i < masuk;i++)
		{
			testCase = io.nextInt();
			diff = io.nextInt();
			datas = new int[testCase];
			combination = 0;
			for(int k=0;k < testCase;k++)
			{
				datas[k] = io.nextInt();
				for (int s=0;s < k;s++)
				{
					if ((datas[k]-datas[s]) <= diff && (datas[k]-datas[s])*-1 <= diff)
					{
						combination++;
					}
				}
			}
			System.out.println("Case #" + (i+1) + ": " + combination);
		}
	}

}