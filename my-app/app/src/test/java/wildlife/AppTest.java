/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test public void testAppExists () {
    try {
      Class.forName("wildlife.App"); 
    } catch (ClassNotFoundException e) {
      fail("Should have a class named App.");
    }
  }
}