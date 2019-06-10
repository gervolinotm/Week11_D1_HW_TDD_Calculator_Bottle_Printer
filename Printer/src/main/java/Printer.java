public class Printer {

    private int numberOfPaperLeft;
    private int tonerVolume;

    public Printer(){
        this.numberOfPaperLeft = 50;
        this.tonerVolume = 30;
    }

    public int numberOfPaper(){
        return this.numberOfPaperLeft;
    }

    public int volumeOfToner(){
        return this.tonerVolume;
    }

    public String print(int numberOfPages, int numberOfCopies){
        int paperUsed = numberOfPages * numberOfCopies;
        if ( this.numberOfPaperLeft >= paperUsed && this.tonerVolume >= paperUsed){
            this.numberOfPaperLeft -= paperUsed;
            this.tonerVolume -= paperUsed;
            return "You have " + this.numberOfPaperLeft + " pieces of paper left and " + this.tonerVolume + " volumes of toner left.";
        } else {
            return "Not Enough Resources!!";
        }
    }
}
