package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{

    public  final  int actionLimit;

    public  DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
         this.actionLimit = actionLimit;
    }


    @Override
    public CarouselRun run() {

        if (!isRun ) {
            isRun = true;
            return new HelpCarousel(this, this.actionLimit);
        }
        return null;
    }
}

