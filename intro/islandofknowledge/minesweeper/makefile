COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

minesweeper:
	$(COMPILER) minesweeper.kt $(KOTLINFLAGS) minesweeper.jar

run:
	java -jar minesweeper.jar < input.txt

clean:
	rm minesweeper.jar