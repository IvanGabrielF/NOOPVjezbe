package pckg_zd3;

public class SimGame {
    public static void main(String[] args) {


        Hero hero = new Hero("SuperČovik");
        System.out.println(hero);
        hero.useAblity();
        System.out.println();

        Ability[] levels = {
                new FastRunning(),
                new Flying(),
                new DoubleStrength(),
                new HighJump(),
                new FreezeBreath(),
                new FireFromHands(),
                new LongDistanceVision()
        };

        int level =1;
        for (Ability a :levels){
            System.out.println("Level " + level);
            hero.setAbility(a);
            System.out.println(hero);
            hero.useAblity();
            System.out.println();
        }
    }
}
