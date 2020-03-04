package com.appskimo.app.utils;

import com.appskimo.app.func.TokenFunc;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class StringUtil {

    private static final Logger logger = LogManager.getLogger(StringUtil.class);

    private static final TokenFunc TOKEN_FUNC = tokens -> "@(" + StringUtils.join(tokens.keySet(), "|") + ")@";

    public static String templateToContent(Map<String, String> tokens, String template) {
        String patternStr = TOKEN_FUNC.apply(tokens);

        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(template);

        StringBuffer sb = new StringBuffer();
        while(matcher.find()) {
            matcher.appendReplacement(sb, tokens.get(matcher.group(1)));
        }
        matcher.appendTail(sb);

        logger.debug("\npatternStr\t{}\ntemplate\t{}\ntokens\t{}", patternStr, template, tokens);

        return sb.toString();
    }

}
