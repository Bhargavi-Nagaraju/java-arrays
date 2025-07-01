// program to find the duplicate elements in the array
public class Duplicate{
public static void main (String [] args){
int arr [] = {2,4,5,7,2,4}; // array with some duplicates
System.out.println("Duplicate elements :");
for(int i = 0;i< arr.length;i++){ // outer loop
    for (int j = i+1;j<arr.length;j++){ // inner loop
    if (arr[i] == arr[j]){ // check for duplicate
    System.out.println(arr[i]); // print duplicate
    break; // stop checking this element
}
}
}
}
}

// sample output
// 2
// 4