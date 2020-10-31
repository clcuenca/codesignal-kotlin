COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

addborder:
	$(COMPILER) addborder.kt $(KOTLINFLAGS) addborder.jar

run:
	java -jar addborder.jar < input.txt

clean:
	rm addborder.jar