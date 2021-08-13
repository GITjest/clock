
public class Main {

    public static void main(String[] args) {
        if(args.length < 1) {
            throw new IllegalArgumentException("Where is the time?");
        }

        String[] split = args[0].split(":");
        if(split.length < 2) {
            throw new IllegalArgumentException("Incorrect time format");
        }

        try {
            int hour = Integer.parseInt(split[0]);
            int minute = Integer.parseInt(split[1]);
            System.out.println(Clock.angle(hour, minute) + "°");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
