import Entity.Ability;
import Entity.Burn;
import Entity.Fly;
import Entity.Player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Player player = new Player();
        Fly ability = new Fly();
        player.setAbility(ability);
        player.perform();

        Ability ability2 = new Burn();

        player.setAbility(ability2);
        player.perform();
       }
}