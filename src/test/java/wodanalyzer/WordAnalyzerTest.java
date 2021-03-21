package wodanalyzer;

import org.junit.jupiter.api.Test;
import wodanalyzer.logic.MaxLetterInfo;
import wodanalyzer.logic.WordAnalyzer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordAnalyzerTest {

    /**
     * Тест для пустой строки.
     */
    @Test
    public void emptyString() {
        MaxLetterInfo maxLetterInfo = WordAnalyzer.analyze("");

        assertEquals(0, maxLetterInfo.getCount());
    }

    /**
     * Тест для строки, не содержащей букв английского алфавита.
     */
    @Test
    public void noLetterString() {
        MaxLetterInfo maxLetterInfo = WordAnalyzer.analyze("123");

        assertEquals(0, maxLetterInfo.getCount());
    }

    /**
     * Тест для строки из одного символа.
     */
    @Test
    public void oneLetterString() {
        MaxLetterInfo maxLetterInfo = WordAnalyzer.analyze("c");

        assertEquals(1, maxLetterInfo.getCount());
        assertEquals('c', maxLetterInfo.getLetter());
    }

    /**
     * Тест для строки, содержащей один символ с наибольшим количеством появлений в строке.
     */
    @Test
    public void uniqueMaxLetterInString() {
        String[] testCases = {"bb", "abb", "bab", "bba"};

        for (String testCase: testCases) {
            MaxLetterInfo maxLetterInfo = WordAnalyzer.analyze(testCase);

            assertEquals(2, maxLetterInfo.getCount());
            assertEquals('b', maxLetterInfo.getLetter());
        }
    }

    /**
     * Тест для строки, содержащей несколько символов с наибольшим количеством появлений в строке.
     */
    @Test
    public void duplicatedMaxLetterInString() {
        String[] testCases = {"aabb", "abab", "baab"};

        for (String testCase : testCases) {
            MaxLetterInfo maxLetterInfo = WordAnalyzer.analyze(testCase);

            assertEquals(2, maxLetterInfo.getCount());
            assertEquals('b', maxLetterInfo.getLetter());
        }
    }
}