public class SumOfPrimeNumber {
    public static void main(String[] args) {

        int a=10,i,sum=0;
        for (i=10;i<=a;i++)
        {
            if (a%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}