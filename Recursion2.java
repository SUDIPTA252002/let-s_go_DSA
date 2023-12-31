import java.util.ArrayList;

class Recursion
{
    static ArrayList<String> arr=new ArrayList<>();
    static StringBuilder string=new StringBuilder();
    static int index=0;
    public static void main(String[] args) 
    {
        //removecharacters("baccad", 0);
        //Stirng removed=removestring("baccad")
        //skipappnotapple("","bcappcapplecd");
        //System.out.println(removed);
        // ArrayList<String> subset=PandC("","abc");
        // System.out.println(subset);
        // PandC("","abc");
        // System.out.println(arr);
        int[] arr={1,2,3};
        iterativesubset(arr);        
    }
    // public static ArrayList<String> PandC(String includedstr,String old)
    // {
    //     if(old.isEmpty())
    //    {
    //         ArrayList<String> arr=new ArrayList<>();
    //         arr.add(includedstr);     
    //         //System.out.println(arr);
    //         return arr;
    //     }
    //     ArrayList<String> left=PandC(includedstr, old.substring(1));
    //     includedstr+=old.charAt(0);
    //     ArrayList<String> right=PandC(includedstr, old.substring(1));

    //     left.addAll(right);
    //     return left;
    // }
    
    public static void PandC(String includedstr,String old)
    {
        if(old.isEmpty())
       {
            arr.add(includedstr);
            //System.out.println(arr);
            return;
        }
        PandC(includedstr, old.substring(1));
        includedstr+=old.charAt(0);
        PandC(includedstr, old.substring(1));
    }
    
    
    
    public static void skipappnotapple(String newstr,String old)
    {
        if(old.isEmpty())
        {
            System.out.println(newstr);
            return;
        }
        if(old.startsWith("app"))
        {
            if(old.startsWith("apple"))
            {
                newstr+=old.charAt(0);
                skipappnotapple(newstr,old.substring(1));
            }
            else
            {
                skipappnotapple(newstr,old.substring(3));
            }
            
        }
        else
            {
                 newstr+=old.charAt(0);
                skipappnotapple(newstr,old.substring(1));
            }

    }
    
    
    
    public static String removestring(String old)
    {
        if(old.isEmpty())
        {
            return "";
        }
            if(old.startsWith("apple"))
            {
                return removestring(old.substring(5));
            }
            else
            {
                char ch=old.charAt(0);
                return ch+removestring(old.substring(1));
            }
    
    }
    
    
    
    public static void removecharacters(String str,int charindex)
    {
        str=str.toLowerCase();
        if(charindex<str.length())
        {
            if(str.charAt(charindex)!='a'&&str.charAt(charindex)!='A')
            {
                string.insert( index,str.charAt(charindex));
                index++;
            }
            removecharacters(str, charindex+1);
        }
        else
        {
            System.out.println(string);
            return;
        }
    }

    //SUBSETS ITERATIVELY
    public static void iterativesubset(int[] num)
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for (int element : num) 
        {
            int n=list.size();
            for(int i=0;i<n;i++)
            {

                ArrayList<Integer> temp=new ArrayList<>(list.get(i));
                temp.add(element);
                list.add(temp);
            }            
        }
            System.out.println(list);
    }   
       public static void duplicateElements(int[] arr)
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        int start=0,end=0;
        for(int i=0;i<arr.length;i++)
        {
            start=0;
            if(i>0&&(arr[i]==arr[i-1]))
            {
                start=end+1;
            }
            int n=list.size();
            end=list.size()-1;
            for(int j=start;j<n;j++)
            {
                ArrayList<Integer> temp=new ArrayList<>(list.get(j));
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        System.out.println(list);
    }

}
