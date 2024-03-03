package Dynamique;

import Entity.Ability;
import Entity.Player;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("src/config.txt"));
            Ability ability = (Ability) Class.forName(sc.nextLine()).newInstance();
            Player player = (Player) Class.forName(sc.nextLine()).newInstance();
            player.setAbility(ability);
            player.perform();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
