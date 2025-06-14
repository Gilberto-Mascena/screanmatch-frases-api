package br.com.mascenadev.screanmatchfrases.dto;

/**
 * @param titulo     The title associated with the phrase (e.g., the series or movie title).
 * @param frase      The text of the phrase itself.
 * @param personagem The character who uttered the phrase.
 * @param poster     The URL to an image poster related to the phrase or its source.
 * @author Gilberto Dev
 * @version 1.0.0
 * @since 2024-06-14
 * <p>
 * A Data Transfer Object (DTO) record representing a phrase with its associated details.
 * This record is used to transfer phrase data between different layers of the application,
 * typically from the service layer to the controller layer and then as a response to clients.
 *
 * <p>
 * Records in Java are immutable data classes that require very little boilerplate code.
 * This {@code PhraseDTO} encapsulates information about a phrase, including its title,
 * the phrase text itself, the character who said it, and a poster URL.
 * </p>
 */
public record PhraseDTO(
        String titulo,
        String frase,
        String personagem,
        String poster) {
}