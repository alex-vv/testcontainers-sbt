# Testcontainers example

This project is a simple reproducible case for this issue 
https://github.com/testcontainers/testcontainers-java/issues/584

## Installation

Install sbt https://www.scala-sbt.org/download.html

Install docker https://www.docker.com/community-edition#/download

## Running

Start docker and then start sbt

`$ sbt`

In sbt console run test

`sbt:testcontainers-sbt> test`

Once test is passed, run it again several times in the same sbt session. Note that 
in this configuration sbt uses one JVM for all tests (you can verify a number of java processes running).


Then check `docker ps` output. For each test run there will be a `bsideup/moby-ryuk:0.2.2` container running:

```

CONTAINER ID        IMAGE                     COMMAND             CREATED             STATUS              PORTS                     NAMES
ac1ba98c5b09        bsideup/moby-ryuk:0.2.2   "/app"              1 second ago        Up 7 seconds        0.0.0.0:32992->8080/tcp   testcontainers-ryuk-7220ff90-4218-4f10-aeca-9a922bb93a40
bf7e71c1b0d8        bsideup/moby-ryuk:0.2.2   "/app"              2 minutes ago       Up 2 minutes        0.0.0.0:32990->8080/tcp   testcontainers-ryuk-5a50e3f4-e21b-4ac2-b772-f82488cec0dc
fde9563cefed        bsideup/moby-ryuk:0.2.2   "/app"              2 minutes ago       Up 2 minutes        0.0.0.0:32988->8080/tcp   testcontainers-ryuk-2250bc87-3299-46b8-80ed-6f153584d058
26249c6d57fc        bsideup/moby-ryuk:0.2.2   "/app"              3 minutes ago       Up 3 minutes        0.0.0.0:32986->8080/tcp   testcontainers-ryuk-b0bf213b-8ba4-4240-8f72-be8dac169f06
37ec948e0dad        bsideup/moby-ryuk:0.2.2   "/app"              5 minutes ago       Up 5 minutes        0.0.0.0:32984->8080/tcp   testcontainers-ryuk-0c6690eb-49a2-42dd-bf15-9a170de6f2f6

```