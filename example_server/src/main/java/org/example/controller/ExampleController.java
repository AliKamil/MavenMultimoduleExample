package org.example.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Bar;
import org.example.Foo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Validated
@Slf4j
public class ExampleController {

    private final Foo foo;

    @GetMapping("/foo/{input}")
    public String getFoo(@PathVariable String input) {
        Bar bar = new Bar(input);
        return foo.makeFooWithBar(bar);
    }
}
