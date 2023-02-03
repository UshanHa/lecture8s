//Sadman Sakib Hassan


class Lecture08 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 08");

        // SELF-CHECK PROBLEMS:
        // Section 13.1: Searching and Sorting in the Java Class Libraries
        // 3. Should you use a sequential or binary search on an array of Point objects,
        // and why?


        //The best method for locating a value in an unsorted array is sequential search. 1 However, we can do considerably better if the array is sorted in increasing order by value. We employ a method known as binary search.

        
        // 4. Under what circumstances can the Arrays.binarySearch and
        // Collections.binarySearch methods be used successfully?

//There is no guarantee that the element with the provided value will be identified if the array has many elements with that value. In a nutshell, the Arrays. binarySearch() method has the ability to search for a specific element within a sorted array and return its index if found. Keep in mind that the procedure only returns the index of the item that was discovered, not the actual item.
//A Java. util. Collections. binarySearch() method. Object's position in a sorted list is returned via a method of the collections class. 


        // 5. In what order does the Collections.sort method arrange a list of strings?
        // How could you arrange them into a different order?


//Collection.sort by default sorts the data in ascending order. We could employ the following techniques to organize the items in reverse: reverseOrder(): returns a Comparator that forces the collection's elements to be arranged against their natural order.


        // Section 13.2: Program Complexity
        // 9. Approximate the runtime of the following code fragment listed in Canvas

        ////The above code's run time is O(n).

Explanation :

It is because j = j* 2 goes till n .

from j = 1. so , j = 2 n .

Linear run time is required to run the above code.


        // 10. Approximate the runtime of the following code fragment listed in Canvas

//b. O(n)

        // 11. Approximate the runtime of the following code fragment listed in Canvas

// O(n^3)

        // Section 13.3: Implementing Searching and Sorting Algorithms
        // 16. What is the runtime complexity class of a sequential search on an
        // unsorted array?
        // What is the runtime complexity class of the modified sequential search on a
        // sorted array?

        // 17. Why does the binary search algorithm require the input to be sorted?

        // 18. How many elements (at most) does a binary search examine if the array
        // contains 60 elements?

        // 19. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input arrays?
        // What value will the binary search algorithm return?


        //Option A is the answer

        //As we always have a binary search tree sorted, the supplied array's index will be giving the target, or the middle element 8, on the exact spot, as well as left to it will be less than it and right will be greater than the target.



        // A. int[] numbers = {1, 3, 6, 7, 8, 10, 15, 20, 30};
        // B. int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        // C. int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // D. int[] numbers = {8, 9, 12, 14, 15, 17, 19, 25, 31};

        // 20. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input array?
        // Notice that the input array isn’t in sorted order. What can you say about the
        // binary search algorithm’s result?







        // int[] numbers = {6, 5, 8, 19, 7, 35, 22, 11, 9};

        // 23. What modifications would you have to make to the selectionSort method to
        // cause it to sort an array of double values rather than one of integer values?




        // 24. Consider the following array:

        // int[] numbers = {29, 17, 3, 94, 46, 8, –4, 12};
        // After a single pass of the selection sort algorithm (a single swap), what
        // would be the state of the array?

        // A. {–4, 29, 17, 3, 94, 46, 8, 12}
        // B. {29, 17, 3, 94, 46, 8, 12}
        // C. {–4, 29, 17, 3, 94, 46, 8, –4, 12}
        // D. {–4, 17, 3, 94, 46, 8, 29, 12}
        // E. {3, 17, 29, 94, –4, 8, 46, 12}


//Answer is Option D

Unsorted array
29 17 3 94 46 8 -4 12
The two elements to be swapped are : -4 29
Array contents after the step 1
-4 17 3 94 46 8 29 12
The two elements to be swapped are : 3 17
Array contents after the step 2
-4 3 17 94 46 8 29 12
The two elements to be swapped are : 8 17
Array contents after the step 3
-4 3 8 94 46 17 29 12
The two elements to be swapped are : 12 94
Array contents after the step 4
-4 3 8 12 46 17 29 94
The two elements to be swapped are : 17 46
Array contents after the step 5
-4 3 8 12 17 46 29 94
The two elements to be swapped are : 29 46
Array contents after the step 6
-4 3 8 12 17 29 46 94
The two elements to be swapped are : 46 46
Array contents after the step 7
-4 3 8 12 17 29 46 94
Sorted array
-4 3 8 12 17 29 46 94




        // 25. Trace the execution of the selection sort algorithm as shown in this
        // section when run on the following input arrays.
        // Show each element that will be selected by the algorithm and where it will be
        // moved, until the array is fully sorted.

//Answer is Option C

Unsorted array
33 14 3 95 47 9 -42 13
The two elements to be swapped are : -42 33
Array contents after step 1
-42 14 3 95 47 9 33 13
The two elements to be swapped are: 3 14
Array contents after step 2
-42 3 14 95 47 9 33 13
The two elements to be swapped are : 9 14
Array contents after step 3
-42 3 9 95 47 14 33 13
The two elements to be swapped are : 13 95
Array contents after step 4
-42 3 9 13 47 14 33 95
The two elements to be swapped are : 14 47
Array contents after step 5
-42 3 9 13 14 47 33 95
The two elements to be swapped are : 33 47
Array contents after step 6
-42 3 9 13 14 33 47 95
The two elements to be swapped are : 47 47
Array contents after step 7
-42 3 9 13 14 33 47 95
Sorted array
-42 3 9 13 14 33 47 95



        // A. {29, 17, 3, 94, 46, 8, –4, 12}
        // B. {33, 14, 3, 95, 47, 9, –42, 13}
        // C. {7, 1, 6, 12, –3, 8, 4, 21, 2, 30, –1, 9}
        // D. {6, 7, 4, 8, 11, 1, 10, 3, 5, 9}

        // Exercises:
        // 20. Write a recursive method called waysToClimb that takes a positive integer
        // value representing a number of stairs and prints each unique way to climb a
        // staircase of that height, taking strides of one or two stairs at a time.

        // EXERCISES:

        // Put your answer for #20 here:
        // (You may need to define other class(es) and method(s) elsewhere, but
        // make sure to check that your solution works by calling it from here)

        // Put your answer for #22 here:

        // Put your answer for #23 here:

    }
}
