package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int r = 0;
        int i = 0;
        if(args[0].equals("-"))
            i = 1;
        while(i < args.length){
            r += Integer.valueOf(args[i]);
            i += 1;
        }
        if(args[0].equals("-"))
           r = 0 - r;
        return r;
    }
}
