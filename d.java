import java.util.Scanner;

public class d
{
    public static int input(){
        // kullanıcıdan input alınması
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("depolamak istediğiniz satır sayısını girin: ");
        n=sc.nextInt();
        int i=0;
        int y=0;
        //double array içerisinde depo işlemi yapılıyor
        int[][] array = new int[n+1][n];
        System.out.println("depolamak istediğiniz elementleri girin: ");
        //dummy sayı oluşturuldu.
        int m=0;
        //array sınırları kontrol ediliyor.
        for(i=0; i<n; i++)
        {
            for(y =0; y<=m; y++){
                array[y][i]=sc.nextInt();
               if(y==(n-1)){
                    System.out.println("duruyor mu"); //check point
                    break;
                }
            }
            m++;
            if(i==(n-1)){
                System.out.println("duruyor mu 2"); //check point
                break;
            }
        }
      /**  for(int k=0; k<=array.length; k++){
            for (int j=0; j<=array.length; j++ ){
                System.out.println("array elemanları");
                System.out.println(array[k][j]);
            } }**/


        minSumPath(array);
        System.out.print(minSumPath(array)); // sum path fonksiyonuna bağlantı yapılıyor
        System.out.println(".......................");
        return 0; //0 donduruyoruz.
}

//sumpath hesaplama
    static int minSumPath(int[][] arr)
    {
        int []memo = new int[arr.length];
        int n = arr.length - 1;
        for (int i = 0; i < arr[n].length; i++)
            memo[i] = arr[n][i];

        for (int i = arr.length - 2; i >= 0; i--)
            for (int j = 0; j < arr[i].length; j++)
                memo[j] = arr[i][j] + (int)Math.min(memo[j], memo[j + 1]);

            return memo[0]; }

        public static void main(String[] args) {

            System.out.print(input()); //inputun işlendiği yer.

    }
}
