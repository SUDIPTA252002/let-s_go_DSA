

public class Lsearch 
{
    public static void main(String[] args) 
    {
           //int[] arr={15,6,3,4,1,9,5,3};
           //int[] arr2={12,345,2,60,7896};
           int[][] wealth={{5,4,3},{4,32,3},{28,2,1}};
            wealthy(wealth);           
           //evendigits(arr2);
           //min(arr);
          // linearnum(arr,10);
           //linearstring("MODNA RULES",'A');
    }

    static void linearnum(int[] arr,int target)
    {
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("ELEMENT FOUND AT POS:"+i);
                return;
            }
        }
        System.out.println("NOT PRESENT");
        
    }  
    public static void linearstring(String name,char target)
    {
        String Name=name.toUpperCase();
        int len=Name.length();
        for(int i=0;i< len;i++)
        {
            char ch=name.charAt(i);
            if(target==ch)
            {
                System.out.println("ELEMENT FOUND AT POS:"+i);
                return;
            }
             System.out.println("NOT PRESENT");
        }
    }
    public static void min(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }  
    public static void evendigits(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            String num=String.valueOf(arr[i]);
            int len=num.length();
            if(len%2==0)
            {
                count++;
            }
        }
        System.out.println("Numbr of even digits is:"+count);
    }
    public static void wealthy(int[][] arr)
    {

        int[] max_wealth=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];                
            }
            max_wealth[i]=sum;
        }
        int max=max_wealth[0];
        for(int i=0;i<max_wealth.length;i++)
        {
            if(max<max_wealth[i])
            {
                max=max_wealth[i];
            }
        }
        System.out.println("MAXIMUM WEALTH IS:"+max);
    }


}