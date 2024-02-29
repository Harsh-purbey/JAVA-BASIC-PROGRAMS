import java.util.Scanner;
public class NaturalN {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int i=1;
        while (i<=N) {
            System.out.print(i+" ");
            i++;
        }

    }
}
