package LevelClassesTest;

import LevelClasses.lvl7;
import LevelClasses.lvl8;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl8Test {
    lvl8 testlvl = new lvl8(true);
    @Test
    public void checkRequirementsTest () {
        String inputTest1 = "testar";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "testarU+1F61D";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }
}
