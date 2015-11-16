import com.company.Exceptions.OutOfEnergyException;

public class Main {
    public static void main(String[] args) {
        GameCharacter goshoTheWarrior = new Warrior("Gosho");
        GameCharacter peshoTheMage = new Mage("Pesho");

        int countRound = 0;

        while((goshoTheWarrior.getHealth() == -1) || (peshoTheMage.getHealth() == -1)){
            System.out.println("Round: " + ++countRound);

            try{
                if (countRound % 2 == 0){
                    goshoTheWarrior.attack(peshoTheMage);
                    peshoTheMage.attack(goshoTheWarrior);
                }  else{
                    peshoTheMage.attack(goshoTheWarrior);
                    goshoTheWarrior.attack(peshoTheMage);
                }

            } catch (OutOfEnergyException ex){
                System.out.println(ex.getMessage());

                break;
            }
        }

        if (goshoTheWarrior.getHealth() > peshoTheMage.getHealth()){
            System.out.println("The winner is: " + goshoTheWarrior);
        }  else {
            System.out.println("The winner is: " + peshoTheMage);
        }


    }
}
