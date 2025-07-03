// Java program to reverse a string using StringBuffer
public class ReverseWithBuffer {
    public static void main(String[] args) {
        // Step 1: Define the original string
        String input = "Bhargavi";

        // Step 2: Create a StringBuffer object with the original string
        // StringBuffer is used for mutable string operations
        StringBuffer sb = new StringBuffer(input);

        // Step 3: Call the built-in reverse() method to reverse the string
        sb.reverse();  // This modifies the content of sb directly

        // Step 4: Print the reversed string
        System.out.println("Reversed string: " + sb);
    }
}

//sample output
//Reversed string: ivagrahB

