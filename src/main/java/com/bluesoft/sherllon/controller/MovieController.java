package com.bluesoft.sherllon.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bluesoft.sherllon.main.Movie;

@Controller
public class MovieController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public @ResponseBody Movie randomMovie(
            @RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Movie(counter.incrementAndGet(),
                            String.format(template, name));
    }

}
