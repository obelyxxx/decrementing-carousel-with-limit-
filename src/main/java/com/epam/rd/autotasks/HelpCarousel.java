package com.epam.rd.autotasks;

public class HelpCarousel extends CarouselRun {
    private int actionLimit;

    public HelpCarousel(DecrementingCarousel decrementingCarousel, int actionLimit){
        super();
        this.actionLimit= actionLimit;
    }


    protected final int[] array = DecrementingCarousel.carousel.clone();

    protected int position = 0;

    public int next() {

        if (isFinished() || actionLimit ==0)
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;

            } actionLimit--;
        }


        return array[position++]--;

    }

    public boolean isFinished() {
        for (int el : array )
            if (el >0 && actionLimit>0)
                return false;
        return true;
    }
}
