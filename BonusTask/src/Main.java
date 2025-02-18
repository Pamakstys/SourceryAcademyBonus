import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String line = scanner.nextLine();
        System.out.println("Pradinė eilutė: " + line);

        if(line.isEmpty()){
            System.out.println("Atsakymas: " + stringBuilder);
        }

        char left = line.charAt(0), right = ' ';

        int count = 1;
        for(int i = 1; i < line.length(); i++){
            right = line.charAt(i);
            if(left != right){
                stringBuilder.append(left);
                stringBuilder.append(count);
                count = 1;
                left=right;
                continue;
            }
            count++;
        }
        stringBuilder.append(left);
        stringBuilder.append(count);

        System.out.println("Atsakymas: " + stringBuilder);
    }
}