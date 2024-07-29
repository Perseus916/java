import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");
        System.out.println("Enter the size of array : ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj1.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==9)
            {
                count++;
            }
        }
        System.out.println("9 appears "+count+ " times");
    }
}