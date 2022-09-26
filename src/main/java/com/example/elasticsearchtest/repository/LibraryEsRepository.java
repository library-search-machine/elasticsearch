package com.example.elasticsearchtest.repository;

import com.example.elasticsearchtest.domain.Blog;

import com.example.elasticsearchtest.domain.LibraryEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface LibraryEsRepository extends ElasticsearchRepository<LibraryEs, Long> {
}
