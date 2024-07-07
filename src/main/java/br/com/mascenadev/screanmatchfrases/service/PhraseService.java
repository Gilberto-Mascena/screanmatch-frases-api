package br.com.mascenadev.screanmatchfrases.service;

import br.com.mascenadev.screanmatchfrases.dto.PhraseDTO;
import br.com.mascenadev.screanmatchfrases.model.Phrase;
import br.com.mascenadev.screanmatchfrases.repository.PhraseRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {

    @Resource
    private PhraseRepository phraseRepository;

    public PhraseDTO catchRandomPhrase() {

        Phrase phrase = phraseRepository.getRandomPhrase();
        return new PhraseDTO(
                phrase.getTitulo(),
                phrase.getFrase(),
                phrase.getPersonagem(),
                phrase.getPoster());
    }
}