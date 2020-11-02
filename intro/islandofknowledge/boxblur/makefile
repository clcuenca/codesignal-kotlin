COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

boxblur:
	$(COMPILER) boxblur.kt $(KOTLINFLAGS) boxblur.jar

run:
	java -jar boxblur.jar < input.txt

clean:
	rm boxblur.jar