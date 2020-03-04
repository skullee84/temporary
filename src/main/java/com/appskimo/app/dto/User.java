package com.appskimo.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -8259716320464861354L;

    String account;
    String name;
    String amount;

    public Map<String, String> tokens() {
        Map<String, String> tokens = new HashMap<>();
        tokens.put("account", account);
        tokens.put("name", name);
        tokens.put("amount", amount);

        return tokens;
    }

}
