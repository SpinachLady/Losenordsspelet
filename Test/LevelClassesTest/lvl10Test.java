package LevelClassesTest;

import LevelClasses.lvl10;
import LevelClasses.lvl9;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class lvl10Test {

    lvl10 testlvl = new lvl10();

    @Test
    public void checkRequirementsTest() {
        String inputTest1 = "testargul";
        boolean expectedResult1 = false;
        boolean actualResult1 = testlvl.checkRequirements(inputTest1);
        Assertions.assertEquals(expectedResult1, actualResult1);


        String inputTest2 = "testargrön";
        boolean expectedResult2 = true;
        boolean actualResult2 = testlvl.checkRequirements(inputTest2);
        Assertions.assertEquals(expectedResult2, actualResult2);

    }
}
