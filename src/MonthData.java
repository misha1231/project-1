class MonthData {
    int [] days = new int[30];
void printDaysAndStepsFromMonth()
{
    for (int i = 0; i < days.length; i++) {
        System.out.println( i+1 + " день: " + days[i]);}
}
    int sumStepsFromMonth()
    {
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum = sum + days[i];
        }
        return sum;
    }
    int maxSteps()
    {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) maxSteps = days[i];
        }
        return maxSteps;
    }
    int bestSeries(int goalByStepsPerDay)
    {
    int ser = 0;
    int maxSer = 0;
        for (int i = 0; i < days.length; i++)
        {
          if (days[i] >= goalByStepsPerDay)  ser = ser + 1;
          else
          {
              if (ser > maxSer) maxSer = ser;
              ser = 0;
          }

        }
        return maxSer;
    }
}