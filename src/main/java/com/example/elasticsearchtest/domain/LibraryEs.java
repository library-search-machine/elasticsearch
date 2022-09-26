package com.example.elasticsearchtest.domain;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.*;


import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Document(indexName = "library")
@Mapping(mappingPath = "elastic/library-mapping.json")
@Setting(settingPath = "elastic/library-setting.json")
public class LibraryEs {

    @Id
    private Long id;

    private String bookName;


    private String authors;


    private String classNum;

    private String isbn13;

    private String libraryName;

    private String publicationYear;

    private String publisher;

    private String vol;





    public LibraryEs(String bookName,String libraryName,String publisher,String publicationYear,String authors,String classNum,String isbn13,String vol) {

        this.bookName =bookName;
        this.libraryName = libraryName;
        this.publisher = publisher;
        this.publicationYear =publicationYear;
        this.authors = authors;
        this.classNum = classNum;
        this.isbn13 = isbn13;
        this.vol = vol;

    }

}