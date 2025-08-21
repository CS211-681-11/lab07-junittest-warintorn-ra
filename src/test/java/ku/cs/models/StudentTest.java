package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//ส่วนใหญ่ test method, constructor ยกเว้น getter
class StudentTest {
    Student s;
//    @BeforeAll // constructor ถูกเรียกครั้งเดียวตอน initial
    @BeforeEach
    void init(){
        s = new Student("6710405192", "test");
    }

    @Test // annotation
    @DisplayName("ทดสอบการเพิ่มคะแนน") //
    void testAddScore(){
        s.addScore(23);
        assertEquals(23, s.getScore()); //assertEquals(expected, actual)
    }

    @Test
    @DisplayName("ทดสอบการคำนวณเกรด")
    void testCalculateGrade(){
        s.addScore(124);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void changeName() {
        s.changeName("test2");
        assertEquals("test2", s.getName());
    }


    @Test
    @DisplayName("ทดสอบการว่ามีรหัสนิสิตนี้หรือไม่")
    void isId() {
        assertFalse(s.isId("test"));
        assertTrue(s.isId("6710405192"));
    }

    @Test
    @DisplayName("ทดสอบว่าชื่อนี้มีอยู่ในระบบหรือไม่")
    void isNameContains() {
        assertSame("test", s.getName());
    }

    @Test
    void testToString() {
        assertEquals("{" +
                "id: '6710405192', " +
                "name: 'test', " +
                "score: 0.0" +
                "}", s.toString());
    }
}