package com.appskimo.app.func;

import java.util.Map;

@FunctionalInterface
public interface TokenFunc {

    String apply(Map<String, String> tokens);

}
