package com.epam.pirate.dto;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DTOUtil
{
    public static String dateToPrettyString(Date date)
    {
       SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy, hh:mm");
       return format.format(date);
    }
}
