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

import com.google.inject.Inject;
import com.google.inject.Singleton;
import flatland.commons.exception.NoSuchFlatlandEntity;
import flatland.core.creature.Creature;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author codemaniac
 */
@Singleton
public final class Flatland {

    private static final Logger LOG = LoggerFactory.getLogger(Flatland.class);
    private final Space space;
    private final List<Creature> aliveCreatures;

    @Inject
    public Flatland(final Space space) {
        this.space = space;
        aliveCreatures = new ArrayList<>();
        LOG.debug("Flatland created");
        LOG.debug(String.format("Using Space: %s", space));
    }

    public void addCreatureToWorld(final Creature creature) {
        creature.beBorn();
        aliveCreatures.add(creature);
        LOG.debug("Creature added to Flatland");
    }

    public void removeCreatureFromWorld(final Creature creature)
            throws NoSuchFlatlandEntity {
        if (aliveCreatures.contains(creature)) {
            creature.die();
            aliveCreatures.remove(creature);
            LOG.debug("Creature removed from Flatland");
        } else {
            throw new NoSuchFlatlandEntity();
        }
    }

    public Space getSpace() {
        return space;
    }
}
