package br.com.mascenadev.screanmatchfrases.controller;

import br.com.mascenadev.screanmatchfrases.dto.PhraseDTO;
import br.com.mascenadev.screanmatchfrases.service.PhraseService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Resource
    private PhraseService phraseService;

    @GetMapping("/series/frases")
    public PhraseDTO catchRandomPhrase() {
        return phraseService.catchRandomPhrase();
    }
}