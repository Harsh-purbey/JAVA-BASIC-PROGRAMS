public class CommandLineArgumentsPrint {

    public static void main(String[] args) {
        
        for (int index = 0; index < args.length; index++) {
            System.out.print(args[index]+" ");
        }
    }
}