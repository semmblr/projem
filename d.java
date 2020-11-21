import java.util.Scanner;
class Main {
    
    public static void input() {
        // kullanıcıdan input alınması
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("depolamak istediğiniz satır sayısını girin: ");
        n = sc.nextInt();
        int[] additionarray = new int[n];
        //double array içerisinde depo işlemi yapılıyor



        //array sınırları kontrol ediliyor.
        for (int i = 0; i < n; i++) {

            int[] array = new int[i+1];
            System.out.println(i+1 + ". satırın elementlerini giriniz: ");
            for (int y = 0; y <= i; y++) {
                array[y] = sc.nextInt();
            }
         sort(array);
            additionarray[i]=array[0];

        }
        printArray(additionarray);
    }
    
    //selection sort 
        public static void sort(int arr[])
        {
            int n = arr.length;

    
            for (int i = 0; i < n-1; i++)
            {
                // min elementi buluyor
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // bulunan min elementi öncekiyle değiştiriyor
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }

        // array yazma
        public static void printArray(int arr[])
        {

            int n = arr.length;
            int sum=0;
            for (int i=0; i<n; ++i){
                System.out.print(arr[i]+" ");
                sum=sum+arr[i]; //toplamı yaptırıyor
            }
            System.out.println();
            System.out.println(sum);
        }
    
  public static void main(String args[]) { 
   input(); //input çağrılıyor.
  } 
}
