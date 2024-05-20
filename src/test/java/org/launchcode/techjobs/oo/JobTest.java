package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.lang.model.element.Name;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2= new Job();
        assertNotEquals(testJob1,testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob1.getName(),"Product tester" );
        assertTrue(testJob1.getName() instanceof String);

        assertEquals(testJob1.getEmployer().toString() ,"ACME");
        assertTrue(testJob1.getEmployer() instanceof Employer);

        assertEquals(testJob1.getLocation().toString(), "Desert");
        assertTrue(testJob1.getLocation() instanceof Location);

        assertEquals(testJob1.getPositionType().toString(),"Quality control");
        assertTrue(testJob1.getPositionType() instanceof PositionType);

        assertEquals(testJob1.getCoreCompetency().toString(), "Persistence");
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testJob1.getId(),testJob2.getId());
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob = new Job();
        assertEquals(testJob.toString().startsWith(System.lineSeparator()), true);
        assertEquals(testJob.toString().endsWith(System.lineSeparator()), true);


    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String tester = System.lineSeparator() +
                "ID: "+ testJob1.getId()+ "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence" +
                System.lineSeparator();
        assertEquals(testJob1.toString(), tester);


    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job();

        String tester =System.lineSeparator() +
                "ID: " + testJob.getId()+ "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available" +
                System.lineSeparator();
        assertEquals(testJob.toString(), tester);


    }
}
