import java.util.Scanner;

public class BeautifulGift {

	public int toTop(int n, int k)
	{
		int sum=0, i = n;
		boolean ketemu = false;

		if (n < k)
		{
			while (i != k)
			{
				sum += i + k;
				if (i % 2 != 0) i--;
				if (k % 2 != 0) k--;
				k /= 2;
			}
		}
		else if (n > k)
		{
			while (i != k)
			{
				sum += i + k;
				if (i % 2 != 0) i--;
				if (k % 2 != 0) k--;
				k /= 2;
				i /= 2;
			}
		}
		

		if (i == k)
		{
			i /= 2;
			sum += i;
			ketemu = true;
			break;
		}

		return sum;
	}

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		BeautifulGift bf = new BeautifulGift();
		int input, inputA, inputB, sum=0;

		input = io.nextInt();

		for (int i=0;i < input;i++)
		{
			inputA = io.nextInt();
			inputB = io.nextInt();

			if (inputA < inputB)
			{
				sum = bf.toTop(inputB, inputA);
			}

			System.out.println("Case #" + (i+1) + ": " + sum);
		}
	}

}