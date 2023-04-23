FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=1234

ENV MYSQL_DATABASE=test_db
#ENV MYSQL_USER=root
#ENV MYSQL_PASSWORD=1234

COPY ./person.sql /docker-entrypoint-initdb.d/

EXPOSE 3306
