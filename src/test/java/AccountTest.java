import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

/**
 * Author: Alexey Bondarenko
 * Date: 29.05.2022
 */
@RunWith(Parameterized.class)
public class AccountTest {

    private final String nameAndSurname;
    private final Boolean expectedResult;

    public AccountTest(String nameAndSurname, Boolean expectedResult) {
        this.nameAndSurname = nameAndSurname;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getDataForTest() {
        return new Object[][]{
                {"Alekseii Bondarenko", true},
                {"A B", true},
                {"Alekseii Bondarenko1", false},
                {"Aleksei B ondare", false},
                {"AlekseiBondarenko", false},
                {" AlekseiBondare", false},
                {"AlekseiBondare ", false},
                {"", false}
        };
    }

    @Test
    public void checkNameToEmboss() {
        Account account = new Account(nameAndSurname);
        Boolean actual = account.checkNameToEmboss();
        assertEquals(expectedResult, actual);
    }
}