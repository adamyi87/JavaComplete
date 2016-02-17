package com.projekt2501;

import java.util.List;

/**
 * Created by ay-sam on 2/17/16.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
