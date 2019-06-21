import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Fib
        System.out.println("Welcome to the Numbers Game!");

        int initial = 1;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(initial);
        arr.add(initial + 0);

        for(int i = 1; i<=10; i++)
        {
            sum = arr.get(i) + arr.get(i-1);
            arr.add(sum);
        }
        System.out.println("Fib");
        System.out.println(arr);

        //Tribo
        int initial2 = 1;
        int sum2 = 0;
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(initial2);
        arr2.add(initial2 + 0);
        arr2.add(arr2.get(0)+arr2.get(1)+ 0);

        for(int i = 2; i<=10; i++)
        {
            sum2 = arr2.get(i) + arr2.get(i-1)+arr2.get(i-2);
            arr2.add(sum2);
        }
        System.out.println("Tribo");
        System.out.println(arr2);

        //Tetra
        int initial3 = 1;
        int sum3 = 0;
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        arr3.add(initial3);
        arr3.add(initial3 + 0);
        arr3.add(arr3.get(0)+arr3.get(1)+ 0);
        arr3.add(arr3.get(0)+arr3.get(1)+ arr3.get(2));

        for(int i = 3; i<=10; i++)
        {
            sum3 = arr3.get(i) + arr3.get(i-1)+ arr3.get(i-2)+ arr3.get(i-3);
            arr3.add(sum3);
        }
        System.out.println("Tetra");
        System.out.println(arr3);

        //Lucas
        int initial4 = 2;
        int initial5 = 1;
        int sum4 = 0;
        ArrayList<Integer> arr4 = new ArrayList<Integer>();
        arr4.add(initial4);
        arr4.add(initial5);


        for(int i = 1; i<=10; i++)
        {
            sum4 = arr4.get(i) + arr4.get(i-1);
            arr4.add(sum4);
        }
        System.out.println("Lucas");
        System.out.println(arr4);
    }
}
