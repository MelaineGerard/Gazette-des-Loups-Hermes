package fr.melaine_gerard.gazettedesloups.commands;

import java.util.Collections;

import fr.blueberry.studio.hermes.api.app.Sender;
import fr.blueberry.studio.hermes.api.commands.Command;

public class NewsCommand extends Command{

    @Override
    public void execute(Sender sender, String[] args) {
        
    }

    @Override
    public String getLabel() {
        return "news";
    }

    @Override
    public String getDescription() {
        return "Allow you to get all the latest news";
    }

    @Override
    public String[] getAliases() {
        return new String[]{"gazette", "newspaper"};
    }
    
}
