package com.pavlobu;

/**
 * Created by Pavlo (Paul) Buidenkov on 2020-05-13
 */
public class MissingValueException extends RuntimeException {
    public MissingValueException(String message) {
        super(message);
    }

}
