package dasuasmod;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class dasuas extends Mod{

    public dasuas(){
        Log.info("Loaded Dasuas.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Dasuas");
                dialog.cont.add("Спасибо, что скачали dasuas!").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                //dialog.cont.image(Core.atlas.find("dasuas-icon")).pad(20f).row();
                dialog.cont.button("Закрыть", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}