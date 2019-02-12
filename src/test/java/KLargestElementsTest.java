import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.assertThat;

public class KLargestElementsTest {
    private KLargestElements testInstance = new KLargestElements();

    @Test
    public void findKLargest() {
        List<Integer> list = new ArrayList<>(asList(1, 3, 5, 7, 2, 9, 0, 4));
        int k = 3;

        assertThat(testInstance.findKLargest(list, k)).isEqualTo(asList(9, 7, 5));
    }
}