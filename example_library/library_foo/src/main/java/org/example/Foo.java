package org.example;

import org.springframework.stereotype.Service;

@Service
public class Foo {

    public String makeFooWithBar(Bar bar) {
        return bar.fooBar();
    }
}
