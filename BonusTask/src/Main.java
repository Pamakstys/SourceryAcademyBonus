import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Compress("aaabbbcccded");
        Decompress("a3b1c2a3");
    }

    public static void Compress(String line){
        StringBuilder stringBuilder = new StringBuilder();
        //If the string is empty print the empty answer and stop the task
        if(line.isEmpty()){
            System.out.println(line + "-→" + stringBuilder);
            return;
        }
        char left = line.charAt(0), right = ' ';
        //Iterates through the string in the loop while increasing the
        //count value to track the amount of repeating letter.
        //If the letter changes adds the letter and the count to the answer string
        int count = 1;
        for(int i = 1; i < line.length(); i++){
            right = line.charAt(i);
            if(left != right){
                stringBuilder.append(left);
                stringBuilder.append(count);
                count = 0;
                left=right;
            }
            count++;
        }
        //This part appends the last letter and count to the answer string since left != right
        //condition does not become true for the last letter
        stringBuilder.append(left);
        stringBuilder.append(count);

        System.out.println(line + "-→" + stringBuilder);
    }

    public static void Decompress(String line){
        StringBuilder stringBuilder = new StringBuilder();
        //If the string is empty print the empty answer and stop the task
        if(line.isEmpty()){
            System.out.println(line + "-→" + stringBuilder);
            return;
        }
        //Converts the char to string since the string class has a repeat method but this could be
        //changed to a second loop that iterates through the count
        //Converts the char to a int for the repeat count and after the reapeating appends to the answer string
        for(int i = 0; i < line.length(); i+=2){
            String letter = String.valueOf(line.charAt(i));
            int count = Integer.parseInt(String.valueOf(line.charAt(i+1)));
            String appendable = letter.repeat(count);
            stringBuilder.append(appendable);
        }
        System.out.println(line + "-→" + stringBuilder);
    }

}
