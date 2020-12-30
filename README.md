Run the below commands:
docker-compose rm
docker-compose up --build

if you make changes run 'mvn package' and then run 'docker-compose up --build'

URLs:
localhost:80/test
http://localhost:9000/stats - haproxy stats, user name: admin, password: admin

Run this command to start memcached outside docker composed: 'docker run --name sd-memcache --publish 11211:11211  -d memcached'