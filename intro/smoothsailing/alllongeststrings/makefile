COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

alllongeststrings:
	$(COMPILER) alllongeststrings.kt $(KOTLINFLAGS) alllongeststrings.jar

run:
	java -jar alllongeststrings.jar < input.txt

clean:
	rm alllongeststrings.jar