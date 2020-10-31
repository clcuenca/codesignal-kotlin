COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

palindromerearranging:
	$(COMPILER) palindromerearranging.kt $(KOTLINFLAGS) palindromerearranging.jar

run:
	java -jar palindromerearranging.jar < input.txt

clean:
	rm palindromerearranging.jar