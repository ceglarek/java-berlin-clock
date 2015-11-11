package com.ubs.opsit.interviews;

import org.apache.commons.lang.StringUtils;

/**
 * @author Pawel Ceglik
 */
public class BerlinClock implements TimeConverter
{
   private static final String TIME_SEPARATOR  = ":";

   @Override
   public String convertTime(String aTime)
   {
      Time time = parseTime(aTime);
      if(time == null) {
         return StringUtils.EMPTY;
      }

      return toBerlinClockString(time);
   }

   private Time parseTime(String aTime) {
      if(aTime == null) {
         return null;
      }

      String[] elements = aTime.split(TIME_SEPARATOR);
      if(elements.length != 3) {
         return null;
      }

      int hour = Integer.valueOf(elements[0]);
      int minutes = Integer.valueOf(elements[1]);
      int seconds = Integer.valueOf(elements[2]);

      return new TimeBuilder().withHour(hour).withMinutes(minutes).withSeconds(seconds).build();
   }

   private String toBerlinClockString(Time time) {

      StringBuilder sb = new StringBuilder();
      sb.append(BerlinClockUtil.firstRow(time));
      sb.append("\n");
      sb.append(BerlinClockUtil.secondRow(time));
      sb.append("\n");
      sb.append(BerlinClockUtil.thirdRow(time));
      sb.append("\n");
      sb.append(BerlinClockUtil.fourthRow(time));
      sb.append("\n");
      sb.append(BerlinClockUtil.fifthRow(time));

      return sb.toString();
   }
}
