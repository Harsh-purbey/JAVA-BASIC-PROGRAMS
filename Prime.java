import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int P = input.nextInt();

        int i=2;
        boolean count=false;

        while((i*i)<=(P)){
            if(P%i==0){
                count=true;
                break;
            }
            i++;
        }

        if(!count){
            System.out.println(P + " IS PRIME");
        }
        else{
            System.out.println(P + " IS NOT PRIME");
        }
    }
}
