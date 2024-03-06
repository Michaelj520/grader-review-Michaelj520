import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}




public class TestListExamples {
  @Test
  public void testFilter() {
   List<String> inputList = Arrays.asList("apple", "banana", "cherry");
   StringChecker sc = s -> s.contains("a"); 

   List<String> actual = ListExamples.filter(inputList, sc);
   List<String> expected = Arrays.asList("apple", "banana");
   
   assertEquals(expected, actual);
  }

  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }


  @Test
  public void testMerge2() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("f", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "b", "c", "f", "d");
    assertEquals(expected, merged);
  }

  @Test
  public void testMerge3() {
    List<String> left = Arrays.asList("a", "b");
    List<String> right = Arrays.asList("a", "b");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "b");
    assertEquals(expected, merged);
  }







}


