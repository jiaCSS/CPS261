// import java.lang.reflect.Array;
// import java.util.Arrays;

public class SelectionSort {

    // Selectionsort

    public void sort(Student[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndix = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j].compareTo(arr[minIndix]) < 0) {
                    minIndix = j;
                }
            }
            //swap
            if (minIndix != i) {

                Student temp = arr[i];
                arr[i] = arr[minIndix];
                arr[minIndix] = temp;
            }

        }

        //print out 
        for (Student s : arr) {

            System.out.println(s);
        }

    }// sort

}// class: selectionSort
