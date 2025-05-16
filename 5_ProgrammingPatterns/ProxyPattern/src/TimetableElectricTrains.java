import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TimetableElectricTrains implements TimetableTrains{

    @Override
    public String[] getTimetable() {
        ArrayList<String> timetable = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new FileReader(new File("electric_trains.csv")));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                timetable.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return timetable.toArray(new String[timetable.size()]);
    }

    @Override
    public String getTrainDepartureTime(String trainID) {
        String[] timetable = getTimetable();
        for (int i = 0; i < timetable.length; i++) {
            if (timetable[i].startsWith(trainID + ";")) return timetable[i];
        }
        return "";
    }
}
