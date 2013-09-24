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

package flatland.core.concept;

/**
 *
 * @author codemaniac
 */
public final class Location {

    private final int x;
    private final int y;

    public Location(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.x;
        hash = 79 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
}
