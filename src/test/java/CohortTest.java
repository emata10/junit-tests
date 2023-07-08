import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CohortTest {
    private Cohort cohort;

    @Before
    public void setUp() {
        cohort = new Cohort();
    }

    @Test
    public void testAddStudent() {
        Student student = new Student(80, "John Doe");
        cohort.addStudent(student);
        List<Student> students = cohort.getStudents();
        assertEquals(1, students.size());
    }

    @Test
    public void testGetStudents() {
        Student student1 = new Student(80, "John Doe");
        Student student2 = new Student(90, "Jane Smith");
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        List<Student> students = cohort.getStudents();
        assertEquals(2, students.size());
        assertTrue(students.contains(student1));
        assertTrue(students.contains(student2));
    }

    @Test
    public void testCalculateAverage() {
        Student student1 = new Student(80, "John Doe");
        Student student2 = new Student(90, "Jane Smith");
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        double average = cohort.calculateAverage();
    }
}
