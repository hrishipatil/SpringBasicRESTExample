package com.test.spring;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by hpatil on 6/23/16.
 */

@Controller
public class SpringController {

    @RequestMapping(method = {RequestMethod.GET}, value = {"/hello"}, produces = {
           MediaType.APPLICATION_FORM_URLENCODED_VALUE,
          MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_XML_VALUE})
    @ResponseBody
    public static Dummy search() {

           return new Dummy();
    }
}
