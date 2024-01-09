package LevelClassesTest;

import LevelClasses.lvl12;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl12Test {

    lvl12 testlvl = new lvl12();

    @Test
    public void checkRequirementsTest() {
        String inputTest1 = "testar1";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "tEstAr1";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);

    }
}
