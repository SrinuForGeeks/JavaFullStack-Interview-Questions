package com.datageeks;

public class ItemNotFoundException extends  RuntimeException {

    public ItemNotFoundException()
    {

    }
    public ItemNotFoundException(String msg)
    {
        super(msg);
    }
}
