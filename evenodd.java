import java.util.*;
public class evenodd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int even[]=new int[n];
        int odd[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
           
            if(i==0||i%2==0)
            {
                even[i]=arr[i];
            }
            else{
                odd[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
        }
    }
    

