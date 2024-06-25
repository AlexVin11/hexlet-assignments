package exercise;


import lombok.Getter;

// BEGIN
@Getter
public class NegativeRadiusException extends Exception {

    public NegativeRadiusException(String message) {
        super(message);
    }
}
// END
