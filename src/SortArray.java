import java.util.Arrays;

    public class SortArray {

        public static void main(String[] args) {

            int[] arr=arrayElements();
            int length=arr.length;
            int [] arr2=new int[length+1];
            arr2=arraySort(arr);
            System.out.print("Array elements are:\n");
            for (int i=0;i<length;i++)
            {
                System.out.println(arr2[i]);
            }
        }
        public static int[] arrayElements()
        {
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        }
        public static int[] arraySort(int[] arr)
        {
            int i,j;
            int length=arr.length;
            System.out.println("Length is : "+length);
            Arrays.sort(arr);
            int [] arr2=new int[length+1];
            for (i=0,j=0;j<=length/2;i=i+2,j++)
            {
                arr2[i]=arr[length-1-j];
            }
            System.out.println("--------------------------");
            for (i=1,j=0;j<(length/2);i=i+2,j++)
            {
                arr2[i]=arr[j];
            }
            return arr2;
        }
    }


