package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    private final String reversedStr;

    ReversedSequence(String str) {
        this.reversedStr = new StringBuilder(str).reverse().toString();
    }

    @Override
    public String toString() {
        return reversedStr;
    }

    @Override
    public int length() {
        return reversedStr.length();
    }

    @Override
    public char charAt(int index) {
        return reversedStr.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedStr.subSequence(start, end);
    }
}
// END
