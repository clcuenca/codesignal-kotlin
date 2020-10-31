COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

centuryfromyear:
	$(COMPILER) centuryfromyear.kt $(KOTLINFLAGS) centuryfromyear.jar

run:
	java -jar centuryfromyear.jar < input.txt

clean:
	rm centuryfromyear.jar