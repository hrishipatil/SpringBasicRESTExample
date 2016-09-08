package com.test.spring;


import com.test.spring.service.SpringServiceImpl;
import com.wordnik.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

   @Autowired
    SpringServiceImpl service;

    @RequestMapping(method = {RequestMethod.GET}, value = {"/hello"}, produces = {
           MediaType.APPLICATION_FORM_URLENCODED_VALUE,
          MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_XML_VALUE})
    @ApiOperation(value = "Gets dummy response")
    //@ApiErrors(value = {@ApiError(code = 404, reason = "No resources found")})
    @ResponseBody
    public Dummy search() {
       // return service.getData();
return new Dummy();
    }
}
