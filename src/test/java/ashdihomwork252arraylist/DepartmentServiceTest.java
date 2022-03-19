package ashdihomwork252arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.*;
import static ashdihomwork252arraylist.EmployeeTestConst.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Set;
import java.util.stream.Stream;


@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {

    @Mock
    EmployeeServiceMap employeeServiceMap;

    @InjectMocks
    private DepartmentAndSalaryService out;


    @Test
    public void shouldFilterMaxSalary() throws NotFoundAnyMatchException {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertEquals(EMP_FOUR, out.maxSalaryInDeparmentId(DEPARTMENT_ID1));
    }
    @Test
    public void shouldFilterMaxSalary2() throws NotFoundAnyMatchException {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertEquals(EMP_THREE, out.maxSalaryInDeparmentId(DEPARTMENT_ID2));
    }
    @Test
    public void shouldThrowExceptionNotFoundMaxSalary() throws NotFoundAnyMatchException {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertThrows(NotFoundAnyMatchException.class, ()-> out.maxSalaryInDeparmentId(DEPARTMENT_ID4));
    }


    @Test
    public void shouldFilterMinSalary() throws NotFoundAnyMatchException {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertEquals(EMP_FOUR, out.minSalaryInDeparmentId(DEPARTMENT_ID1));
    }

    @Test
    public void shouldFilterMinSalary2() throws NotFoundAnyMatchException {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertEquals(EMP_FOUR, out.minSalaryInDeparmentId(DEPARTMENT_ID3));
    }

    @Test
    public void shouldThrowExceptionNotFoundInSalaryMin() throws NotFoundAnyMatchException {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertThrows(NotFoundAnyMatchException.class, ()-> out.minSalaryInDeparmentId(DEPARTMENT_ID4));
    }

    @Test
    public void shouldFilterById() throws NotFoundAnyMatchException {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertEquals(EMP_THREE, out.findEmployeeInDeparmentId(DEPARTMENT_ID3));
    }

    @Test
    public void shouldFoundFindEmployeeInDeparmentId() {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertEquals(EMP_THREE, out.findEmployeeInDeparmentId(DEPARTMENT_ID3));
    }
    @Test
    public void shouldFoundAllEmployeeInDeparmentId() {
        when(employeeServiceMap.getAllEmployees()).thenReturn(EMPLOYEES_SET);
        assertEquals(EMP_TWO, out.findEmployeeInDeparmentId(DEPARTMENT_ID2));
    }




}
