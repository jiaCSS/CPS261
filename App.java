
public class App {
    public static void main(String[] args) throws Exception {

        Student[] arrApp = {

                new Student("Corine", 3.85),
                new Student("Allison", 3.35),
                new Student("Philip", 3.23),
                new Student("Emma", 2.85),
                new Student("Hannah", 2.67),
                new Student("Kristina", 3.01),
                new Student("Samita", 3.96),

        };

        Student[] anothers = {

                new Student(968, "Jia", 3.65),
                new Student(789, "Bob", 3.15),
                new Student(345, "Nellie", 3.95),
                new Student(459, "Jhon", 3.75),
                new Student(123, "Eleanor", 3.95),
                new Student(450, "Heidi", 3.82),
        };

        Student a = new Student(968, "Jia", 3.65);
        Student b = new Student(789, "Nellie", 3.95);

        // CompareTo method compare ID:
        System.out.println("\nCompare two students' ID using CompareTo Method : ");
        a.display(b);

        // SelectionSorting Method:
        SelectionSort selectionsort = new SelectionSort();

        // sorting id
        System.out.println("\nSorting by ID by selectionsort two args of Student constructor: ");
        selectionsort.sort(arrApp);

        System.out.println("\nSorting by ID by selectionsort three args of Student constructor: ");
        selectionsort.sort(anothers);

        // sorting name
        System.out.println("\nSorting by name by selectionsort two args of Student constructor: ");
        selectionsort.sort(arrApp);

        // BubbleSorting Method:
        BubbleSort bubblesort = new BubbleSort();
        bubblesort.sortingGPA(arrApp);

    }// main
}
