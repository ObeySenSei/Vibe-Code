// BruteForce 

import java.util.Arrays;

public class CompressionMethod {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 4, 4, 4, 4};
        int[] result = compress(arr);
        System.out.println("The resultant array is: " + Arrays.toString(result));
    }

    static int[] compress(int[] arr) {

        // Count the number of groups
        int group = 1;

        for (int j = 0; j < arr.length - 1; j++) {

            if (arr[j] != arr[j + 1]) {
                group++;                         // After the first loop, we already know there are 3 groups:1,2,4.
            }
        }

        // Every group gives us: value + count
        int[] newArr = new int[group * 2];

        int index = 0;              // Where should I put the next value/count inside newArr?
        int start = 0;              // Where does the current group begin?

        // Fill the new array
        for (int j = 0; j < arr.length - 1; j++) {    // We're walking through the array and looking for the end of each group

            if (arr[j] != arr[j + 1]) {

                int count = j - start + 1;          // Notice at what time did we bring up start.

                newArr[index] = arr[start];         // gives us [1,_,_,_,_,_]    means the number itself;
                newArr[index + 1] = count;          // gives us [1,1,_,_,_,_,]   meaning total no. of 1s

                index += 2;
                start = j + 1;
            }
        }

        // Last group
        int count = arr.length - start;             //   9 - 5 = 4

        newArr[index] = arr[start];
        newArr[index + 1] = count;

        return newArr;
    }
}

/*

index: 0
start: 0

j = 0

1  1  1  2  2  4  4  4  4
↑  ↑
j  j+1

1 != 1 → false.

Nothing happens.


j = 2

1  1  1  2  2  4  4  4  4
      ↑  ↑
      j  j+1

Now: 1 != 2          i.e          j! = j+1

TRUE! We found the end of the first group.

We found the end of the first group.

So this runs:

int count = j - start + 1;

At this moment:

j = 2
start = 0
Therefore:
count = 2 - 0 + 1
      = 3

Exactly right — there are three 1s.

Why index += 2?
index += 2;

We just used positions 0 and 1.
So the next group should go into positions 2 and 3.
newArr = {1, 3, _, _, _, _}
                ↑
              next

Why start = j + 1?

We just discovered that the first group ended at j = 2.
The next group starts at index 3.

1  1  1  2  2  4  4  4  4
         ↑
       start

So: start = j + 1;

*/