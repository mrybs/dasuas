package dasuas.world.blocks.distribution;

import arc.graphics.g2d.*;
import arc.util.*;
import mindustry.entities.*;
import mindustry.gen.*;
import mindustry.world.*;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.meta.*;

public class UnderGroundConveyor extends Conveyor{

    private static final float itemSpace = 0.4f;
    private static final int capacity = 3;

    public TextureRegion[][] regions;

    public float speed = 0f;
    public float displayedSpeed = 0f;

    public @Nullable Block junctionReplacement, bridgeReplacement;

    public UnderGroundConveyor(String name) {
        super(name);
        rotate = true;
        update = true;
        group = BlockGroup.transportation;
        hasItems = true;
        itemCapacity = capacity;
        priority = TargetPriority.transport;
        conveyorPlacement = true;
        underBullets = true;

        ambientSound = Sounds.conveyor;
        ambientSoundVolume = 0.0022f;
        unloadable = false;
        noUpdateDisabled = false;
    }
};