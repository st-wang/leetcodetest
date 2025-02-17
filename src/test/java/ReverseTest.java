import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseTest {

    private final Reverse test = new Reverse();

    @Test
    public void reverse_string_solution_1() {
        char[] s = ("hello").toCharArray();
        test.reverseString(s);

        assertThat(s).isEqualTo(("olleh").toCharArray());
    }

    @Test
    public void reverse_string_solution_2() {
        char[] s = ("hello").toCharArray();
        test.reverseString2(s);

        assertThat(s).isEqualTo(("olleh").toCharArray());
    }

    @Test
    public void reverse_int() {
        int i = 87;
        int reversed = test.reverseInteger(i);

        assertThat(reversed).isEqualTo(78);
    }
}