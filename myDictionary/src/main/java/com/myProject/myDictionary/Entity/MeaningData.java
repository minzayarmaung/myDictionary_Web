package com.myProject.myDictionary.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "MNG001")
@AllArgsConstructor
@NoArgsConstructor
public class MeaningData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String partOfSpeech;

    @ElementCollection
    private List<String> definitions;

    @ElementCollection
    private List<String> synonyms;

    @ElementCollection
    private List<String> antonyms;

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public List<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<String> definitions) {
        this.definitions = definitions;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public List<String> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(List<String> antonyms) {
        this.antonyms = antonyms;
    }

    public DictionaryData getDictionaryData() {
        return dictionaryData;
    }

    public void setDictionaryData(DictionaryData dictionaryData) {
        this.dictionaryData = dictionaryData;
    }

    @ManyToOne
    @JoinColumn(name = "dictionary_syskey")
    private DictionaryData dictionaryData;

}
