/*
	@problem: MakSumSubset (Gemastik 2009)
	@author: Nabil Muhammad Firdaus
	@files: https://github.com/nmfzone/persiapan-lomba-java/blob/master/MakSumSubset.java
	@created: June 23, 2015
*/

import java.util.Scanner;

public class MakSumSubset {

	public int[] sorting(int[] angka, int length)
	{
		int temp;
		for (int i = 0;i < length;i++)
		{
			for (int k = i + 1;k < length;k++)
			{
				if (angka[i] < angka[k])
				{
					temp = angka[i];
					angka[i] = angka[k];
					angka[k] = temp;
				}
			}
		}

		return angka;
	}

	public int maxSumSubset(int angka[], int nSubset)
	{
		int hasil = 0;
		for (int i = 0;i < nSubset;i++)
		{
			hasil = hasil + angka[i];
		}

		return hasil;
	}

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		MakSumSubset mss = new MakSumSubset();

		int testCase, k, nSubset;
		int[] angka = new int[1000];

		testCase = io.nextInt();

		for (int i = 0;i < testCase;i++)
		{
			k = 0;
			while (true)
			{
				angka[k] = io.nextInt();

				if (angka[k] == 0)
				{
					break;
				}

				k++;
			}

			nSubset = io.nextInt();

			System.out.println(mss.maxSumSubset(mss.sorting(angka, k), nSubset));

		}
	}

}