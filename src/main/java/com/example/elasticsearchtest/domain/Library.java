package com.example.elasticsearchtest.domain;

import com.example.elasticsearchtest.dto.libraryRequestDto;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Library{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;

    private String authors;
    private String classNum;
    private String isbn13;
    private String libraryName;
    private String publicationYear;
    private String publisher;
    private String vol;





    public static Library from (libraryRequestDto libraryRequestDto){
        return Library.builder()
                .bookName(libraryRequestDto.getBookName())
                .authors(libraryRequestDto.getAuthors())
                .classNum(libraryRequestDto.getClassNum())
                .isbn13(libraryRequestDto.getIsbn13())
                .libraryName(libraryRequestDto.getLibraryName())
                .publicationYear(libraryRequestDto.getPublicationYear())
                .publisher(libraryRequestDto.getPublisher())
                .vol(libraryRequestDto.getVol())

                .build();
    }
}