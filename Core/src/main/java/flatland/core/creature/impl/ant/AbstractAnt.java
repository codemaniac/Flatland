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

package flatland.core.creature.impl.ant;

import flatland.core.creature.MovableCreature;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author codemaniac
 */
public abstract class AbstractAnt implements MovableCreature {

    protected final AtomicBoolean isAlive;

    public AbstractAnt() {
        this.isAlive = new AtomicBoolean(Boolean.FALSE);
    }

    @Override
    public void beBorn() {
        this.isAlive.set(Boolean.TRUE);
    }

    @Override
    public void die() {
        this.isAlive.set(Boolean.FALSE);
    }
}