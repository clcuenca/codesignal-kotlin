COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

arraychange:
	$(COMPILER) arraychange.kt $(KOTLINFLAGS) arraychange.jar

run:
	java -jar arraychange.jar < input.txt

clean:
	rm arraychange.jar