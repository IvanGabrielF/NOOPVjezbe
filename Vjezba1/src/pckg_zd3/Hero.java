package pckg_zd3;

public class Hero {

    private Ability ability;

    private String name;

    public Hero(String name){
        this.name = name;
        this.ability = new NoAbility();
    }

    public void setAbility(Ability ability){
        this.ability = ability;
    }
    public void useAblity(){
        ability.activate();
    }


    @Override
    public String toString() {
        return "Hero{" +
                "ability=" + ability +
                '}';
    }
}
