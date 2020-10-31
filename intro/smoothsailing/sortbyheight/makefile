COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

sortbyheight:
	$(COMPILER) sortbyheight.kt $(KOTLINFLAGS) sortbyheight.jar

run:
	java -jar sortbyheight.jar < input.txt

clean:
	rm sortbyheight.jar