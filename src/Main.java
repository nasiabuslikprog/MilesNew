public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int amountBuy = 10_000;
        int bonusMiles = service.calculate(amountBuy);
        System.out.println(bonusMiles);

    }
}