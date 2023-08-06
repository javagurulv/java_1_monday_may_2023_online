package lv.javaguru.java1.student_tatjana_grigorcaka.lesson_9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

 class PolicyCreatorExample {

  public static void main(String[] args) {
   InsuredSubObject tv = new InsuredSubObject(
           "TV",
           new BigDecimal("1000.50"),
           List.of(RiskType.FIRE)
   );

   InsuredSubObject fridge = new InsuredSubObject(
           "Fridge",
           new BigDecimal("500.00"),
           List.of(RiskType.FIRE, RiskType.THEFT)
   );

   InsuredSubObject computer = new InsuredSubObject(
           "Computer",
           new BigDecimal("2000.00"),
           List.of(RiskType.FIRE, RiskType.THEFT)
   );

   InsuredSubObject vacuumCleaner = new InsuredSubObject(
           "Vacuum Cleaner",
           new BigDecimal("700.00"),
           List.of(RiskType.FIRE)
   );

   List<InsuredSubObject> subObjects1 = new ArrayList();
   subObjects1.add(tv);
   subObjects1.add(fridge);

   List<InsuredSubObject> subObjects2 = new ArrayList();
   subObjects2.add(computer);
   subObjects2.add(vacuumCleaner);

   InsuredObject object1 = new InsuredObject(
           "House1",
           subObjects1
   );

   InsuredObject object2 = new InsuredObject(
           "House2",
           subObjects2
   );

   List<InsuredObject> objects = new ArrayList();
   objects.add(object1);
   objects.add(object2);

   Policy policy1 = new Policy(
           "LV20-02-100000-5",
           PolicyStatus.REGISTERED,
           objects
   );
  }
}
