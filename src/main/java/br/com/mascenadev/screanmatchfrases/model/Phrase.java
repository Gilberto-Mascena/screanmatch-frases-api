package br.com.mascenadev.screanmatchfrases.model;

import jakarta.persistence.*;

/**
 * @author Gilberto Dev
 * @version 1.0.0
 * @since 2024-06-14
 * <p>
 * Represents the {@code Phrase} entity, mapping to the "frases" table in the database.
 * This class serves as the JPA entity for storing and retrieving phrase information.
 * Each instance of this class corresponds to a row in the "frases" table.
 *
 * <p>
 * The fields of this entity directly correspond to the columns in the database table,
 * including a unique identifier, the title associated with the phrase, the phrase text itself,
 * the character who said it, and a URL for a poster image.
 * </p>
 */
@Entity
@Table(name = "frases")
public class Phrase {

    /**
     * The unique identifier for the phrase. This is the primary key in the "frases" table,
     * and its value is automatically generated upon insertion.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The title associated with the phrase, typically representing the series or movie from which the phrase originates.
     */
    private String titulo;

    /**
     * The actual text content of the phrase.
     */
    private String frase;

    /**
     * The name of the character who uttered the phrase.
     */
    private String personagem;

    /**
     * The URL pointing to an image poster related to the phrase or its source.
     */
    private String poster;

    /**
     * Returns the unique identifier of the phrase.
     *
     * @return The ID of the phrase.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the phrase.
     *
     * @param id The ID to set for the phrase.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the title associated with the phrase.
     *
     * @return The title (e.g., series or movie title).
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the title associated with the phrase.
     *
     * @param titulo The title to set.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Returns the text content of the phrase.
     *
     * @return The phrase text.
     */
    public String getFrase() {
        return frase;
    }

    /**
     * Sets the text content of the phrase.
     *
     * @param frase The phrase text to set.
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }

    /**
     * Returns the name of the character who said the phrase.
     *
     * @return The character's name.
     */
    public String getPersonagem() {
        return personagem;
    }

    /**
     * Sets the name of the character who said the phrase.
     *
     * @param personagem The character's name to set.
     */
    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    /**
     * Returns the URL of the poster image related to the phrase.
     *
     * @return The poster URL.
     */
    public String getPoster() {
        return poster;
    }

    /**
     * Sets the URL of the poster image related to the phrase.
     *
     * @param poster The poster URL to set.
     */
    public void setPoster(String poster) {
        this.poster = poster;
    }
}