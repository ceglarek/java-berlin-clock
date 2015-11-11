package com.ubs.opsit.interviews;

/**
 * @author Pawel Ceglik
 */
public class BerlinClockUtil
{
   public static String firstRow(Time time) {
      return time.getSeconds() % 2 == 0 ? "Y" : "O";
   }

   public static String secondRow(Time time) {
      StringBuilder result = new StringBuilder();
      int positions = time.getHour() / 5;
      for(int i = 0; i < 4; i++) {
         result.append(i < positions ? "R" : "O");
      }
      return result.toString();
   }

   public static String thirdRow(Time time) {
      int positions = time.getHour() % 5;
      StringBuilder result = new StringBuilder();
      for(int i = 0; i < 4; i++) {
         result.append(i < positions ? "R" : "O");
      }
      return result.toString();
   }

   public static String fourthRow(Time time) {

      int minutes = time.getMinutes();

      int positions = minutes / 5;
      StringBuilder result = new StringBuilder();
      for(int i = 0; i < 11; i++) {
         if(i < positions) {
            if(i > 0 && (i+1) % 3 == 0) {
               result.append("R");
            } else {
               result.append("Y");
            }
         } else {
            result.append("O");
         }
      }
      return result.toString();
   }

   public static String fifthRow(Time time) {
      int positions = time.getMinutes() % 5;
      StringBuilder result = new StringBuilder();
      for(int i = 0; i < 4; i++) {
         result.append(i < positions ? "Y" : "O");
      }
      return result.toString();
   }
}
