COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

arraymaximaladjacentdifference:
	$(COMPILER) arraymaximaladjacentdifference.kt $(KOTLINFLAGS) arraymaximaladjacentdifference.jar

run:
	java -jar arraymaximaladjacentdifference.jar < input.txt

clean:
	rm arraymaximaladjacentdifference.jar