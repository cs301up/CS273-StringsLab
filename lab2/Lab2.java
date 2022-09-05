/*
 * Lab2.java - defines some methods that perform various string operations
 *
 * For each method, the parameter 'input' is the string typed in
 * by the user; the returned string 'result' is the string that is displayed on the
 * corresponding output field.
 *
 * Your last statement in each method will therefore typically be of the form:
 *   return ... ;
 *
 *
 */

/*
 * class Lab2 - performs string manipulations
 *
 */
public class Lab2 {

    // constructor for the 'Lab2' object.
    //   *** DON'T WORRY IF YOU DON'T UNDERSTAND WHY THIS IS HERE ***
    public Lab2() {
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    // You should modify each of the following methods by replacing the line
    //   return input;
    // with one or more statements that perform the appropriate task.
    //
    ///////////////////////////////////////////////////////////////////////////

    // #0: just trimmed
    public String stringTrim(String input) {
        return input.trim();
    }
    
    // #1: trimmed, converted to upper case
    public String stringUpperCase(String input) {
        return input;
    }
    
    // #2: trimmed, with each '.' character changed to '?'
    public String stringReplacePeriodWithQuestion(String input) {
        return input;
    }

    // #3: trimmed, with trimmed length appended in parentheses
    public String stringAppendLength(String input) {
        return input;
    }
           
    // #4: trimmed, with first 10 characters removed
    public String stringMinusFirstTenChars(String input) {
        return input;
    }

    // #5: trimmed, with last 10 characters removed
    public String stringMinusLastTenChars(String input) {
        return input;
    }
    
    // #6: trimmed, with '-' inserted after first character and also after second
    public String stringInsert(String input) {
        return input;
    }        

    // #7: trimmed, first word only
    public String stringFirstWord(String input) {
        return input;
    }

    // #8: trimmed, with everything except last word converted to lower case
    public String stringLowerCaseExceptLastWord(String input) {
        return input;
    }  
    
    // #9: trimmed, with '...' inserted right in the middle (or slightly to the
    // right if odd number of characters
    public String stringMiddleEllipsis(String input) {
        return input;
    }

    // #10: trimmed, all but the second-to-last word.
    public String stringAllButSecondToLastWord(String input) {
        return input;
    }
   
    
    
    // Extra Credit #1: trimmed, first 3/4 of the string (or slightly more than that if length is not
    // an exact multiple of 4).
    public String stringFirstThreeQuarters(String input) {
        return input;
    }
}
