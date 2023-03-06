package HomeWork7.ui.commands;

import HomeWork7.ui.Console;

public class SortName extends Command
{
    public SortName(Console console) 
    {
        super(console);
    }

    @Override
    public String description() 
    {
        return "Сортировка семьи по имени. ";
    }

    @Override
    public void execute() 
    {
        getConsole().sortFamilyName();     
    }    
}
