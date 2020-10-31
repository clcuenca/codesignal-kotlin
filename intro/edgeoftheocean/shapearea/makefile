COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

shapearea:
	$(COMPILER) shapearea.kt $(KOTLINFLAGS) shapearea.jar

run:
	java -jar shapearea.jar < input.txt

clean:
	rm shapearea.jar