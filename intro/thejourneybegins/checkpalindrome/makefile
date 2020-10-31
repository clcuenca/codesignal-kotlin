COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

checkpalindrome:
	$(COMPILER) checkpalindrome.kt $(KOTLINFLAGS) checkpalindrome.jar

run:
	java -jar checkpalindrome.jar < input.txt

clean:
	rm checkpalindrome.jar