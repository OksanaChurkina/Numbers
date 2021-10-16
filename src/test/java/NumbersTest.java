package test.java;

import com.company.main.java.MainClass;
import com.company.main.java.StreamMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class NumbersTest {

    @Test
    public void streamMainTest() {
        List<Integer> original = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> expected = Arrays.asList(2, 4, 8, 16, 32);
        List<Integer> result = StreamMain.filterList(original);
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void arrayFilterTest(){
        int[] original = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] expected = new int[]{2, 4, 8, 16, 32};
        int[] result = MainClass.filter(original);
        Assertions.assertArrayEquals(result, expected);
    }


}
