COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

islucky:
	$(COMPILER) islucky.kt $(KOTLINFLAGS) islucky.jar

run:
	java -jar islucky.jar < input.txt

clean:
	rm islucky.jar