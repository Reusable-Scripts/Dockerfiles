# Dockerfiles
To store all dockerfiles


<B> POSTGRES: postgresql-centos-Dockerfile </B>

To connect to newly created postgresql container:

docker exec -it postgresql94 psql -U YOUR_USERNAME

Another way to connect to postgresql container with your newly created user:

psql -U YOUR_USERNAME -h $(docker inspect --format {{.NetworkSettings.IPAddress}} postgresql94)

Creating a database and username

You can create a postgresql database and superuser at launch. Use DB_NAME, DB_USER and DB_PASS variables.

docker create -it -p 5432:5432 --name postgresql --env 'DB_USER=YOUR_USERNAME' --env 'DB_PASS=YOUR_PASSWORD' --env 'DB_NAME=YOUR_DATABASE' centos/postgresql

Connection methods:

PostgreSQL client:

docker exec -it postgresql94 psql

Bash:

docker exec -it postgresql94 bash

Create and running a container

Create container:

docker create -it -p 5432:5432 --name postgresql94 centos/postgresql

Start container:

docker start postgresql94

Another way to start a postgresql container:

docker run -d -p 5432:5432 --name postgresql94 centos/postgresql94

