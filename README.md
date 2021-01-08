Run the below commands:
docker-compose rm
mvn package
docker-compose up --build

if you make changes run 'mvn package' and then run 'docker-compose up --build'

URLs:
localhost:80/test
http://localhost:9000/stats - haproxy stats, user name: admin, password: admin

Run this command to start memcached outside docker composed: 'docker run --name sd-memcache --publish 11211:11211  -d memcached'
use this link https://serverfault.com/a/674104 to see memcached server data. you need to download https://raw.githubusercontent.com/memcached/memcached/master/scripts/memcached-tool script and run it in local