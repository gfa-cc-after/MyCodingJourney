public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52


        int codingHoursPerDay = 6;
        int workdaysPerWeek = 5;
        int weeksInSemester = 17;
        int averageWorkHoursPerWeek = 52;

        // Calculate total coding hours
        int totalCodingHours = codingHoursPerDay * workdaysPerWeek * weeksInSemester;

        // Calculate total work hours
        int totalWorkHours = averageWorkHoursPerWeek * weeksInSemester;

        // Calculate the percentage of coding hours
        double percentage = ((double) totalCodingHours / totalWorkHours) * 100;

        // Print the result
        System.out.println("Percentage of coding hours in the semester: " + percentage + "%");




    }
}
