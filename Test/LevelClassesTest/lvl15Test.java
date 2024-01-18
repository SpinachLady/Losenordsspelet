package LevelClassesTest;

import LevelClasses.lvl15;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl15Test {

    lvl15 testlvl = new lvl15();

    @Test
    public void checkRequirementsTest() {
        String inputTest1 = "testargrön";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "testarorange";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);

    }
}
