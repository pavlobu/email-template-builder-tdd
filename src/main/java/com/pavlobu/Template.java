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
        TemplateParse parser = new TemplateParse();
        List<String> segments = parser.parse(templateText);
        return concatenate(segments);
    }

    private String concatenate(List<String> segments) {
        StringBuilder result = new StringBuilder();
        for (String segment : segments) {
            append(segment, result);
        }
        return result.toString();
    }

//    private String concatenate(List<Segment> segments) {
//        StringBuilder result = new StringBuilder();
//        for (Segment segment : segments) {
//            segment.appendTo(result, variables);
//        }
//        return result.toString();
//    }

    private void append(String segment, StringBuilder result) {
        if (isVariable(segment)) {
            evaluateVariable(segment, result);
        } else {
            result.append(segment);
        }
    }

    private boolean isVariable(String segment) {
        return segment.startsWith("${") && segment.endsWith("}");
    }

    private void evaluateVariable(String segment, StringBuilder result) {
        String var = segment.substring(2, segment.length() - 1);
        if (!variables.containsKey(var)) {
            throw new MissingValueException("No value for " + segment);
        }
        result.append(variables.get(var));
    }

}
