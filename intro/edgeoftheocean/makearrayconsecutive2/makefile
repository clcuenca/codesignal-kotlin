COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

makearrayconsecutive2:
	$(COMPILER) makearrayconsecutive2.kt $(KOTLINFLAGS) makearrayconsecutive2.jar

run:
	java -jar makearrayconsecutive2.jar < input.txt

clean:
	rm makearrayconsecutive2.jar