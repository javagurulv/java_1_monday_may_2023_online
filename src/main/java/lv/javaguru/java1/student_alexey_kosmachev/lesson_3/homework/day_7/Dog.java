package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_7;

class Dog {

     String Nickname;
     int Age;

     Dog(String Nickname, int Age ) {
         this.Nickname = Nickname;
         this.Age = Age;
     }
     String getNickname() {return this.Nickname; }
    int getNewAge() {
         int Birthsday = Age + 1;
    return Birthsday;
    }

    int getPreviousAge() { return this.Age;}




}
