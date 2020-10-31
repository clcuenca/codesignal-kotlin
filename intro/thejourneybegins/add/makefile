COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

add:
	$(COMPILER) add.kt $(KOTLINFLAGS) add.jar

run:
	java -jar add.jar < input.txt

clean:
	rm add.jar