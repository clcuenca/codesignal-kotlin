COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

areequallystrong:
	$(COMPILER) areequallystrong.kt $(KOTLINFLAGS) areequallystrong.jar

run:
	java -jar areequallystrong.jar < input.txt

clean:
	rm areequallystrong.jar