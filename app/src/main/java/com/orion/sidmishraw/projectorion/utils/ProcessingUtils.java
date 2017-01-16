package com.orion.sidmishraw.projectorion.utils;

/**
 * Created by sidmishraw on 1/15/17.
 */

import com.orion.sidmishraw.projectorion.bo.Entry;

import java.util.ArrayList;
import java.util.List;

/**
 *  Making this utils class a singleton, incase someone wants to use the objects.
 *  Can make do with the methods being static as well.
 */
public class ProcessingUtils extends Object {

    private static ProcessingUtils processingUtils = null;

    private ProcessingUtils() {}

    public static ProcessingUtils getInstance() {

        if ( null == processingUtils ) {

            processingUtils = new ProcessingUtils();
        }

        return processingUtils;
    }


    /**
     * Builds a hashmap from the input text input to the application.
     *
     * @param inputText
     * @return String - The String representation of the Hashmap built from the input
     */
    public String buildHashMap(String inputText) {

        String [] rows = inputText.split("\n");

        List<Entry> entries = new ArrayList<>();

        for ( String row : rows ) {

            String [] rowSplit = row.split(":");

            entries.add(new Entry(rowSplit[0], rowSplit[1]));
        }

        StringBuffer buffer = new StringBuffer();

        for (Entry entry : entries ) {
            buffer.append(entry.toString());
        }

        return buffer.toString();
    }


}
