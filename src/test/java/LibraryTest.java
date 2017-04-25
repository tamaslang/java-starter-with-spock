import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertThat(classUnderTest.sayHelloTo("World"), is("Hello World!"));
    }
}
