package LevelClassesTest;

import LevelClasses.lvl2;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl2Test {

    lvl2 testlvl = new lvl2();
    @Test
    public void checkRequirementsTest () {
        String inputTest1 = "testar1";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "Testar2";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }
}
