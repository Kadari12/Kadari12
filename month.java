BEGIN
  SET month num to 12
  SWITCH(month num)THEN
  START SWITCH
     CASE 1:
        PRINT "JANUARY"
        BREAK
     CASE 2:
        PRINT "FEBRUARY"
        BREAK
     CASE 3:
        PRINT "MARCH"
        BREAK
     CASE 4:
        PRINT "APRIL"
        BREAK
     CASE 5:
        PRINT "MAY"
        BREAK
     CASE 6:
        PRINT  "JUNE"
        BREAK
     CASE 7:
        PRINT  "JULY
        BREAK
     CASE 8:
         PRINT "AUGUST"
        BREAK
     CASE 9:
         PRINT "SEPTEMBER"
        BREAK
     CASE 10:
         PRINT "OCTOBER"
         BREAK
     CASE 11:
         PRINT "NOVEMBER"
         BREAK
     CASE 12:
         PRINT "DECEMBER"
         BREAK
    DEFAULT:
         PRINT "YEAR HAS ONLY 12 MONTHS"
    END SWITCH
END
    
