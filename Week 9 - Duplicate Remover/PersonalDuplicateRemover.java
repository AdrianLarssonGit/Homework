/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author adrian
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    //Solving a lot of problems by storing in a Set, which by design only accept
    //uniqe values.
    private Set<String> words = new LinkedHashSet<String>();
    private int detected = 0;

    @Override
    public void add(String characterString) {
        for (String s : this.words) {

            if (s.equals(characterString)) {
                this.detected++;
            }

        }
        this.words.add(characterString);

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.detected;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.words;
    }

    @Override
    public void empty() {
        this.words.clear();
        this.detected = 0;
    }

}
