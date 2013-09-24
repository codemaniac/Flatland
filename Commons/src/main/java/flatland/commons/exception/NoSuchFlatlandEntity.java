/*
 *     ________  __             __      __                            __ 
 *    |        \|  \           |  \    |  \                          |  \
 *    | $$$$$$$$| $$  ______  _| $$_   | $$  ______   _______    ____| $$
 *    | $$__    | $$ |      \|   $$ \  | $$ |      \ |       \  /      $$
 *    | $$  \   | $$  \$$$$$$\\$$$$$$  | $$  \$$$$$$\| $$$$$$$\|  $$$$$$$
 *    | $$$$$   | $$ /      $$ | $$ __ | $$ /      $$| $$  | $$| $$  | $$
 *    | $$      | $$|  $$$$$$$ | $$|  \| $$|  $$$$$$$| $$  | $$| $$__| $$
 *    | $$      | $$ \$$    $$  \$$  $$| $$ \$$    $$| $$  | $$ \$$    $$
 *     \$$       \$$  \$$$$$$$   \$$$$  \$$  \$$$$$$$ \$$   \$$  \$$$$$$$
 *                                                                       
 */

package flatland.commons.exception;

/**
 *
 * @author codemaniac
 */
public final class NoSuchFlatlandEntity extends Exception {

    public NoSuchFlatlandEntity() {
    }

    public NoSuchFlatlandEntity(String message) {
        super(message);
    }

    public NoSuchFlatlandEntity(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchFlatlandEntity(Throwable cause) {
        super(cause);
    }

    public NoSuchFlatlandEntity(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
