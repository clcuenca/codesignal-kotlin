COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

alternatingsums:
	$(COMPILER) alternatingsums.kt $(KOTLINFLAGS) alternatingsums.jar

run:
	java -jar alternatingsums.jar < input.txt

clean:
	rm alternatingsums.jar