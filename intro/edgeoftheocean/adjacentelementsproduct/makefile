COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

adjacentelementsproduct:
	$(COMPILER) adjacentelementsproduct.kt $(KOTLINFLAGS) adjacentelementsproduct.jar

run:
	java -jar adjacentelementsproduct.jar < input.txt

clean:
	rm adjacentelementsproduct.jar