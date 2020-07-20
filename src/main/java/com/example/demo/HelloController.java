package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

//    @PostMapping("/math/area/")
//    public String getArea(){
//        return "post";
//    }

    @PostMapping(value = "/math/area/", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getMapParams(@RequestParam Map<String, String> formData) {

        String type = formData.get("type");
        String width = formData.get("width");
        String length = formData.get("length");
        String radius = formData.get("radius");
        String ans = "invalid";

        switch(type) {
            case "circle":
                ans = "vaild";
                break;
            case "rectangle":
                ans = "valid";
                break;
            default:
                return ans;
        }

        return ans;
//        return formData.toString();
    }
}