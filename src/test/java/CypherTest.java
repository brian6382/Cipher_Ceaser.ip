import org.junit.Test;


import static org.junit.Assert.*;

public class CypherTest {
    @Test
    public void Cypher_instanceof_Object() {
        Cypher cypher = new Cypher();
        assertTrue(cypher instanceof Cypher);
    }


    @Test
    public void Cypher_takeStringInput_string() {
        Cypher cypherTest = new Cypher();
        String expectedOutput = new String();
        expectedOutput = "zpbr";
        assertEquals(expectedOutput, cypherTest.doCeaserCipher("love", 1));
    }

    @Test
    public void  Cypher_allowsUppercaseInput_string() {
        Cypher testCeaserCipher = new Cypher();
        String expectedOutput = new String();
        expectedOutput = "ktxxa";
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("HELLO", 2));
    }

    @Test
    public void Cypher_doesEncryption_string() {
        Cypher testCeaserCipher = new Cypher();
        String expectedOutput = new String();
        expectedOutput = "eodhr";
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("brian", 5));

    }

    @Test
    public void Cypher_doesDecryption_string() {
        Cypher testCeaserCipher =  new Cypher();
        String expectedOutput = new String();
        expectedOutput = "brian";
        assertEquals(expectedOutput, testCeaserCipher.unDoCeaseCipher("eodhr", 5));
    }


}