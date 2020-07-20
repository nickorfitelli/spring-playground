package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello from Spring!";
    }

    @GetMapping("/math/pi")
    public double getIndex() {
        return 3.141592653589793;
    }

//    @GetMapping("/name")
//    public String getName(
//
//            @RequestParam(value = "firstname", required=false, defaultValue = "jean-marc")
//                    String firstName,
//            @RequestParam(value = "lastname", required=false, defaultValue = "julien") String lastName)
//
//    {
//        return "Hello "+firstName+" "+lastName;
//    }


    @RequestMapping("/math/volume/{length}/{width}/{height}")
    public String getIndividualParams(@PathVariable int length, @PathVariable int width, @PathVariable int height) {
        int vol = length*width*height;
        String ret = Integer.toString(vol);
        return "The volume is: " + ret;
    }

}