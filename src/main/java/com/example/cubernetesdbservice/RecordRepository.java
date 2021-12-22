package com.example.cubernetesdbservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "records")
public interface RecordRepository extends PagingAndSortingRepository<RecordEntity, Integer> {
}
