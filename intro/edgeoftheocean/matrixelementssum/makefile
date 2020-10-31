COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

matrixelementssum:
	$(COMPILER) matrixelementssum.kt $(KOTLINFLAGS) matrixelementssum.jar

run:
	java -jar matrixelementssum.jar < input.txt

clean:
	rm matrixelementssum.jar