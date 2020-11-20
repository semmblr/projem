import java.util.Scanner;

public class d
{
    public static int input(){
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int i=0;
        int y=0;
        int[][] array = new int[n][n];
        System.out.println("Enter the elements of the array: ");
        int m=0;
        for(i=0; i<n; i++)
        {
            for(y =0; y<=m; y++){
                array[y][i]=sc.nextInt();
               /** if(y==(n-1)){
                    System.out.println("durcak");
                    break;
                }
                **/
            }
            m++;
           /** if(i==(n-1)){
                System.out.println("durcak");
                break;
            } **/
        }
        minSumPath(array);
        System.out.print(minSumPath(array));
        return 0;

}
    /**static int A[][] = {{2},
            {3, 9},
            {1, 6, 7}}; **/
    static int minSumPath(int[][] arr)
    {
        int []memo = new int[arr.length];
        int n = arr.length - 1;
        for (int i = 0;
             i < arr[n].length; i++)
            memo[i] = arr[n][i];

        for (int i = arr.length - 2;
             i >= 0; i--)
            for (int j = 0;
                 j < arr[i].length; j++)
                memo[j] = arr[i][j] + (int)Math.min(memo[j], memo[j + 1]);

        return memo[0]; }
        public static void main(String[] args) {

            System.out.print(input());
            /** int n;
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter the number of elements you want to store: ");
             n=sc.nextInt();
             int[] array = new int[10];
             System.out.println("Enter the elements of the array: ");
             for(int i=0; i<n; i++)
             {
                 array[i]=sc.nextInt();
             }
             System.out.println("Array elements are: ");
             for (int i=0; i<n; i++)
             {
                 System.out.println(array[i]);
             } **/
    }

}
