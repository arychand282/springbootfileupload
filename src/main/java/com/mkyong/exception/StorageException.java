package com.mkyong.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
