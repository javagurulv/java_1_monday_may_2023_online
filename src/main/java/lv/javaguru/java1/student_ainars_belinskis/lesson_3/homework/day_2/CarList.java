package lv.javaguru.java1.student_ainars_belinskis.lesson_3.homework.day_2;

class CarList {
    private String autoBrand;
    private String color;
    private double autoPr;

    public CarList(String autoBrand, String color, int autoPr) {
        this.autoBrand = autoBrand;
        this.color = color;
        this.autoPr = autoPr;
    }

        public String getAutoBrand () {
            return autoBrand;
        }

        public void setAutoBrand (String autoBrand){
            this.autoBrand = autoBrand;
        }

        public String getColor () {
            return color;
        }
        public void setColor (String color){
            this.color = color;
        }

        public Double getAutoPr () {
            return autoPr;
        }
        public void setAutoPr ( int autoPr){
            this.autoPr = autoPr;
        }


}

