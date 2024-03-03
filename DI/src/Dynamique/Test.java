package Dynamique;

import Entity.Ability;
import Entity.Player;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("src/config.txt"));

            String className = sc.nextLine();
            Class clsab = Class.forName(className);
            Ability ability =  (Ability) clsab.newInstance();

             className = sc.nextLine();
             clsab = Class.forName(className);
             Player player =  (Player) clsab.newInstance();

             player.setAbility(ability);
             player.perform();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
