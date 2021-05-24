package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

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
        Job testJob = new Job("Product tester",new Location("Desert"),new Employer("Acme"),new PositionType("Quality control"),new CoreCompetency("Persistence"));

        assertTrue(testJob instanceof Job);

        assertTrue(testJob.getName() =="Product tester");

        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getEmployer().getValue() == "Acme");

        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getLocation().getValue() == "Desert");

        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getPositionType().getValue() == "Quality control");

        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob.getCoreCompetency().getValue() == "Persistence");
    }
}
