package com.interview.interview_poc.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasicController {

    // This is the default endpoint
    @RequestMapping()
    public String defaultHello(){
        return "Namaskaar";
    }

    @RequestMapping(value = "/message/hindi")
    public String hindiHelloDefault() {
        return "Namaste";
    }

    @RequestMapping(path = "/message/spanish")
    public String spanishHello() {
        return "Hola!";
    }

    @RequestMapping("/message/multiple")
    @GetMapping(path = "/message/multiples")
    public String multipleHello() {
        return "This returns a multiple message!";
    }

    // multiple uri's mapping by value
    @RequestMapping( value = { "/morning", "/good-morning"})
    public String wishMorning() {
        return "Good Morning";
    }

    //multiple uri's mapping by path
    @RequestMapping( path = { "/night", "/good-night"})
    public String wishNight() {
        return "Good Night";
    }

    //multiple uri's mapping
    @RequestMapping({ "/evening", "/good-evening"})
    public String wishEvening() {
        return "Good Evening";
    }

    // example for handle Request Type specific requests
    @RequestMapping(path = "/get-post", method = {RequestMethod.GET, RequestMethod.POST})
    public String getAndPostMethod() {
        return " We handle only get and post methods";
    }

    @RequestMapping(path = "/delete-patch", method = {RequestMethod.DELETE, RequestMethod.PATCH})
    public String deleteAndPatchMethod() {
        return " We handle only delete and patch methods";
    }

    @RequestMapping(path = "/student", method = RequestMethod.GET, params =
            {"name","age"})
    public String nameAndAge(@RequestParam String name, @RequestParam Integer age) {
        return "Hello my name is " + name + " and my age is " + age;
    }

    @RequestMapping(path = "/student", method = RequestMethod.GET, params =
            {"name","country","!version"} )
    public String nameAndCountry(@RequestParam String name, @RequestParam String country) {
        return "Hello my name is " + name + " and i'm from " + country;
    }

    @RequestMapping(path = "/student", method = RequestMethod.GET, headers =
            {"name","country"} )
    public String nameAndCountryHeader(@RequestHeader String name, @RequestHeader String country) {
        return "Hello my name is " + name + " and i'm from " + country;
    }

    @RequestMapping(path = "/format", consumes = "text/plain")
    public String formatText() {
        return "Hello I only respond to request that has Content-Type as plain/text in header";
    }

    @RequestMapping(path = "/format", consumes = "application/json")
    public String formatJson() {
        return "Hello I only respond to request that has Content-Type as json in header";
    }

    @RequestMapping(path = "/format", produces = "application/json")
    public String produceJson() {
        return "Hello I only respond to request that has Accept as json in header";
    }

    @RequestMapping(path = "/format", produces = "text/plain")
    public String produceText() {
        return "Hello I only respond to request that has Accept as plain/text in header";
    }

    @GetMapping("/special/{id}")
    public String getResponse(@PathVariable Integer id) {
        return "You are fetching for id : " + id;
    }






}
