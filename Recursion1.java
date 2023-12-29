import java.util.*;
class Recursion1
{
    static int count=0;
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={8,3,5,7};
        //int index=binary(arr,0,arr.length-1,5);
        sortedarrays(arr, 0, 1, arr.length);
        //int index=sum(5);
        //System.out.println(index);
        
    }
    


    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n*sum(n-1);
        }
    }

    public static void sortedarrays(int[] arr,int present,int next,int len)
    {
        if(next<len)
        {
            if(arr[present]<arr[next])
            {
                sortedarrays(arr, next, next+1, len);
            }
            else
            {
                System.out.print("ARRAY IS NOT SORTED");
            }
        }
        else{
            System.out.println("ARRAY IS SORTED");
            return;
        }
    }
//RECURSIVE LINEAR SEARCH
    public static void linearsearch(int[] arr,int target,int index)
    {
        
        if(index<arr.length)
        {
            if(arr[index]==target)
            {
                list.add(index);
            }
                linearsearch(arr,target,index+1);
        }
        else
        {
                if(list.size()==0)
                {
                    System.out.println("ITEM not found");
                    return;
                }
                else
                {
                    System.out.println(list);
                }
        }
    }
    //ROTATED BINARY SEARCH
    public static void binarysearch(int[] arr,int key,int start,int end)
    {
        if(start>end)
        {
            System.out.println("ITEM NOT FOUND");
            return;
        }
        int mid=(start+end)/2;
        if(key==arr[mid])
        {
            System.out.println(mid);
            return;
        }
        if(arr[start]<=arr[mid])
        {
            if(key>arr[start]&&key<=arr[mid])
            {
                binarysearch(arr,key,start,mid-1);
            }
            else
            {
             binarysearch(arr,key,mid+1,end);   
            }
        }
        else{
          if(key>=arr[mid]&&key<=arr[end])
          {
              binarysearch(arr,key,mid+1,end);
          }
          else
          {
              binarysearch(arr,key,start,mid-1);
          }
        }
        
        
    }


//LEETCODE PROBLEM STEPS TO BECMING ZEROS
    public static void steptozeros(int num)
    {
        if(num>0)
        {
            if(num%2==0)
            {
                count++;
                steptozeros(num/2);
            }
            else{
                count++;
                steptozeros((num-1));
            }
        }
        else{
            System.out.println(count);
            return;
        }
        
    }
  
//BINARY SEARCH USING RECURSION
    public static int binary(int[] arr,int start,int end,int target)
    {
        int mid=(int)((start+end)/2);
        if(start<=end){
            if(target==arr[mid])
            {
                //System.out.println(mid);
                return mid;
            }
            else if(target>arr[mid])
            {
            start=mid+1;
            return binary(arr,start,end,target);
        }
        else{
            end=mid-1;
            return binary(arr,start,end,target);
        }
    }
    else{
        //System.out.println("NOT FOUND");
        return -1;
    }

    }


    // public static void fibo(int n1,int n2,int n)
    // {
    //     if(n>0)
    //     {
    //         System.out.println(n1);
    //         fibo(n2,n1+n2,n-1);
    //     }
    //     else{
    //         return;
    //     }        
    // }
    
}