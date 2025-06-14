package br.com.mascenadev.screanmatchfrases.repository;

import br.com.mascenadev.screanmatchfrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Gilberto Dev
 * @version 1.0.0
 * @since 2024-06-14
 * <p>
 * Repository interface for {@link Phrase} entities.
 * This interface extends {@link JpaRepository}, providing standard CRUD (Create, Read, Update, Delete)
 * operations for {@link Phrase} objects, as well as enabling the definition of custom query methods.
 *
 * <p>
 * It specifically includes a custom method to fetch a random phrase from the database.
 * </p>
 */
public interface PhraseRepository extends JpaRepository<Phrase, Long> {

    /**
     * Retrieves a single random {@link Phrase} from the database.
     *
     * <p>
     * This method uses a custom JPQL query to select one phrase
     * ordered randomly, ensuring a different phrase is returned each time it's called.
     * The `FUNCTION('RANDOM')` is used for database-specific random ordering.
     * </p>
     *
     * @return A randomly selected {@link Phrase} object.
     */
    @Query("SELECT f FROM Phrase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Phrase getRandomPhrase();
}