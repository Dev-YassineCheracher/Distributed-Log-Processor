package com.distributedlogprocessor.processor.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigInteger;
@Data
@Document(indexName = "logs")
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String level;

  @Column(nullable = false)
  private String message;

  @Column(nullable = false)
  private String timestamp;

  @Column(nullable = false)
  private String app_name;

  @Column(nullable = false)
  private String process_id;

  @Column(nullable = false)
  private String host;

}
