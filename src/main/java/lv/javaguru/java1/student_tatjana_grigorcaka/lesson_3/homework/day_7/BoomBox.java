package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_3.homework.day_7;

 class BoomBox {
    String model;
    int volumeLevel;
    boolean switchOn;

     public BoomBox(String model) {
         this.model = model;
         this.volumeLevel = 0;
         this.switchOn = false;
     }

    public void switchOn() {this.switchOn = true;
        System.out.println("BoomBox is ON");
    }
        public void increaseVolumeLevel() {
        if (switchOn == true && volumeLevel < 10) {
            this.volumeLevel = volumeLevel + 1;
            System.out.println("Volume = " + volumeLevel);
        } else if (switchOn == true && volumeLevel == 10) {
            System.out.println("Volume level is MAX");
        } else {
            System.out.println("BoomBox is OFF");
        }
    }
    public void turnOff() {
        this.switchOn = false;
        this.volumeLevel = 0;
        System.out.println("BoomBox is OFF");
    }

        public int getVolumeLevel() {
        return volumeLevel;
    }

        public String getModel() {
        return model;
    }

        public boolean getSwitchOn() {
        return switchOn;
    }

}
