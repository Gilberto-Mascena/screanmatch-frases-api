package br.com.mascenadev.screanmatchfrases.controller;

import br.com.mascenadev.screanmatchfrases.dto.PhraseDTO;
import br.com.mascenadev.screanmatchfrases.service.PhraseService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gilberto Dev
 * @version 1.0.0
 * @since 2024-06-14
 * <p>
 * REST Controller for handling phrase-related requests in the Screanmatch-Phrases API.
 * This class exposes endpoints for retrieving random phrases.
 *
 * <p>
 * It interacts with the {@link PhraseService} to fetch the necessary data
 * and returns it in a {@link PhraseDTO} format.
 * </p>
 */
@RestController
public class FraseController {

    /**
     * Injects an instance of {@link PhraseService} to handle the business logic
     * related to phrases.
     */
    @Resource
    private PhraseService phraseService;

    /**
     * Handles HTTP GET requests to the "/series/frases" endpoint.
     *
     * <p>
     * This endpoint is designed to return a single random phrase.
     * It delegates the call to {@link PhraseService#catchRandomPhrase()}
     * to retrieve the data.
     * </p>
     *
     * @return A {@link PhraseDTO} object containing the random phrase and its associated details.
     */
    @GetMapping("/series/frases")
    public PhraseDTO catchRandomPhrase() {
        return phraseService.catchRandomPhrase();
    }
}