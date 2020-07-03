import static org.junit.Assert.*;
import org.junit.Test;
public class RemoveCharFromStringTest {

    @Test
    public void removeAtBeginning(){
        assertEquals("bc", RemoveCharFromString.remove("abc", 'a'));
        assertEquals("bc", RemoveCharFromString.removeRecursive("abc", 'a'));
     
        assertEquals("bcdefgh", RemoveCharFromString.removeRecursive("abcdefgh", 'a'));
        assertEquals("bcdefgh", RemoveCharFromString.removeRecursive("abcdefgh", 'a'));
    }
 
    @Test
    public void removeAtMiddle(){
        assertEquals("abd", RemoveCharFromString.remove("abcd", 'c'));
        assertEquals("abd", RemoveCharFromString.removeRecursive("abcd", 'c'));
    }
 
 
    @Test
    public void removeAtEnd(){
        assertEquals("abc", RemoveCharFromString.remove("abcd", 'd'));
        assertEquals("abc", RemoveCharFromString.removeRecursive("abcd", 'd'));
    }
 
    @Test
    public void cornerCases(){
        // empty string test
        assertEquals("", RemoveCharFromString.remove("", 'd'));
     
        // all removable character test
        assertEquals("", RemoveCharFromString.remove("aaaaaaaaaaaaaa", 'a'));
     
        // all but one removable characters
        assertEquals("b", RemoveCharFromString.remove("aaaaaaaaaaaaaab", 'a'));
    }

}