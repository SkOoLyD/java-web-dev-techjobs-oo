package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JobTest {

    private Object String;

    @Before
    public void createJobObjects() {
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
        assertTrue((emptyJob2.getId() - 1) == emptyJob1.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob instanceof Job);

        assertTrue(testJob.getName() == "Product tester");

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
        Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // values not equal
        assertFalse(Job1.equals(Job2));
    }

    @Test
    public void testToStringPrintLabels() {

        Job testJob = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String[] lines = testJob.toString().trim().split("\n");

        System.out.println(testJob.toString());

        assertTrue(lines.length == 6);

        assertTrue(lines[0].startsWith("id:"));
        assertTrue(lines[1].startsWith("name:"));
        assertTrue(lines[2].startsWith("employer:"));
        assertTrue(lines[3].startsWith("location:"));
        assertTrue(lines[4].startsWith("positionType:"));
        assertTrue(lines[5].startsWith("core competency"));

        assertTrue(lines[0].endsWith(Integer.toString(testJob.getId())));
        assertTrue(lines[1].endsWith(testJob.getName()));
        assertTrue(lines[2].endsWith(testJob.getEmployer().toString()));
        assertTrue(lines[3].endsWith(testJob.getLocation().toString()));
        assertTrue(lines[4].endsWith(testJob.getPositionType().toString()));
        assertTrue(lines[5].endsWith(testJob.getCoreCompetency().toString()));

    }

    @Test
    public Object testToStringDataUnavailable() {
        Job testJob = new Job();

        String[] lines = testJob.toString().trim().split("\n");

        System.out.println(testJob.toString());

        List<String> list = new ArrayList<String>(Arrays.asList(lines));
        list.remove(0);
        lines = list.toArray(new String[0]);

        String = "data not available";
        return String ;
        }
    }



























