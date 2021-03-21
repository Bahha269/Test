package wodanalyzer.logic;

/**
 * Содержит в себе информацию об анализе слова.
 */
public class MaxLetterInfo {

    /**
     * Символ с максимальным количеством повторений.
     * По-умолчанию, используется значение '\0' (на случай, если будет анализироваться пустое слово).
     */
    private char letter = '\0';

    /**
     * Количество повторений символа.
     * По-умолчанию, используется значение 0 (на случай, если будет анализироваться пустое слово).
     */
    private int count = 0;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}