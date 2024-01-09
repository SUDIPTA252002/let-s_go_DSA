import java.util.ArrayList;
import java.util.Arrays;

class RecursionPermutation
{
    static ArrayList<StringBuilder> paths=new ArrayList<>();
    static ArrayList<StringBuilder> list=new ArrayList<>();
    static ArrayList<ArrayList<Integer>> listy=new ArrayList<>();
    public static void main(String[] args) 
    {
        // StringPermutation(new StringBuilder(),"abc");
        // System.out.println(list);
        // listy.add(new ArrayList<>());
        // int[] arr={0,1,2};
        // combination(new ArrayList<>(),arr, 0);
        // System.out.println(listy);
        // int num=NumberOfPaths(3,3);
        // System.out.println(num);
        boolean[][] arr={{true,true,true},{true,true,true},{true,true,true}};
        int[][] matrix={{0,0,0},{0,0,0},{0,0,0}};
        allPaths(new StringBuilder(),arr, 0, 0,matrix,0);
        //System.out.println(paths);
    }

    public static void allPaths(StringBuilder path,boolean[][] maze,int rows,int columns,int[][] matrix,int lastcell)
    {
        if(rows==maze.length-1&&columns==maze[0].length-1)
        {
            System.out.println(path);
            for (int[] arr : matrix) {
             System.out.println(Arrays.toString(arr));   
            }
            //paths.add(new StringBuilder(path));
            return;
        }
        else
        {
            if(maze[rows][columns]==false)
            {
                return;
            }
            if(rows<maze.length-1)
            {
                maze[rows][columns]=false;
                matrix[rows][columns]=lastcell;
                allPaths(new StringBuilder(path).append( 'D'),maze,rows+1, columns,matrix,lastcell+1);
                maze[rows][columns]=true;
                matrix[rows][columns]=0;
                
            }
            if(rows>0)
            {
                maze[rows][columns]=false;
                matrix[rows][columns]=lastcell;
                
                allPaths(new StringBuilder(path).append( 'U'),maze,rows-1, columns,matrix,lastcell+1);
                maze[rows][columns]=true;
                matrix[rows][columns]=0;
                
            }
            if(columns<maze[0].length-1)
            {
               maze[rows][columns]=false;
               matrix[rows][columns]=lastcell;
               allPaths(new StringBuilder(path).append( 'R'),maze,rows, columns+1,matrix,lastcell+1);
               maze[rows][columns]=true;
               matrix[rows][columns]=0;
                
            }
            if(columns>0)
            {
                maze[rows][columns]=false;
                matrix[rows][columns]=lastcell;
                
                allPaths(new StringBuilder(path).append( 'L'),maze,rows, columns-1,matrix,lastcell+1);
                maze[rows][columns]=true;
                matrix[rows][columns]=0;
                
            }
        }

    }


    public static void combination(ArrayList<Integer> newarr,int[] oldarr,int index)
    {
            if(index==oldarr.length)
            {
                listy.add(new ArrayList<>(newarr));
                return;
            }
            combination(new ArrayList<>(newarr), oldarr, index+1);
            newarr.add(oldarr[index]);
            combination(new ArrayList<>(newarr), oldarr, index+1);
    }
    public static int NumberOfPaths(int rows,int columns)
    {
        if(rows==1||columns==1)
        {
            return 1;
        }
        else
        {
            return NumberOfPaths(rows-1, columns)+NumberOfPaths(rows, columns-1);
        }

    }
//OBSTACLE,DIAGONAL.HORIZONTAL AND VERTICAL
    public static void Paths(StringBuilder path,int rows,int columns)
    {
        if(rows==1&&columns==1)
        {
            paths.add(new StringBuilder(path));
            return;
        }
        else
        {
            // if(rows==2&&columns==2)
            // {
            //     return;
            // }
            // if(rows>1&&columns>1)
            // {
            //     Paths(new StringBuilder(path).append( 'D'),rows-1, columns-1);
            // }

            if(rows>1)
            {
                Paths(new StringBuilder(path).append( 'V'),rows-1, columns);
            }
            if(columns>1)
            {
                Paths(new StringBuilder(path).append( 'H'),rows, columns-1);
            }
            if(columns<3)
            {
                Paths(new StringBuilder(path).append( 'L'),rows, columns+1);
            }
        }

    }
    public static void StringPermutation(StringBuilder newComb,String old)
    {
        if(old.isEmpty())
        {
            list.add(new StringBuilder(newComb));
            //System.out.println(list);
            return;
        }
        else
        {
            int length=newComb.length();
            for(int i=0;i<=length;i++)
            {
                StringBuilder temp=new StringBuilder(newComb);
                temp.insert(i,old.charAt(0));
                StringPermutation(temp, old.substring(1));
            }
        }
    }

}