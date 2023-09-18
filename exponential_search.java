import java.util.Arrays;
import java.util.Scanner;
class exponential_search{
    static int exponentialSearch(int arr[],int n, int x){
        if(arr[0]==x)
        return 0;
        int i=1;
        while(i<n&&arr[i]<=x)
        i=i*2;
        return Arrays.binarySearch(arr,i/2,Math.min(i,n-1),x);
    
        
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size;
        int arr[] = new int[50];
        System.out.println("enter the size of array: ");
        size= sc.nextInt();
        System.out.println("enter the elements in the array: ");
        int x;
        for(int a=0;a<size;a++){
            arr[a]=sc.nextInt();
        }
        System.out.println("enter the element to be searched: ");
        x = sc.nextInt();

        int result=exponentialSearch(arr,arr.length,x);

        System.out.println((result<0)?"element is not present in arry":"element is present at index "+result);
    }
}