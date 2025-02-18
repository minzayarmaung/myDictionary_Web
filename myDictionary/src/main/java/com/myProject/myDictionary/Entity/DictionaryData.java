package com.myProject.myDictionary.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DICT001" , schema = "dbo")
@AllArgsConstructor
@NoArgsConstructor
public class DictionaryData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long syskey;

    private String createdDate;
    private String modifiedDate;
    private String status;
    private long parentid;
    private String T1;
    private String T2;
    private String T3;
    private String T4;
    private String T5;
    private String T6;
    private String T7;
    private String T8;
    private String T9;
    private String T10;
    private long N1;
    private long N2;
    private long N3;
    private long N4;
    private long N5;
    private long N6;
    private long N7;
    private long N8;
    private long N9;
    private long N10;

    private String phonetic;
    private List<String> sourceUrls;


    @OneToMany(mappedBy = "dictionaryData", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PhoneticsData> phonetics;

    @OneToMany(mappedBy = "dictionaryData", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MeaningData> meanings;

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getStatus() {
        return status;
    }

    public long getParentid() {
        return parentid;
    }

    public void setParentid(long parentid) {
        this.parentid = parentid;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getT1() {
        return T1;
    }

    public void setT1(String t1) {
        T1 = t1;
    }

    public String getT2() {
        return T2;
    }

    public void setT2(String t2) {
        T2 = t2;
    }

    public String getT3() {
        return T3;
    }

    public void setT3(String t3) {
        T3 = t3;
    }

    public String getT4() {
        return T4;
    }

    public void setT4(String t4) {
        T4 = t4;
    }

    public String getT5() {
        return T5;
    }

    public void setT5(String t5) {
        T5 = t5;
    }

    public String getT6() {
        return T6;
    }

    public void setT6(String t6) {
        T6 = t6;
    }

    public String getT7() {
        return T7;
    }

    public void setT7(String t7) {
        T7 = t7;
    }

    public String getT8() {
        return T8;
    }

    public void setT8(String t8) {
        T8 = t8;
    }

    public String getT9() {
        return T9;
    }

    public void setT9(String t9) {
        T9 = t9;
    }

    public String getT10() {
        return T10;
    }

    public void setT10(String t10) {
        T10 = t10;
    }

    public long getN1() {
        return N1;
    }

    public void setN1(long n1) {
        N1 = n1;
    }

    public long getN2() {
        return N2;
    }

    public void setN2(long n2) {
        N2 = n2;
    }

    public long getN3() {
        return N3;
    }

    public void setN3(long n3) {
        N3 = n3;
    }

    public long getN4() {
        return N4;
    }

    public void setN4(long n4) {
        N4 = n4;
    }

    public long getN5() {
        return N5;
    }

    public void setN5(long n5) {
        N5 = n5;
    }

    public long getN6() {
        return N6;
    }

    public void setN6(long n6) {
        N6 = n6;
    }

    public long getN7() {
        return N7;
    }

    public void setN7(long n7) {
        N7 = n7;
    }

    public long getN8() {
        return N8;
    }

    public void setN8(long n8) {
        N8 = n8;
    }

    public long getN9() {
        return N9;
    }

    public void setN9(long n9) {
        N9 = n9;
    }

    public long getN10() {
        return N10;
    }

    public void setN10(long n10) {
        N10 = n10;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public List<String> getSourceUrls() {
        return sourceUrls;
    }

    public void setSourceUrls(List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
    }

    public List<PhoneticsData> getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(List<PhoneticsData> phonetics) {
        this.phonetics = phonetics;
    }

    public List<MeaningData> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<MeaningData> meanings) {
        this.meanings = meanings;
    }
}
