build:
	sbt "project global" clean update coverage test
test:
	sbt "project global" test
