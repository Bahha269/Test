package wodanalyzer.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wodanalyzer.logic.MaxLetterInfo;
import wodanalyzer.logic.WordAnalyzer;

/**
 *  Контроллер, который обрабатывает запрос.
 */
@RestController
@RequestMapping(path = "/wordanalyzer/analyze")
public class WordAnalyzerApi {

    /**
     * К контроллеру обращаются с помощью GET запросов.
     * @param word слово, которое нужно анализировать
     * @return результат анализа слова
     */
    @GetMapping
    public MaxLetterInfo analyze(@RequestParam String word) {
        return WordAnalyzer.analyze(word);
    }
}