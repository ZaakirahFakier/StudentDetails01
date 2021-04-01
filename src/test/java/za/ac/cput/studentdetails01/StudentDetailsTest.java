<<<<<<< OURS
package za.ac.cput.studentdetails01;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Timeout;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Ignore;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

/**<<<<<<< OURS
 *
 * @author Zaakirah Fakier
 */
public class StudentDetailsTest {
    
    public  StudentDetailsTest() {
    }
     
    @BeforeAll
    public static void setUpClass() {
    }
    
    @BeforeEach
    public static void setUpTest() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
   @AfterEach
    public static void tearDownTest() {
    } 

    
   /**
     * Test of getNameEquality method, of class StudentDetails.
     */
    @Test
    public void testEquality() {
        System.out.println("getName");
        String expResult = "Breyton";
        String result = "Breyton";
        assertEquals(expResult, result);
        assertNotEquals(expResult, result);
        System.out.println("The test case is successful.");
    }


    /**
     * Test of getSurnameIndentity method, of class StudentDetails.
     */
    @Test
    @Disabled
    public void testIndentity() {
        System.out.println("getSurname");
        
        String expResult = "Breyton";
        String result = "Khan";
        assertSame(expResult, result);
        assertNotSame(expResult, result);
        System.out.println("The test case is successful.");
    }

 /**
     * Test of getStudentNumber method, of class StudentDetails.
     */
    @Test
    @Disabled
    public void testDisabled(){
        System.out.println("getStudentNumber");
        long expResult = 217203027;
        long result = 220461503;
        assertEquals(expResult, result);
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of StudentCourse method, of class StudentDetails.
     * @throws java.lang.InterruptedException
     */
    @Test 
    @Timeout(4)
    public void testStudentCourse() throws InterruptedException{
        StudentDetails student6 = new StudentDetails();
        StudentDetails twinStudent = student6;
        
        String expected = "Applications Development";
        String actual = "Applications Development";
        assertEquals(expected, actual);//Test for equality
        
        assertSame(student6,twinStudent); //Checks for identity
        assertNotSame("Project",student6.getCourse());  //Object is not identical     
        
        Thread.sleep(5000);
        System.out.println("Test not sucessfully passed within time");
    }
    
    
    /**
     * Test of AverageMark method, of class StudentDetails.
     * @throws java.lang.InterruptedException
     */
    @Test 
    @Timeout(5)
    public void testAverageMark() throws InterruptedException{
        
        double expected = 23;
        double actual = 50;
        assertNotEquals(expected,actual);
     
        Thread.sleep(4000);
        System.out.println("Test sucessfully passed within time");
    }
  
  
    /**
     * Test of getStudGroup method, of class StudentDetails.
     */
    @Test
    public void testGetStudGroupFail() {
        System.out.println("getStudGroup");
        String expResult = "2C";
        String result = "2A";
        assertEquals(expResult, result);

        fail("The test case fails");
    }
   

    }


=======

package za.ac.cput.studentdetails01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Breyton Ernstzen
 */
public class StudentDetailsTest {
    
    public StudentDetailsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
>>>>>>> THEIRS

