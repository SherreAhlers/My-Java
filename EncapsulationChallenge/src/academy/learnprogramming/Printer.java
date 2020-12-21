package academy.learnprogramming;

public class Printer {
    // MY VERSION -- NOT QUITE RIGHT :(
//    private int tonerLevel;
//    private int numberOfPages;
//    public boolean isDuplexPrinter;
//
//    public Printer(int tonerLevel, int numberOfPages, boolean isDuplexPrinter) {
//        this.tonerLevel = tonerLevel;
//        this.numberOfPages = numberOfPages;
//        this.isDuplexPrinter = isDuplexPrinter;
//    }
//
//    public void fillUpToner(int tonerLevel) {
//        if(tonerLevel < 100) {
//            this.tonerLevel = 100 - tonerLevel;
//        } else {
//            this.tonerLevel = tonerLevel;
//        }
//    }
//    public boolean duplexPrinter(boolean isDuplexPrinter) {
//        if(isDuplexPrinter) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    // TEACHER VERSION
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            // if result is odd number of pages will now print
            // odd number because of modulo operator
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
