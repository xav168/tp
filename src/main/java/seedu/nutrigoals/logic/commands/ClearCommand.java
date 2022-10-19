package seedu.nutrigoals.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.nutrigoals.model.Model;
import seedu.nutrigoals.model.NutriGoals;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Nutrigoals has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setNutriGoals(new NutriGoals());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}