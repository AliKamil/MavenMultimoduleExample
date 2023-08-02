package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bar {

    String bar;

    public String fooBar() {
        return bar + "foo bar";
    }
}
