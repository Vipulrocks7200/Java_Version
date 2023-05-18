/**
* This is a preview feature.
* For executing with Java 12 use the below command
* javac --enable-preview -source 12 ${your directory path}/SwitchExpressions.java
**/

public class SwitchExpressions {

    public static void main(String[] args)
    {
        System.out.println("New Switch Expression result:");
        executeNewSwitchExpression("M");
        executeNewSwitchExpression("TH");
        executeNewSwitchExpression("");
        executeNewSwitchExpression("SUN");
    }

    public static void executeNewSwitchExpression(String day){

        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> "Invalid day";

        };

        System.out.println(result);
    }
}