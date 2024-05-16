package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.lang.model.element.Name;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobID(){
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
}
