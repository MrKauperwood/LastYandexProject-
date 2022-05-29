/**
 * Author: Alexey Bondarenko
 * Date: 29.05.2022
 */
public class Praktikum {

    public static void main(String[] args) {

        String nameAndSurname = "Aleksei Bondarenko";
        Account account = new Account(nameAndSurname);
        if (account.checkNameToEmboss()) {
            System.out.println("Correct Name and Surname");
        } else {
            System.out.println("Not correct Name and Surname");
        }
    }

}
