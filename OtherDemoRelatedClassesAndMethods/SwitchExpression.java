public class SwitchExpression {

    //multiple if else solution
    private static void withSwitchExpression(String fruit) {
        switch (fruit) {
            case "APPLE", "PEAR" -> System.out.println("Common fruit");
            case "ORANGE", "AVOCADO" -> System.out.println("Exotic fruit");
            default -> System.out.println("Undefined fruit");
        }
    }

    private static String withReturnValueEvenShorter(String fruit) {
        String data = switch (fruit) {
            case "APPLE", "PEAR" -> "Common fruit";
            case "ORANGE", "AVOCADO" -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        return data;
    }

    private static String withYield(String fruit) {
        String text = switch (fruit) {
            case "APPLE", "PEAR" -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";
            }
            case "ORANGE", "AVOCADO" -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        return text;
    }

    public static void main(String[] args) {

        withSwitchExpression("APPLE");
        System.out.println(withReturnValueEvenShorter("APPLE"));
        System.out.println(withYield("APPLE"));


    }
}
