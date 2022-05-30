/**
 * Author: Alexey Bondarenko
 * Date: 29.05.2022
 */
public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return checkLengthName() && checkSpacesIntoName();
    }

    private boolean checkLengthName() {
        return !(name == null) && name.length() >= 3 && name.length() <= 19;
    }

    private boolean checkSpacesIntoName() {
        int countOfSpaces = name.length() - name.replaceAll(" ", "").length();
        boolean isSpaceInTheRightPlace = !(name.startsWith(" ") || name.endsWith(" "));
        return countOfSpaces == 1 && isSpaceInTheRightPlace;
    }

}
