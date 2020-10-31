COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

almostincreasingsequence:
	$(COMPILER) almostincreasingsequence.kt $(KOTLINFLAGS) almostincreasingsequence.jar

run:
	java -jar almostincreasingsequence.jar < input.txt

clean:
	rm almostincreasingsequence.jar