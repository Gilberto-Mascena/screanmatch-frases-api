package br.com.mascenadev.screanmatchfrases.service;

import br.com.mascenadev.screanmatchfrases.dto.PhraseDTO;
import br.com.mascenadev.screanmatchfrases.model.Phrase;
import br.com.mascenadev.screanmatchfrases.repository.PhraseRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author Gilberto Dev
 * @version 1.0.0
 * @since 2024-06-14
 * <p>
 * Service class responsible for handling business logic related to {@link Phrase} entities.
 * This class acts as an intermediary between the controller and the repository,
 * performing operations to retrieve and process phrase data.
 *
 * <p>
 * It specifically provides a method to fetch a random phrase from the database
 * and transform it into a {@link PhraseDTO} for consumption by the API's clients.
 * </p>
 */
@Service
public class PhraseService {

    /**
     * Injects an instance of {@link PhraseRepository} to perform database operations
     * related to phrases.
     */
    @Resource
    private PhraseRepository phraseRepository;

    /**
     * Retrieves a random phrase from the database and maps it to a {@link PhraseDTO}.
     *
     * <p>
     * This method delegates the retrieval of a random phrase to the {@link PhraseRepository#getRandomPhrase()} method.
     * After fetching the {@link Phrase} entity, it converts the entity into a
     * {@link PhraseDTO} object, which is then returned. This DTO includes the title,
     * the phrase text, the character, and the poster URL.
     * </p>
     *
     * @return A {@link PhraseDTO} object representing a randomly selected phrase.
     */
    public PhraseDTO catchRandomPhrase() {
        Phrase phrase = phraseRepository.getRandomPhrase();
        return new PhraseDTO(
                phrase.getTitulo(),
                phrase.getFrase(),
                phrase.getPersonagem(),
                phrase.getPoster());
    }
}