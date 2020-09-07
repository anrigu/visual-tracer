package com.github.anrigu.random.gen;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureClassLoader;
import java.util.HashSet;
import java.util.Set;

/**
 * A class that limits the available classes for use in the user code
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class SandBoxClassLoader extends SecureClassLoader {
    private static final Logger logger = LoggerFactory.getLogger(SandBoxClassLoader.class);

    private static Set<String> AllowedClasses= new HashSet();


    static {
        AllowedClasses.add("test.Test");
        AllowedClasses.add("test.SearchTest");
        AllowedClasses.add("java.lang.Object");
        AllowedClasses.add("java.lang.System");
        AllowedClasses.add("java.io.PrintStream");
        AllowedClasses.add("submitcode.Sort");
        AllowedClasses.add("submitcode.Search");
        AllowedClasses.add("submitcode.SimpleArray");
        AllowedClasses.add("submitcode.RecordableArray");
    }

    /**
     * Loads allowed classes
     *
     * @param name - The class name
     * @param resolve - If true, resolve the class.
     *
     * @return  The resulting Class object
     * @throws ClassNotFoundException - If the class could not be found
     */
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        if (!AllowedClasses.contains(name)) {
            throw new ClassNotFoundException("Not allowed class " + name);
        }
        return super.loadClass(name, resolve);
    }
    /**
     * Finds a class
     *
     * @param  name - The name of the class
     *
     * @return  The resulting Class object
     * @throws  ClassNotFoundException-If the class could not be found
     *
     */
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("find class : " + name);
        return super.findClass(name);
    }
}
