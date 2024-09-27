public class array {
    public static void main(String[] args) {
        // syntax: type[] varName;

        // int[] arr = {1,2,3, 4, 5}; 
        // /* the created array is stored in 'stack' memory && arr -> (address of the 0th block, present in stack) */

        // int[] arr2 = new int[10]; 
        // /* 10 sized array created is stored in 'heap' && arr -> (add. of 0th block, present in stack) */

        // /* NOTE: 
        
        // - array is an 'object' in java

        // - default value of an array is '0' 
        
        // - 'length' is a property of array && not a method.
        // */



        // // for(int i = 0; i < arr2.length; i++) {
        // //     System.out.println(arr2[i]);
        // // }

        // System.out.println(arr); // hash Code (i.e unique identifier of an object)


        // // printing using iterators.

        // for(int i: arr) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        // for(int i = arr.length-1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");
        // }


        // 2D Array: i.e array of arrays
        int[][] mat = new int[3][3];

        

        // Jagged Array: array of different length arrays
            // how to create:
        int[][] jagged = new int[3][]; // i.e not specified size of each array: which we can later specify.

        jagged[0] = new int[1];
        jagged[1] = new int[2];
        jagged[2] = new int[3]; 

        for(int i = 0; i < jagged.length; i++) {
            for(int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
