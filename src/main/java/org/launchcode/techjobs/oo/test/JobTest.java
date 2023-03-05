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



    assertNotEquals(jobTest1.getId(), jobTest2.getId());
}

@Test
public void testJobConstructorSetAllFields () {
    
    Job jobTest3 = new Job("Product tester",
                          new Employer("ACME"),
                          new Location("Desert"),
                          new PositionType("Quality control"),
                          new CoreCompetency("Persistence"));





    assertTrue(jobTest3.getName() instanceof String);
    assertTrue(jobTest3.getEmployer() instanceof Employer);
    assertTrue(jobTest3.getLocation() instanceof Location);
    assertTrue(jobTest3.getPositionType() instanceof PositionType);
    assertTrue(jobTest3.getCoreCompetency() instanceof CoreCompetency);



    assertEquals("Product tester", jobTest3.getName());
    assertEquals("ACME", jobTest3.getEmployer());
    assertEquals("Desert", jobTest3.getLocation());
    assertEquals("Quality control", jobTest3.getPositionType());
    assertEquals("Persistence", jobTest3.getCoreCompetency());


}


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

    assertNotEquals(jobTest4,jobTest5);

}
@Test
public void testToStringStartsAndEndsWithNewLine () {

    //establishes a new object to test against

    Job jobTest6 = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    //establishes variables to hold string indexes of the return string object

    char firstCharacter = jobTest6.toString().charAt(0);
    char lastCharacter = jobTest6.toString().charAt(jobTest6.toString().length() - 1);

    //tests that the first and last character of the return string object from toString() method is "\n" for new lines
}
 @Test
 public void testToStringContainsCorrectLabelsAndData () {

        //establishes a new object to test against

        Job jobTest7 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


          String jobListing = String.format(
                          "\n" +
                          "ID:%d\n" +
                          "Name:%s\n" +
                          "Employer:%s\n" +
                          "Location:%s\n" +
                          "Position Type:%s\n" +
                          "Core Competency:%s\n" +
                          "\n",
                            jobTest7.getId(),
                            jobTest7.getName(),
                            jobTest7.getEmployer(),
                            jobTest7.getLocation(),
                            jobTest7.getPositionType(),
                            jobTest7.getCoreCompetency()
          );


          assertEquals(jobListing, jobTest7.toString());



    }

    @Test
    public void testToStringHandlesEmptyField () {

        //establishes a new object to test against

        Job jobTest8 = new Job();



        assertEquals("Name: Data not available", jobTest8.toString());
        assertEquals("Employer: Data not available", jobTest8.toString());
        assertEquals("Location: Data not available", jobTest8.toString());
        assertEquals("Position Type: Data not available", jobTest8.toString());
        assertEquals("Core Competency: Data not available", jobTest8.toString());



    }



}


















