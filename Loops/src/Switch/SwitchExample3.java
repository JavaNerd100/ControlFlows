package Switch;

public class SwitchExample3 {

    public static void main(String[] args) {
        String card = "Ace";
        int currentTotalValue = 15;

        int currentValue = switch (card) {
            case "Jack", "Queen", "King" -> 10;
            case "Ace" ->{
                if (currentTotalValue < 11){
                    yield 11;

                }else {
                    yield 1;
                }
            }
            default -> Integer.parseInt(card);
        };
        if (currentValue + currentTotalValue != 21){
            System.out.println("you are busted");
        }else {
            System.out.println("you have won");
        }

        System.out.printf("currentValue is %d%n", currentValue);
        System.out.printf("currentTotalValue is %d%n", currentValue + currentTotalValue);

    }
}
