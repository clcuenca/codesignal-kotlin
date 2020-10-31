COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

isipv4address:
	$(COMPILER) isipv4address.kt $(KOTLINFLAGS) isipv4address.jar

run:
	java -jar isipv4address.jar < input.txt

clean:
	rm isipv4address.jar