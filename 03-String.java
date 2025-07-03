//Reverse a string using charAt() and loop
public class Reverse{
public static void main (String[]args){
// Step 1: Original string
String input = "Bhargavi";
// Step 2: Create an empty string to store the reversed result
String reversed = "";
// Step 3: Loop from the last character to the first
for (int i = input.length()-1;i>=0;i--){
// Step 4: Take one character from the end and add it to 'reversed'
reversed += input.charAt(i);
}
// Step 5: Print the reversed string
System.out.println("Reversed string:"+ reversed);
}
}

//sample output:
//Reversed string:ivagrahB
