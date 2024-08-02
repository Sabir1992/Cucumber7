package suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import runners.JUnitRunner1;
import runners.JUnitRunner2;

import static org.junit.runners.Suite.*;

@RunWith(Suite.class)
@SuiteClasses({
        JUnitRunner1.class,
        JUnitRunner2.class
})
public class TestSuite2 {

}
