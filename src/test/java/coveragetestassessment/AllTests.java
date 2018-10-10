package coveragetestassessment;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This suite class allow one to control using suite classes, or alternatively using catagories
 * @author Rob
 *
 */

// using categories
@RunWith(Categories.class)
@Categories.IncludeCategory({TestGroupBSpecialised.class, TestGroupA.class})
@SuiteClasses({ FibonacciTermGeneratorTest.class, FibonacciTermGeneratorTestString.class })

/* using a suite class
@RunWith(Suite.class)
//@SuiteClasses({ FibonacciTermGeneratorTestString.class })
@SuiteClasses({ FibonacciTermGeneratorTest.class, FibonacciTermGeneratorTestString.class })
*/
public class AllTests {

}
