package com.pavlobu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pavlo (Paul) Buidenkov on 2020-05-13
 */
public class Template {

    private Map<String, String> variables;
    private String templateText;

    public Template(String templateText) {
        this.variables = new HashMap<>();
        this.templateText = templateText;
    }

    public void set(String name, String value) {
        this.variables.put(name, value);
    }

    public String evaluate() {
        TemplateParse p = new TemplateParse();
        List<Segment> segments = p.parseSegments(templateText);
        return concatenate(segments);
    }

    private String concatenate(List<Segment> segments) {
        StringBuilder result = new StringBuilder();
        for (Segment segment : segments) {
            result.append(segment.evaluate(variables));
        }
        return result.toString();
    }

    public static boolean isVariable(String segment) {
        return segment.startsWith("${") && segment.endsWith("}");
    }
}
