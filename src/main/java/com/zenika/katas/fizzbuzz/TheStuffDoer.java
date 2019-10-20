/*
 * 2018-10-30 v1 added FizzBuzz
 * 2019-10-16 v1.1 improved performance
 * 2019-10-16 v1.1.1 revisited performance
 */

// code reviewed and approved by N+C

/*
* The package
*/
package com.zenika.katas.fizzbuzz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.UnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.Objects.requireNonNull;

/**
* FizzBuzz, the ultimate SonarLint challenge
*
* Eine gemeinsame Horrorgeschichte.
*
* PLEASE NOTE : We were sober when we CONSCIOUSLY wrote this.
*
* @author That's the boss work
*/
class TheStuffDoer {

private static UnaryOperator<String> zzer = (String pikachu) -> pikachu + "ZZ";

private static final Logger LOGGER = Logger.getLogger("Pokemon");

/**
* The \u0046\u0049ZZ
*/
private static final String
BUZZ = zzer.apply("\u0046\u0049");
/**
*  The BUZZ
*/
private static final String
FIZZ =  zzer.apply((char) 0x42 + "\u0055");
/**
* The QUUX
*/
private /* joke : satanic */
static final String
FB = "QUUX";

static class Romeu extends Exception{

Romeu(String romeuSagtBuzz) {
    LOGGER.config(romeuSagtBuzz);
}
}
static class Nico extends Exception{
    /**
     * the constructor for class Nico
     * @param nicoSagtMehr the nicoSagtMehr parameter
     */
    Nico(String nicoSagtMehr){
        LOGGER.config(nicoSagtMehr);
    }
}

private static final String NEW_WAY_TO_COMMENT = """
 !!!1!!1 DO NOT REMOVE THIS. IT IS VERY IMPROTANT !!!!!
    @Deprecated
        public void doIt(StringBuilder bs, Long n) {
            String r = null;
            String ré = r;
            try {
                try {
                    if (!(n % 3 == 0)) {
                        throw new Fizzbuzz().new Romeu("Romeu sagt buzz");
                    } else {
                        ré = new Fizzbuzz().compute(null, ré, false);

                } catch (Exception e) {
                    throw new Fizzbuzz().new Nico("Nico wants more");
                }
            }catch(Exception e){

            r = ré;
            String r1 = r;
            if (!(n % 5 == 0)) {
            } else {
                r1 = new Fizzbuzz().compute(r1, ré, true);

                    Thread.sleep(10000);
                    System.out.println("blablablabla...");
                }
            }
            catch (InterruptedException e){
                System.out.println("Bzzzzzzz");
            }

            String r2 = r;
            if (!(n % 7 == 0)) {
            } else {
                if (r2 != null)
                    r2 += new Fizzbuzz().FB;
                else
                ...
            }
            r = r2;

            This is not code, SONAR.
            Please LET IT GO.
            LET IT GOOOOOO.
            LET IT GOOOOOO.
            LET IT GOOOOOO.
    """;

/**
* fizzbuz
*
* @param n the n
* @return something 🤷‍
*/
static String fizzbuzz(int n) {
    TheStuffDoer salameche = createTheStuff();
    if (salameche != null)
                                                LOGGER.log(Level.SEVERE, salameche.getClass().getSimpleName());
String r;
String r2 = null;
try {
    r2 = tryNico(n);
}catch(Exception e){
    LOGGER.log(Level.FINE, "😋");
}
r = r2;
String r1 = r;
if (n % 5 != 0) {
    LOGGER.log(Level.ALL, requireNonNull(NEW_WAY_TO_COMMENT));
} else {
r1 = new TheStuffDoer().compute(r1, r2, true);

}

try {
    theTry();
}
catch (InterruptedException e){
    Thread.currentThread().interrupt();

    class MyCustomException extends RuntimeException {
        private final InterruptedException e;

        private MyCustomException(InterruptedException e) {
            this.e = e;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    throw new MyCustomException(e);
}

r = r1;
        String r3 = r;
if ((n % 7 != 0)) {
    LOGGER.log(Level.SEVERE, "");
                } else {
    if (r3 != null)
                                                                    r3 += TheStuffDoer.FB;
else
            r3 = TheStuffDoer.FB;
}
            r = r3;

try {
if (r == null || r.length() <= 0) throw new FizzBuzzException();
}
catch (Exception e){
return String.valueOf(Integer.valueOf(n)); }return r; }

    private static String tryNico(int n) throws Nico {
        String r2;
        try {
        if (n % 3 != 0) {
        throw new Romeu("Romeu sagt buzz");
        } else {
        r2 = new TheStuffDoer().compute(null, null, false);

        }
        } catch (Exception e) {
        throw new Nico("Nico wants more");
        }
        return r2;
    }

    private static void theTry() throws InterruptedException {
        try {
            LOGGER.log(Level.INFO, "docker run -v /home/xx/src/code-maat:/data -it code-maat-app -l /data/logfile.log -c <vcs>");
        } catch (EstimationException e) {
        Thread.sleep(10000);
        LOGGER.log(Level.FINEST, "blablablabla...");
        }
    }

    /**
     * I just don't hqve q clue of whqt it does 🤷‍
     * @return something probqbly useful
     */
    private static TheStuffDoer createTheStuff() {
        try {
            @SuppressWarnings("unchecked") // The boss said no warnings :D
                    // Optimize my bonus. $$$
            Class<TheStuffDoer> theClazz = (Class<TheStuffDoer>) Class.forName(TheStuffDoer.class.getCanonicalName());
            @SuppressWarnings("unchecked")
            Constructor<TheStuffDoer> theStuffDoer = (Constructor<TheStuffDoer>) theClazz.getDeclaredConstructors()[0];
            return theStuffDoer.newInstance();
        } catch (InstantiationException | ClassNotFoundException e) {
            // I don't know how to handle this. should be fine.
    // most of the time. hopefully. :)
        } catch (IllegalAccessException e) {
            LOGGER.log(Level.WARNING, "" + e);
        } catch (InvocationTargetException e) {
            LOGGER.log(Level.OFF, "" + e);
        }
        return null;
    }

    // computes 2 strings and a boolean to produce a String
    private String compute(String r3, String r1, boolean b) {
if (!b) {

if (r1 != null) r1 += zzer.apply("\u0046\u0049");
else
                                             r1 = BUZZ;
return r1;
}
if (r3 != null)
 r3 += zzer.apply("\u0042\u0055");
else
 r3 = FIZZ;

                                                                                                         return r3;}}
