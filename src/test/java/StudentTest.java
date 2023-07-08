import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        student = new Student(80, "John Doe");
    }

    @Test
    public void testGetId() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName());
    }


    @Test
    public void testAddGrade() {
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(92);
        ;

        ArrayList<Integer> expectedGrades = new ArrayList<>();
        expectedGrades.add(90);
        expectedGrades.add(85);
        expectedGrades.add(92);

        assertEquals(expectedGrades, student.getGrades());

    }

    @Test
    public void testGetGrades() {
        ArrayList<Integer> grades = student.getGrades();
        assertTrue(grades.isEmpty());
    }

    @Test
    public void testGetGradeAverage() {
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(92);

    }

    @Test

    public void testUpdateGrade() {

        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(92);
        int expectedGrades = 0;
        assertEquals(expectedGrades, student.getGrade());
    }
}
