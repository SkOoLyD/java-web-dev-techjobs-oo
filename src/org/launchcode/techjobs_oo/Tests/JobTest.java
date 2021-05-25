package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;

import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

import static org.junit.Assert.*;

public class JobTest {

    @Before
    public void createJobObjects(){
        Job emptyJob1 = new Job();
        Job emptyJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        Job emptyJob1 = new Job();
        Job emptyJob2 = new Job();

        // values not the same
        assertFalse(emptyJob1.equals(emptyJob2));

        // id value is different by 1
        assertTrue((emptyJob2.getId() -1)== emptyJob1.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));

        assertTrue(testJob instanceof Job);

        assertTrue(testJob.getName() =="Product tester");

        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getEmployer().getValue() == "ACME");

        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getLocation().getValue() == "Desert");

        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getPositionType().getValue() == "Quality control");

        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob.getCoreCompetency().getValue() == "Persistence");


        }

        @Test
        public void testJobsForEquality() {
        Job Job1 = new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
        Job Job2 = new Job("Product tester",new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"),new CoreCompetency("Persistence"));

        // values not equal
        assertFalse(Job1.equals(Job2));
    }


}
