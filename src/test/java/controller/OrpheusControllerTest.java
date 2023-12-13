package controller;

import com.ldts.mythsmists.controller.game.OrpheusController;
import com.ldts.mythsmists.model.Elements.Checkpoint;
import com.ldts.mythsmists.model.Elements.Orpheus;
import com.ldts.mythsmists.model.Elements.Wall;
import com.ldts.mythsmists.model.Position;
import com.ldts.mythsmists.model.game.map.Map;
import com.ldts.mythsmists.gui.GUI;
import com.ldts.mythsmists.viewer.game.OrpheusViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

public class OrpheusControllerTest {

    /*

    Ainda não funcional.
    Tenho de tentar perceber como funciona. Mas parece-me um teste ok.

     */
    private Orpheus orpheus;
    private Map map;
    private OrpheusController controller;


    @BeforeEach
    void createPlayer() {
        orpheus = new Orpheus(10, 10);
        map = new Map(30, 20);
        map.setOrpheus(orpheus);
        map.setWalls(Arrays.asList());
        map.setEnemys(Arrays.asList());
        map.setDracmas(Arrays.asList());
        map.setCheckpoint(new Checkpoint(0,0));
        map.setLookSpace(Arrays.asList());
        map.setRivers(Arrays.asList());
        controller = new OrpheusController(map);
    }

    @Test
    void moveRightEmpty() {
        controller.moveOrpheusRight();
        assertEquals(new Position(6, 5), orpheus.getPosition());
    }


    @Test
    void moveRightNotEmpty() {
        map.setWalls(Arrays.asList(new Wall(6, 5)));
        controller.moveOrpheusRight();
        assertEquals(new Position(5, 5), orpheus.getPosition());
    }

}
