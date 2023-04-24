FROM mysql:latest

ENV LANG C.UTF-8

ENV MYSQL_ROOT_PASSWORD=1234
ENV MYSQL_DATABASE=test_db

RUN echo "[mysqld]" >> /etc/mysql/my.cnf && \
    echo "bind-address=0.0.0.0" >> /etc/mysql/my.cnf

COPY ./person.sql /docker-entrypoint-initdb.d/

EXPOSE 3306
