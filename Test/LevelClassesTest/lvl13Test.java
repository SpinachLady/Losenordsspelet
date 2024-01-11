package LevelClassesTest;

import LevelClasses.lvl13;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl13Test {

    lvl13 testlvl = new lvl13();

    @Test
    public void checkRequirementsTest() {
        String inputTest1 = "testar1";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "testarexcel";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);

    }
}
