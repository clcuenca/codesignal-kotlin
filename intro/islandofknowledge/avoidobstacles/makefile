COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

avoidobstacles:
	$(COMPILER) avoidobstacles.kt $(KOTLINFLAGS) avoidobstacles.jar

run:
	java -jar avoidobstacles.jar < input.txt

clean:
	rm avoidobstacles.jar