package com.abc612008.memorize;

import java.util.Vector;

/**
 * Created by Null on 2016-08-20.
 */
public class Data {
    public static Vector<Word> words = new Vector<>();
    public static Vector<String> wordQueue = new Vector<>();
    enum QuestionType { Definition, Audio, Spell, Max };
}
