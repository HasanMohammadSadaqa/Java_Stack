import java.util.Random;
import java.util.ArrayList;

public class PuzzelJava{

    Random randMachine = new Random();

    public ArrayList<Object> getTenRolls (){
        ArrayList<Object> firstArray = new ArrayList<Object>();
        for (int i = 0; i < 10 ; i++) {
            int random = randMachine.nextInt(10);
            firstArray.add(random);
        }
        return firstArray;
    }

    public Character getRandomLetter( ){
        ArrayList<Character> randomLetter = new ArrayList<Character>();
        int randomNumber = randMachine.nextInt(25);
        for (char c='A' ; c <='Z'; c++){
            randomLetter.add(c);
        }
        char randomCharacter = randomLetter.get(randomNumber);
        return randomCharacter;
    }

    public String generatePassword() {
        String password = "";
        for(int i=0; i<8; i++){
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int arrayLength) {
        ArrayList<String> newPassword = new ArrayList<String>();
        for (int i=0; i<arrayLength; i++){
            newPassword.add(generatePassword());
        }
        return newPassword;
    }
}