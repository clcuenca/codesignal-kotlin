COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

aresimilar:
	$(COMPILER) aresimilar.kt $(KOTLINFLAGS) aresimilar.jar

run:
	java -jar aresimilar.jar < input.txt

clean:
	rm aresimilar.jar