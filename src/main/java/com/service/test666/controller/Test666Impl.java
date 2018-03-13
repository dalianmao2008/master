package com.service.test666.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-13T09:44:13.540Z")

@RestSchema(schemaId = "test666")
@RequestMapping(path = "/test666", produces = MediaType.APPLICATION_JSON)
public class Test666Impl {

    @Autowired
    private Test666Delegate userTest666Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest666Delegate.helloworld(name);
    }

}
