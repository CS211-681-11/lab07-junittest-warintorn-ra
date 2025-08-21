package ku.cs.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource studentHardCodeDatasource;
    @Test
    void readData() {
        studentHardCodeDatasource = new StudentHardCodeDatasource();
        studentHardCodeDatasource.readData();
        assertEquals(4, studentHardCodeDatasource.readData().getStudents().size());
    }
}