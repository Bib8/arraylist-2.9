package ashdihomwork252arraylist;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.naming.InvalidNameException;
import java.util.stream.Stream;

import static ashdihomwork252arraylist.EmployeeTestConst.*;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeServiceImplTest {

    private final EmployeeServiceMap out = new EmployeeServiceMap();
    private final Employee employee = new Employee(FIRST_NAME, LAST_NAME);

    @Test
    public void shouldAddNewEmployeeNotYetExist() throws InvalidNameException, NotFoundAnyMatchException {
        assertEquals(true, out.getAllEmployees().isEmpty());
        Employee addedEmployee = out.addToRepositoryEmployee(FIRST_NAME, LAST_NAME);
        assertEquals(1, out.getAllEmployees().size());
        assertTrue(out.getAllEmployees().contains(addedEmployee));
    }

    private static Stream<Arguments> provideArgumentsIncorrectNames(){
        return Stream.of(
                Arguments.of(FIRST_NAME, LAST_NAME),
                Arguments.of(FIRST_NAME, NOT_VALID_lAST_NAME),
                Arguments.of(NOT_VALID_FIRST_NAME, NOT_VALID_lAST_NAME),
                Arguments.of(NOT_VALID_FIRST_NAME, LAST_NAME)

        );
    }

    @MethodSource("provideArgumentsIncorrectNames")
    @ParameterizedTest
    public void shouldValidateFullNameEmployee(String fName, String lName) {
        assertThrows(InvalidNameException.class,() -> out.addToRepositoryEmployee(fName, lName));
    }
     @Test
     public void shouldCheckForExistObj() throws InvalidNameException, NotFoundAnyMatchException {
            out.addToRepositoryEmployee(FIRST_NAME, LAST_NAME);
            assertThrows(NotFoundAnyMatchException.class,() -> out.addToRepositoryEmployee(FIRST_NAME, LAST_NAME));
    }
     @Test
     public void shouldCheckForExistObjWithFindMethod() throws InvalidNameException, NotFoundAnyMatchException {
            Employee addedEmployee = out.addToRepositoryEmployee(FIRST_NAME, LAST_NAME);
            assertEquals(addedEmployee, out.findEmployeeInRepository(FIRST_NAME, LAST_NAME));
    }
     @Test
     public void shouldRemoveEmployee() throws InvalidNameException, NotFoundAnyMatchException {
            assertEquals(true, out.getAllEmployees().isEmpty());
            Employee addedEmployee = out.addToRepositoryEmployee(FIRST_NAME, LAST_NAME);
            assertEquals(1, out.getAllEmployees().size());
            out.removeFromRepositoryEmployee(FIRST_NAME, LAST_NAME);
            assertEquals(0, out.getAllEmployees().size());
     }
    @Test
    public void shouldThrowExceptionNotFound() throws InvalidNameException, NotFoundAnyMatchException {
            assertEquals(true, out.getAllEmployees().isEmpty());
            assertThrows(NotFoundAnyMatchException.class,() -> out.removeFromRepositoryEmployee(FIRST_NAME, LAST_NAME));
    }











}
