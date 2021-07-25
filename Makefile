build:
	sbt "project global" clean update test
test:
	sbt "project global" test
