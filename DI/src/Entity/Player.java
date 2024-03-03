package Entity;

public class Player {

    Ability ability;

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public void perform(){
        System.out.println("begin performing");
        ability.activate();
        System.out.println("performed");
    }
}
