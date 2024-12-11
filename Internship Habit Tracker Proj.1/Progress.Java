import java.util.HashMap;
import java.time.LocalDate;

public class Progress 
{
    private HashMap<LocalDate, Boolean> progress;

    public Progress() 
    {
        this.progress = new HashMap<>();
    }

    public void markProgress(LocalDate date, boolean isComplete) 
    {
        progress.put(date, isComplete);
    }

    public Boolean getProgress(LocalDate date) 
    {
        return progress.getOrDefault(date, false);
    }

    public double getCompletionRate() 
    {
        long completed = progress.values().stream().filter(Boolean::booleanValue).count();
        return (double) completed / progress.size() * 100;
    }
}
