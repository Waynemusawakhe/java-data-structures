class CharWrapperClass implements Comparable<CharWrapperClass> {
    private char character;
    private boolean guessed;

    public CharWrapperClass(char character) {
        this.character = character;
        this.guessed = false;
    }

    public char getCharacter() {
        return character;
    }

    public boolean isGuessed() {
        return guessed;
    }

    public void setGuessed(boolean guessed) {
        this.guessed = guessed;
    }

    @Override
    public String toString() {
        return guessed ? String.valueOf(character) : "_";
    }
    
     @Override
    public int compareTo(CharWrapperClass other) {
        return Character.compare(this.character, other.character);
    }
}