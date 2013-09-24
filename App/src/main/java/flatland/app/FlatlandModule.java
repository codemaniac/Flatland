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
package flatland.app;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 *
 * @author codemaniac
 */
public final class FlatlandModule extends AbstractModule {

    private static final int WORLD_WIDTH = 100;
    private static final int WORLD_HEIGHT = 100;

    @Override
    protected void configure() {
        bindConstant().annotatedWith(Names.named("space_width")).to(WORLD_WIDTH);
        bindConstant().annotatedWith(Names.named("space_height")).to(WORLD_HEIGHT);
    }
}
