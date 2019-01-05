package com.calculator.addservice.exceptions;

import com.calculator.addservice.enums.APIResponseCodeENUM;

/**
 * Created by akashdeepnew on 20/12/18.
 */
public class WrongFormatException extends APIBaseException {
    public WrongFormatException() {
        super(APIResponseCodeENUM.WRONG_FORMAT);
    }
}
