import java.time.LocalDate;

public class Habit 
{
    private String name;
    private String description;
    private LocalDate startDate;
    private int goalDays;                                                                       // Target days for habit completion

    public Habit(String name, String description, LocalDate startDate, int goalDays) 
    {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.goalDays = goalDays;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public LocalDate getStartDate() 
    {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) 
    {
        this.startDate = startDate;
    }

    public int getGoalDays() 
    {
        return goalDays;
    }

    public void setGoalDays(int goalDays) 
    {
        this.goalDays = goalDays;
    }
}