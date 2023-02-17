package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;
import org.launchcode.techjobs.oo.CoreCompetency;


import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

@Test
public void testSettingJobId () {
    Job jobTest1 = new Job();
    Job jobTest2 = new Job();

    String spec = "Test the Job Class Empty Constructor";

    assertNotEquals(jobTest1.getId(), jobTest2.getId());
}

//@Test
//public void testJobConstructorSetAllFields () {
//    Job jobTest3 = new Job("Product tester",
//                          new Employer("ACME"),
//                          new Location("Desert"),
//                          new PositionType("Quality control"),
//                          new CoreCompetency("Persistence"));
//
//    String spec = "Test that job class initialized all constructor parameters as required and created new objects from job fields";

    // assertsTrue - is to check instance of object.method returns data type
//
//    assertsTrue(jobTest3.getName() instanceof String);
//    assertsTrue(jobTest3.getEmployer() instanceof Employer);
//    assertsTrue(jobTest3.getLocation() instanceof Location);
//    assertsTrue(                    );
//    assertsTrue(                    );
// assertEquals - two (expected, actual) data types and check if they are equal
//    assertTrue("Product tester", name);
//    assertTrue("ACME", jobTest3.getEmployer());
//    assertTrue("Desert", jobTest3.getLocation());
//    assertTrue("Quality control", jobTest3.getPositionType());
//    assertTrue("Persistence", jobTest3.getCoreCompetency());
//
//    if (!assertTrue() || !assertEquals()){
//        System.out.println(spec);
//    }
//
//}


@Test
    public void testJobsForEquality () {
    Job jobTest4 = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    Job jobTest5 = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    assertNotEquals(jobTest4, jobTest5);

}

public void testToStringStartsAndEndsWithNewLine () {

    //establishes a new object to test against

    Job jobTest6 = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    //establishes variables to hold string indexes of the return string object

    char firstCharacter = jobTest6.toString().charAt(0);
    char lastCharacter = jobTest6.toString().charAt(jobTest6.toString().length()-1);

    //tests that the first and last character of the return string object from toString() method is "\n" for new lines

    assertEquals("\n", firstCharacter);
    assertEquals("\n", lastCharacter);






}




}












