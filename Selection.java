import java.util.Arrays;

class Selection{
    public static void main(String[] args) 
    {
        int[] arr={5,1,3,4,2};
        ssort(arr);
    }
    public static void ssort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int max=max(arr,0,last);
            int temp=arr[last];
            arr[last]=arr[max];
            arr[max]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int max(int[] arr,int first,int last)
    {
        int max=first;
        for(int i=first;i<=last;i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;

    }
}