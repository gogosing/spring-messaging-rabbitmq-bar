#!/usr/bin/env bash
docker run -d `# Docker Container 를 Daemon 으로 구동` \
--name rabbitmq `# Docker 관리를 위한 이름을 rabbitmq 로 지정 (개인별 다른 이름 사용 가능)` \
-p 5672:5672 `# Docker Container 외부에서 RabbitMQ 접속을 위한 포트 개방` \
-p 15672:15672 `# Docker Container 외부에서 RabbitMQ 관리 Web UI 접속을 위한 포트 개방` \
rabbitmq:3-management `# 관리 Web UI 가 포함된 RabbitMQ 3.x 최신 버젼을 이용`