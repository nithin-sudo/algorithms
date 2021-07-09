package com.bridgelabz.permutation;

public class Permutation {
    public void calculate(String string, int left, int right)
    {
        if(left == right)
        {

            System.out.print(string + "\t");

        }
        else
        {
            for (int i=left; i<=right; i++)
            {
                String swapped = swap(string,left,i);
                calculate(swapped,left+1,right);
            }
        }
    }
    public String swap(String str, int i, int j)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    public static void stringPermutation(String str)
    {
        int n = str.length();
        int f = factorial(n);
        for(int i=0; i<f;i++)
        {
            StringBuilder stringbuilder = new StringBuilder(str);
            int temp = i;
            for(int div = n; div>=1; div--)
            {
                int quotient = temp / div;
                int remainder = temp % div;

                System.out.print(stringbuilder.charAt(remainder));
                stringbuilder.deleteCharAt(remainder);
                temp = quotient;
            }
            System.out.print("\t");
        }
    }
    public static int factorial(int n)
    {
        int val =1;
        for(int i = 2; i<=n; i++)
        {
            val*=i;
        }
        return val;
    }
    public static void main(String[] args) {
        String s = "ABC";
        int n = s.length();
        Permutation permutations = new Permutation();
        System.out.print("the all possible combinations  for recursion are :\t");
        permutations.calculate(s,0,n-1);
        System.out.print("\nthe all possible combinations  for iterative are :\t");
        stringPermutation(s);
    }
}
