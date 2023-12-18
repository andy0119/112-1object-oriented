class MyTime {
    int hours;
    int minutes;

    MyTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    MyTime(int hours) {
        this.hours = hours;
        this.minutes = 0;
    }

    MyTime() {
        this.hours = 12;
        this.minutes = 0;
    }
}
