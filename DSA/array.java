package DSA;

public class array {
  public static void main(String[] args) {
    
    // int a[] = new int[5];

    /*
     * traversel
     * searching
     * replace spcific no. with given no.
     * sum of array
     * reverse the array
     * ...
     * Problems...
     */

            //  0  1  2  3  4
    int b[] = { 1, 2, 3, 4, 5 };

    for (int i = 0; i < b.length; i++) {
        System.out.println(b[i]);   // i -> 0 , 1 , 2 , 3 , 4
    }
    int target = 3;
    for (int i = 0; i < b.length; i++) {
      if(b[i] == target) 
      System.out.println(b[i]);  
    }
  }
}