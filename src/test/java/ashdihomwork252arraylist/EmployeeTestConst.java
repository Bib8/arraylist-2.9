package ashdihomwork252arraylist;


import java.util.Set;

public class EmployeeTestConst {

    public static final String FIRST_NAME = "Mitiay";
    public static final String FIRST_NAME2 = "Jhon";
    public static final String FIRST_NAME3 = "Hunter";
    public static final String FIRST_NAME4 = "Jill";
    public static final String LAST_NAME = "Makronov";
    public static final String LAST_NAME2 = "Biden";
    public static final String LAST_NAME3 = "Stevenson";
    public static final String LAST_NAME4 = "Jacobs";
    public static final String NOT_VALID_FIRST_NAME = "Den$";
    public static final String NOT_VALID_lAST_NAME = "M@kronov";
    public static final int SALARY1000 = 1000;
    public static final int SALARY5000 = 5000;
    public static final int SALARY10000 = 10000;
    public static final int SALARY2000 = 2000;
    public static  int DEPARTMENT_ID1 = 1;
    public static  int DEPARTMENT_ID2 = 2;
    public static  int DEPARTMENT_ID3 = 3;
    public static  int DEPARTMENT_ID4 = 4;
    public static Employee EMP_ONE = new Employee(FIRST_NAME2, LAST_NAME2, SALARY1000, DEPARTMENT_ID1);
    public static Employee EMP_TWO = new Employee(FIRST_NAME3, LAST_NAME3, SALARY10000, DEPARTMENT_ID2);
    public static Employee EMP_THREE = new Employee(FIRST_NAME4, LAST_NAME4, SALARY2000, DEPARTMENT_ID3);
    public static Employee EMP_FOUR = new Employee(FIRST_NAME, LAST_NAME, SALARY5000, DEPARTMENT_ID1);
    public static Set<Employee> EMPLOYEES_SET= Set.of(EMP_ONE, EMP_TWO, EMP_THREE, EMP_FOUR);
}
