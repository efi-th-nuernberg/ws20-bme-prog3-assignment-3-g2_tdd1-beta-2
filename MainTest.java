import org.junit.Test;

import static org.junit.Assert.*; 

public class MainTest {

@Test
public void testNothing() {} 

@Test  
public void testSomeStuff() {
assertEquals(5,3+2);
assertNotNull("wort" );
assertTrue(3*7 > 4*5);

}
}