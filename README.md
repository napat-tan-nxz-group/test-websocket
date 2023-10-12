# Template Java Backend Repository

This application aim to be the backend application template 

## Prerequisite

- [Homebrew](https://brew.sh/)
- [SpringBoot 3.1.4](https://start.spring.io/)
- [Java Amazon Corretto 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
- [Apache Maven 3.9.4](https://formulae.brew.sh/formula/maven)
- [Docker CLI & Desktop](https://www.docker.com/products/docker-desktop/)
- [Jetbrains IntelliJ IDEA](https://www.jetbrains.com/help/idea/installation-guide.html)
- [Google Java Format](https://plugins.jetbrains.com/plugin/8527-google-java-format)
- [Conventional Commit](https://plugins.jetbrains.com/plugin/13389-conventional-commit)
- [Commitlint](https://nxzgroup.atlassian.net/wiki/spaces/XCHAN/pages/52330497/Install+CommitLint+with+Husky+in+local)

### How to run

- Start docker container

```shell
docker compose up --build
```

- Check docker image
```shell
docker image ls
```

- Check running container

```shell
docker ps
```

- Close docker container

```shell
docker compose down
```

### CURL

Application Info:

```shell
curl 'http://localhost:8080/actuator'
```

Liveness State:

```shell
curl 'http://localhost:8080/actuator/health/liveness'
```

Readiness State:

```shell
curl 'http://localhost:8080/actuator/health/readiness'
```

API for testing log:

```shell
curl 'http://localhost:8080/api/logs'
```