class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Custom input array
        int arr[] = { 30,60,40,50,10};
        int i ,j,k,l;


        // Outer loop
        for ( i = 0; i < arr.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (j = i + 1; j < arr.length; j++) {

                // Checking elements
                int temp = 0;
                if (arr[j] < arr[i]) {

                    // Swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }


            // Printing sorted array elements

            System.out.print(arr[i] + " ");
        }
            System.out.println(" ");

            for (k = 0; k < arr.length; k++) {

                // Inner nested loop pointing 1 index ahead
                for (l = k + 1; l < arr.length; l++) {

                    // Checking elements
                    int tempo = 0;
                    if (arr[l] > arr[k]) {

                        // Swapping
                        tempo = arr[k];
                        arr[k] = arr[l];
                        arr[l] = tempo;
                    }
                }

                // Printing sorted array elements
                System.out.print(arr[k] + " ");
        }

       }
}
