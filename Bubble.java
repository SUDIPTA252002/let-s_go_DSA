import java.util.Arrays;

class Bubble
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5};
        bsort(arr);
        
    }
    public static void bsort(int[] arr)
    {
        boolean  swapped=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
        }
        if(swapped==true)
        {
            System.out.println(Arrays.toString(arr));
        }
        else
        {
            System.out.println("ARRAY IS ALREAFY SORTED");
        }

    }
}