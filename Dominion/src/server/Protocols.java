/**
 * 
 */
package server;

/**
 * @author Spencer Yoder
 *
 */
public class Protocols {
    /*
     * Protocol lines will be sent separated by newlines
     * Within protocols, separate arguments will be separated by spaces
     * "S 123\n" means a seed of 123
     */
    public static final String NADA = "0";
    public static final String QUIT = "QUIT";
    public static final String SEED = "S";
}
