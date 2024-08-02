package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import suite.TestSuite;
import suite.TestSuite2;

import static org.junit.runners.Suite.*;

@RunWith(Suite.class)
@SuiteClasses({
        TestSuite.class,
        TestSuite2.class
})
public class MasterSuite {
}
