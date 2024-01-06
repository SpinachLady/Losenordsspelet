package LevelClassesTest;

import LevelClasses.lvl5;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl5Test {

    lvl5 testlvl = new lvl5();
    @Test
    public void checkRequirementsTest () {
        String inputTest1 = "testar";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "testarV";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }
}
