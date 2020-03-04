package com.appskimo.app;

import com.appskimo.app.dto.User;
import com.appskimo.app.utils.StringUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    private static final String TEMPLATE = "<div><p>@account@</p><br/><h1>(@name@)</h1>에게 <strong>@amount@</strong>원을 송금합니다.</div>";

    public static void main(String...args) {
        User user = User.builder().account("skullee84").name("dominic").amount("100,000,000").build();

        String content = StringUtil.templateToContent(user.tokens(), TEMPLATE);

        logger.debug("\n\n{}", content);
    }

}
