package com.service.test666.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest666 {

        Test666Delegate test666Delegate = new Test666Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test666Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}