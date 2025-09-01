package com.distributedlogprocessor.processor.service;

import com.distributedlogprocessor.processor.model.Log;
import com.distributedlogprocessor.processor.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LogProcessingService {
    private final LogRepository logRepository;

  public void processLog(Log log) {
      logRepository.save(log);
    }
}
