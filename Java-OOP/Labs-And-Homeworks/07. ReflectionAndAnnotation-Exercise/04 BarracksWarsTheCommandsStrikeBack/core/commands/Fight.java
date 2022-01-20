package BarracksWarsTheCommandsStrikeBack_4.core.commands;

import BarracksWarsTheCommandsStrikeBack_4.interfaces.Repository;
import BarracksWarsTheCommandsStrikeBack_4.interfaces.UnitFactory;

public class Fight extends Command {
    public Fight(String[] date, Repository repository, UnitFactory unitFactory) {
        super(date, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
