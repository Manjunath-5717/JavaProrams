public class Swaparray {
    
    static int reverse(int[] a){
        
        int i=0;
        int j=a.length-1;
        int temp=a[i];
        while(i<j){}
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
    }
     return reverse;
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,};
        int resu=reverse(a);
       
    }
}public class Swaparray {

    static void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        reverse(a); // call method

        // print reversed array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
