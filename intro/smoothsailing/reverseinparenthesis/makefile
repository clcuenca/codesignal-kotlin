COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

reverseinparenthesis:
	$(COMPILER) reverseinparenthesis.kt $(KOTLINFLAGS) reverseinparenthesis.jar

run:
	java -jar reverseinparenthesis.jar < input.txt

clean:
	rm reverseinparenthesis.jar