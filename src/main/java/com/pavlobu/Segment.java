package com.pavlobu;

import java.util.Map;

/**
 * Created by Pavlo (Paul) Buidenkov on 2020-05-14
 */
public interface Segment {
    String evaluate(Map<String, String> variables);
}
