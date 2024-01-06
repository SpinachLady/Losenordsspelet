package LevelClassesTest;

import LevelClasses.lvl4;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl4Test {

    lvl4 testlvl = new lvl4();
    @Test
    public void checkRequirementsTest () {
        String inputTest1 = "testar";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "testar2";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }
}
