package dev.java10x.cadastroDeNinjas.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Entity;


@Entity
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ChoiceRank rank;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ChoiceVila vila;

    public NinjaEntity() {
    }

    public NinjaEntity(String name, ChoiceRank rank, ChoiceVila vila) {
        this.name = name;
        this.rank = rank;
        this.vila = vila;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ChoiceRank getRank() {
        return rank;
    }

    public ChoiceVila getVila() {
        return vila;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(ChoiceRank rank) {
        this.rank = rank;
    }

    public void setVila(ChoiceVila vila) {
        this.vila = vila;
    }

    public enum ChoiceRank {
        GENIN,
        CHUUNIN,
        JOUNIN,
        ANBU,
        KAGE
    }

    public enum ChoiceVila {
        KONOHAGAKURE,
        SUNAGAKURE,
        KIRIGAKURE,
        KUMOGAKURE,
        IWAGAKURE
    }
}
