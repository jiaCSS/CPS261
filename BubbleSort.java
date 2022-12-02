public class BubbleSort {

    // Sorting by GPA
    public void sortingGPA(Student[] arr) {

        boolean swaping = true;
        while (swaping) {

            swaping = false;
            for (int i = 0; i < arr.length - 1; i++) {

                if ((arr[i].getGpa()) > (arr[i + 1].getGpa())) {

                    swaping = true;
                    Student temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }
        System.out.println("\nSortingGPA by BubbleSorting Method: ");
        for (Student s : arr) {
            System.out.println(s);
        }

    }

    // sorting by id;
    public void sortingID(Student[] arr) {

        boolean swappedSometing = true;

        while (swappedSometing) {

            swappedSometing = false;

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i].getId() < arr[i + 1].getId()) {

                    swappedSometing = true;
                    Student temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        } // while
    }

}
