package br.com.mascenadev.screanmatchfrases.repository;

import br.com.mascenadev.screanmatchfrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {

    @Query("SELECT f FROM Phrase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Phrase getRandomPhrase();
}