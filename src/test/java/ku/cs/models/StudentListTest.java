package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList list;
    @BeforeEach
    void init(){
        list = new StudentList();
    }

    @Test
    void addNewStudent() {
        list.addNewStudent("6710405192", "test");
        assertEquals(1, list.getStudents().size());
        list.addNewStudent("6710405010", "test2", 67.8);
        assertEquals(2, list.getStudents().size());
    }


    @Test
    void findStudentById() {
        list.addNewStudent("6710404994", "test3");
        assertTrue(list.getStudents().get(0).isId("6710404994"));
        assertFalse(list.getStudents().get(0).isId("6710404995"));
    }

    @Test
    void filterByName() {
        list.addNewStudent("6710405009", "test");
        list.addNewStudent("6710405010", "test2");
        list.addNewStudent("6710405011", "test3");
        list.addNewStudent("6710405012", "test4");
        StudentList filteredList = list.filterByName("test");
        assertEquals(4, filteredList.getStudents().size());
    }

    @Test
    void giveScoreToId() {
        list.addNewStudent("6710405009", "test", 35);
        assertEquals(35, list.getStudents().get(0).getScore());
    }

    @Test
    void viewGradeOfId() {
        list.addNewStudent("6710405009", "test", 35);
        assertEquals("F", list.getStudents().get(0).getGrade());
    }

    @Test
    void getStudents() {
        list.addNewStudent("6710405009", "test");
        list.addNewStudent("6710405010", "test2");
        list.addNewStudent("6710405011", "test3");
        list.addNewStudent("6710405012", "test4");
        assertEquals(4, list.getStudents().size());
    }
}