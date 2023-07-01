package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_4.homework.day_4;

 class Stock {

     String companyName;
     int currentPrice;
     int maxPrice;
     int minPrice;

     public Stock(String companyName, int currentPrice) {
         this.companyName = companyName;
         this.currentPrice = currentPrice;
     }

     public void updatePrice(int currentPrice) {
         this.currentPrice = currentPrice;

         if (currentPrice <= minPrice || minPrice == 0) {
             minPrice = currentPrice;
         }
         if (currentPrice >= maxPrice) {
             this.maxPrice = currentPrice;
         }
     }

     public String getPriceInformation() {
         return "Company = " + companyName + ", Current price: " + currentPrice + ", Min Price: " + minPrice + ", Max price: " + maxPrice;
     }
 }

