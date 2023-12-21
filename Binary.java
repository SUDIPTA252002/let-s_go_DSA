public class Binary
{
    public static void main(String[] args)
    {
        int[] arr={17,15,13,11,9,7,5,3,1};
        int a;
        if(arr[0]<arr[arr.length-1])
        {
            a=ascendingbsearch(arr,13);
        }
        else
        {
            a=descendingbsearch(arr, 13);
        }
        if(a==-1)
        {
            System.out.println("ELEMENT NOT FOUND");
        }
        else
        {
            System.out.println("ELEMENT FOUND AT:"+a);
        }
    }
    public static int ascendingbsearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        System.out.println(end);
        int mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        mid=-1;
        return mid;
    }
    public static int descendingbsearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        System.out.println(end);
        int mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                start=mid+1;                
            }
            else
            {
                end=mid-1;
            }
        }
        mid=-1;
        return mid;
    }
    
}