package com.distributedlogprocessor.processor.repository;

import com.distributedlogprocessor.processor.model.Log;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LogRepository extends ElasticsearchRepository<Log, String> {
}
