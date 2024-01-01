# Distributed Log Processor

## Overview
Distributed Log Processor is a suite of microservices designed for efficient log collection, processing, and retrieval. Built with Spring Boot, integrated with Apache Kafka for messaging, and utilizing PostgreSQL for data storage, this system offers a scalable solution for managing large volumes of log data.

### Services
- **Log Collector Service**: Ingests logs from various sources and publishes them to Kafka.
- **Log Processor Service**: Consumes raw logs, processes them, and optionally republishes or stores them.
- **Log Retrieval Service**: Offers API endpoints for searching and retrieving processed logs from PostgreSQL.

## Getting Started

### Prerequisites
- Java JDK 17 or later
- Maven
- Docker
- Apache Kafka
- PostgreSQL

### Installation
Clone the repository:
```bash
git clone https://github.com/Dev-YassineCheracher/Distributed-Log-Processor.git
cd distributed-log-processor
```
## License
This project is licensed under the MIT License - see the LICENSE.md file for details.
