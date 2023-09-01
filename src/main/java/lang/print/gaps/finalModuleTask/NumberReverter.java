package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        System.out.println((number%10)*100 + ((number/10)%10)*10 + (number/10)/10);
    }
}
