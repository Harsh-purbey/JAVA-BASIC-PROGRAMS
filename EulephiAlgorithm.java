import java.util.Scanner;
public class EulephiAlgorithm {

    static int phi_n(int n){
        
        int result =n;

        for(int p=2;p*p<=n;p++){
            if(n%p==0){
                while(n%p==0){
                    n/=p;
                }
            }
            result-=result/p;
        }

        if(n>1){
            result -= result/n;
        }

        return result;
    }
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("enter the value : ");
        int n= input.nextInt();
        int phi_n=phi_n(n);
        System.out.println("relative coprime is "+phi_n);
        input.close();



       
    }
}
