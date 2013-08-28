/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tonye
 */
public class Cell implements Serializable {

    private ArrayList<Part> parts = new ArrayList<Part>();
    String name = " ";

    public Cell() {
    }

    public void addPart(Part o) {
        parts.add(o);
    }

    public String cellParts(String n) {
        name = n;
        String s = " ";
        for (int i = 0; i < parts.size(); i++) {
            Part p = parts.get(i);
            s = n + " " + p.toString();
            System.out.println("These are the cell parts " + s);
        }
        return s;

    }
}