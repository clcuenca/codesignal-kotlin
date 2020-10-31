COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

commoncharactercount:
	$(COMPILER) commoncharactercount.kt $(KOTLINFLAGS) commoncharactercount.jar

run:
	java -jar commoncharactercount.jar < input.txt

clean:
	rm commoncharactercount.jar